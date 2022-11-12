package com.swar.swaranjali.controller;

import com.swar.swaranjali.constants.Alankars;
import com.swar.swaranjali.constants.Rhythms;
import com.swar.swaranjali.service.ScaleService;
import jm.constants.Pitches;
import jm.constants.ProgramChanges;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;
import jm.util.View;
import jm.util.Write;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

import static com.swar.swaranjali.constants.Alankars.VAL_TO_SARGAM;
import static com.swar.swaranjali.constants.Formula.*;
import static java.util.Collections.reverse;

@RestController
public class SwaranjaliController {

    @Autowired
    ScaleService scaleService;

    @GetMapping("/play")
    public ResponseEntity<List<List<Integer>>> playAlankar(
            @RequestParam String key,
            @RequestParam String scale,
            @RequestParam int numberOfOctaves,
            @RequestParam int pitch,
            @RequestParam List<String> alankarNameList,
            @RequestParam int tempo,
            @RequestParam String instrument,
            @RequestParam boolean playMidi) throws Exception {

        Thread.sleep(1000);
        List<List<Integer>>  output = new ArrayList<>();
        for(String alankarName : alankarNameList) {
            //Retrieve the scale notes for number of Octaves
            List<Integer> scaleNotes = scaleService.retrieveScaleNotesForNumOfOctaves(key, scale, pitch, 1);
            List<Integer> previousOctaveScaleNotes = scaleNotes.stream().limit(scaleNotes.size()-1).map(note -> note - 12).collect(Collectors.toList());
            List<Integer> nextOctaveScaleNotes = scaleNotes.stream().skip(1).map(note -> note + 12).collect(Collectors.toList());

           List threeOctaveNotes = new ArrayList();
           threeOctaveNotes.addAll(previousOctaveScaleNotes);
           threeOctaveNotes.addAll(scaleNotes);
           //if(numberOfOctaves == 1) {
               threeOctaveNotes.addAll(nextOctaveScaleNotes);
          // }


            List<List<String>> arovaAndAvrohaList = Alankars.ALK_SARGAM_COLLECTION.get(alankarName);

            //  List<List<Integer>> upAndDownAlankar = Alankars.ALK_COLLECTION.get(alankarName);

            Field pitchField = Pitches.class.getField(key + pitch);
            int pitchValue = pitchField.getInt(Pitches.class);

            Map<Integer, List<Double>> octaveRhythm = Rhythms.RHYTHM_COLLECTION.get(alankarName);
            double[] rhythmArray = octaveRhythm.get(numberOfOctaves).stream().mapToDouble(i->i).toArray();

            List<Integer> alankar1AscDerived = scaleService.deriveScaleNotesForUpAlakar(
                    arovaAndAvrohaList.get(0), threeOctaveNotes, numberOfOctaves, rhythmArray.length);

            reverse(threeOctaveNotes);

            List<Integer> alankar1DscDerived = scaleService.deriveScaleNotesForDownAlakar(
                    arovaAndAvrohaList.get(1), threeOctaveNotes, pitchValue, numberOfOctaves, rhythmArray.length);

            printNotes(alankar1AscDerived, pitchValue);
            //printNotes(alankar1AscDerived);
            printNotes(alankar1DscDerived, pitchValue);
            //printNotes(alankar1DscDerived);

            Field instrumentField = ProgramChanges.class.getField(instrument);
            int instrumentValue = instrumentField.getInt(ProgramChanges.class);
            //Ascending
            Phrase phraseAsc = new Phrase(0.0);
            int[] aaroh = alankar1AscDerived.stream().mapToInt(i->i).toArray();
            phraseAsc.addNoteList(aaroh, rhythmArray);
            //Part ascPart = new Part(phraseAsc);
            Part ascPart = new Part("phraseAsc", instrumentValue);
            ascPart.addPhrase(phraseAsc);

            //Descending Phrase
            Phrase phraseDsc = new Phrase();
            phraseDsc.setStartTime(phraseAsc.getEndTime());
            //Collections.reverse(alankar1AscDerived);
            int[] avroh = alankar1DscDerived.stream().mapToInt(i->i).toArray();
            phraseDsc.addNoteList(avroh, rhythmArray);
            //Part dscPart = new Part(phraseDsc);
            Part dscPart = new Part("phraseDsc", instrumentValue);
            dscPart.addPhrase(phraseDsc);

            Score score = new Score( key, tempo);
            score.addPart(ascPart);
            score.addPart(dscPart);


           // View.sketch(score);
         //   Write.midi(score, "alk-9.mid");
            if(playMidi) {
                Play.midi(score, false);
            }


            output.add(alankar1AscDerived);
            output.add(alankar1DscDerived);


        }
        return ResponseEntity.ok(output);
    }


//    @GetMapping("/play")
//    public ResponseEntity<List<String>> playAlankar(
//            @RequestParam String key,
//            @RequestParam String scale,
//            @RequestParam int numberOfOctaves,
//            @RequestParam int pitch,
//            @RequestParam List<String> alankarNameList,
//            @RequestParam int tempo,
//            @RequestParam String instrument) throws Exception {
//
//        Thread.sleep(1000);
//        for(String alankarName : alankarNameList) {
//            //Retrieve the scale notes for number of Octaves
//            List<Integer> scaleNotes = scaleService.retrieveScaleNotesForNumOfOctaves(key, scale, pitch, numberOfOctaves);
//
//            List<List<String>> arovaAndAvrohaList = Alankars.ALK_SARGAM_COLLECTION.get(alankarName);
//
//            //  List<List<Integer>> upAndDownAlankar = Alankars.ALK_COLLECTION.get(alankarName);
//
//            Field pitchField = Pitches.class.getField(key + pitch);
//            int pitchValue = pitchField.getInt(Pitches.class);
//
//            Map<Integer, List<Double>> octaveRhythm = Rhythms.RHYTHM_COLLECTION.get(alankarName);
//            double[] rhythmArray = octaveRhythm.get(numberOfOctaves).stream().mapToDouble(i->i).toArray();
//
//            List<Integer> alankar1AscDerived = scaleService.deriveScaleNotesForUpAlakar(
//                    arovaAndAvrohaList.get(0), scaleNotes, numberOfOctaves, rhythmArray.length);
//
//            reverse(scaleNotes);
//
//            List<Integer> alankar1DscDerived = scaleService.deriveScaleNotesForDownAlakar(
//                    arovaAndAvrohaList.get(1), scaleNotes, pitchValue, numberOfOctaves, rhythmArray.length);
//
//            printNotes(alankar1AscDerived);
//            printNotes(alankar1DscDerived);
//
//            Field instrumentField = ProgramChanges.class.getField(instrument);
//            int instrumentValue = instrumentField.getInt(ProgramChanges.class);
//            //Ascending
//            Phrase phraseAsc = new Phrase(0.0);
//            int[] aaroh = alankar1AscDerived.stream().mapToInt(i->i).toArray();
//            phraseAsc.addNoteList(aaroh, rhythmArray);
//            //Part ascPart = new Part(phraseAsc);
//            Part ascPart = new Part("phraseAsc", instrumentValue);
//            ascPart.addPhrase(phraseAsc);
//
//            //Descending Phrase
//            Phrase phraseDsc = new Phrase();
//            phraseDsc.setStartTime(phraseAsc.getEndTime());
//            //Collections.reverse(alankar1AscDerived);
//            int[] avroh = alankar1DscDerived.stream().mapToInt(i->i).toArray();
//            phraseDsc.addNoteList(avroh, rhythmArray);
//            //Part dscPart = new Part(phraseDsc);
//            Part dscPart = new Part("phraseDsc", instrumentValue);
//            dscPart.addPhrase(phraseDsc);
//
//            Score score = new Score( key, tempo);
//            score.insertPart(ascPart, 0);
//            score.insertPart(dscPart, 1);
//
//
//            Write.midi(score, "alk-5.mid");
//            Play.midi(score, false);
//
//        }
//
//
//        return null;
//    }

    @GetMapping("/identify")
    public ResponseEntity<List<String>> identify(
            @RequestParam String key,
            @RequestParam String scale,
            @RequestParam int numberOfOctaves,
            @RequestParam int pitch,
            @RequestParam String alankarName,
            @RequestParam int tempo,
            @RequestParam String instrument,
            @RequestParam int numberOfRandomNotes) throws Exception {

        List<Integer> scaleNotes = scaleService.retrieveScaleNotesForNumOfOctaves(key, scale, pitch, numberOfOctaves);

        List<Integer> randomNotesList = getRandomNotesList(scaleNotes, numberOfRandomNotes);
        printNotes(randomNotesList);

        Map<Integer, List<Double>> octaveRhythm = Rhythms.RHYTHM_COLLECTION.get(alankarName);
        double[] rhythmArray = octaveRhythm.get(numberOfRandomNotes).stream().mapToDouble(i->i).toArray();

        Field instrumentField = ProgramChanges.class.getField(instrument);
        int instrumentValue = instrumentField.getInt(ProgramChanges.class);
        //Ascending
        Phrase phraseAsc = new Phrase(0.0);
        int[] randomNotesArray = randomNotesList.stream().mapToInt(i->i).toArray();
        phraseAsc.addNoteList(randomNotesArray, rhythmArray);
        //Part ascPart = new Part(phraseAsc);
        Part ascPart = new Part("phraseAsc", instrumentValue);
        ascPart.addPhrase(phraseAsc);


        Score score = new Score( key, tempo);
        score.insertPart(ascPart, 0);



        Play.midi(score, false);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter to repeat");

        int exit = myObj.nextInt();
        while(true) {
            if(exit == 0) {
                break;
            }
            printNotes(randomNotesList);
            Thread.sleep(1000);
            Play.midi(score, false);
            exit = myObj.nextInt();
        }

        return null;
    }

    @GetMapping("/choice_identify")
    public ResponseEntity<List<String>> choice_identify(
            @RequestParam String key,
            @RequestParam String scale,
            @RequestParam int numberOfOctaves,
            @RequestParam int pitch,
            @RequestParam String alankarName,
            @RequestParam int tempo,
            @RequestParam String instrument,
            @RequestParam List<String> notesToPlay) throws Exception {

        Field pitchField = Pitches.class.getField(key + pitch);
        int pitchValue = pitchField.getInt(Pitches.class);

        List<Integer> scaleNotes = scaleService.retrieveScaleNotesForNumOfOctaves(key, scale, pitch, numberOfOctaves);
        scaleNotes.add(pitchValue + 12 * numberOfOctaves);
        List<String> scaleNotesByName = scaleNotes.stream().map(note -> getNoteName(note)).collect(Collectors.toList());

        List<Integer> selectedNotesList = getSelectedNotesList(scaleNotesByName, notesToPlay);
        printNotes(selectedNotesList);

        Map<Integer, List<Double>> octaveRhythm = Rhythms.RHYTHM_COLLECTION.get(alankarName);
        double[] rhythmArray = octaveRhythm.get(notesToPlay.size()).stream().mapToDouble(i->i).toArray();

        Field instrumentField = ProgramChanges.class.getField(instrument);
        int instrumentValue = instrumentField.getInt(ProgramChanges.class);
        //Ascending
        Phrase phraseAsc = new Phrase(0.0);
        int[] randomNotesArray = selectedNotesList.stream().mapToInt(i->i).toArray();
        phraseAsc.addNoteList(randomNotesArray, rhythmArray);
        //Part ascPart = new Part(phraseAsc);
        Part ascPart = new Part("phraseAsc", instrumentValue);
        ascPart.addPhrase(phraseAsc);


        Score score = new Score( key, tempo);
        score.insertPart(ascPart, 0);



        Play.midi(score, false);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter to repeat");

        int exit = myObj.nextInt();
        while(true) {
            if(exit == 0) {
                break;
            }
            printNotes(selectedNotesList);
            Thread.sleep(1000);
            Play.midi(score, false);
            exit = myObj.nextInt();
        }

        return null;
    }

    public List<Integer> getSelectedNotesList(List<String> listOfScaleNotes, List<String> listOfSelectedNotes) throws Exception {
        Collections.shuffle(listOfScaleNotes);
        Collections.shuffle(listOfSelectedNotes);
        List<Integer> selectedNotesList = new ArrayList();
        for(String selectedNoteName : listOfSelectedNotes) {
            for(String scaleNoteName : listOfScaleNotes) {
                if(scaleNoteName.startsWith(selectedNoteName)) {
                    Field pitchField = Pitches.class.getField(scaleNoteName);
                    int pitchValue = pitchField.getInt(Pitches.class);
                    selectedNotesList.add(pitchValue);
                    break;
                }
            }
        }
        return selectedNotesList;
    }

    public List<Integer> getRandomNotesList(List<Integer> listOfNotes, int numberOfRandomNotes) {
        List<Integer> randomNotesList = new ArrayList();
        for(int i=0; i<numberOfRandomNotes; i++) {
            int randomNum =  (int) ((Math.random() * ((listOfNotes.size()) - 0)) + 0);
            randomNotesList.add(listOfNotes.get(randomNum));
        }
        return randomNotesList;
    }

    public ResponseEntity<List<String>> getScale(String key, String scaleVal) {
        List<String> result = new ArrayList<>();
        final String[] runningNote = {new String(key)};
        result.add(key);
        String[] scale = null;
        if(scaleVal.equalsIgnoreCase("major")) {
            scale = majorScale;
        } else if(scaleVal.equalsIgnoreCase("minor")) {
            scale = minorScale;
        } else if(scaleVal.equalsIgnoreCase("melodicMinor")) {
            scale = melodicMinorScale;
        }
        Arrays.stream(scale).forEach(step -> {
            if(step.equalsIgnoreCase("W")) {
                getNote(result, runningNote, wholeSteps);
            }

            if(step.equalsIgnoreCase("H")) {
                getNote(result, runningNote, halfSteps);
            }
        });
        System.out.println(result);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    private void getNote(List<String> result, String[] runningNote, Map<String, String> wholeSteps) {
        String note = wholeSteps.get(runningNote[0]);
        result.add(note);
        runningNote[0] = note;
    }

    private void printNotes(List<Integer> listOfNotes, int tonicNote) {
        System.out.println(
                listOfNotes.stream()
                        .map(
                                note -> getSargamName(note - tonicNote))

                        .collect(Collectors.joining(", ", "{", "}")));
    }

    private void printNotes(List<Integer> listOfNotes) {
        System.out.println(
                listOfNotes.stream()
                        .map(
                                note -> getNoteName(note))

                        .collect(Collectors.joining(", ", "{", "}")));
    }

    private String getSargamName(int noteKey) {
        String noteNameToReturn = "NOT_FOUND";
        if(VAL_TO_SARGAM.containsKey(noteKey)) {
            return VAL_TO_SARGAM.get(noteKey);
        }
        return noteNameToReturn;
    }

    private String getNoteName(int noteValue) {
        String noteNameToReturn = "NOT_FOUND";
        try {
            Field[] pitchFields = Pitches.class.getDeclaredFields();
            List<String> noteNames = new ArrayList<>();
            for(Field field : pitchFields) {
                if(field.getInt(Pitches.class) == noteValue) {
                    noteNames.add(field.getName());
                }
            }
            for(String noteName : noteNames) {
                if(noteName.length() == 2) {
                    noteNameToReturn = noteName;
                    break;
                }
            }
        } catch (Exception e) {

        }
        return noteNameToReturn;
    }
}
