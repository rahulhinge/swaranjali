package com.swar.swaranjali.controller;

import com.swar.swaranjali.constants.Alankars;
import com.swar.swaranjali.service.ScaleService;
import jm.constants.Pitches;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

import static com.swar.swaranjali.constants.Formula.*;
import static java.util.Collections.reverse;
import static jm.constants.Durations.C;
import static jm.constants.Durations.HALF_NOTE;
import static jm.constants.ProgramChanges.*;

@RestController
public class SwaranjaliController {

    @Autowired
    ScaleService scaleService;

    @GetMapping("/play")
    public ResponseEntity<List<String>> playAlankar(
            @RequestParam String key,
            @RequestParam String scale,
            @RequestParam int numberOfOctaves,
            @RequestParam int pitch,
            @RequestParam String alankarName,
            @RequestParam int tempo) throws Exception {

        List<Integer> scaleNotes = scaleService.retrieveUpScaleNotesForNumOfOctaves(key, scale, pitch, numberOfOctaves);

        List<List<Integer>> upAndDown = Alankars.ALK_COLLECTION.get(alankarName);


        Field pitchField = Pitches.class.getField(key + pitch);
        int pitchValue = pitchField.getInt(Pitches.class);

        List<Integer> alankar1AscDerived = scaleService.deriveScaleNotesForUpAlakar(upAndDown.get(0), scaleNotes, numberOfOctaves);

        //int[] alankar1DscDerived1 = upAndDown.get(1).stream().map(i -> (i+pitchValue)).collect(Collectors.toList()).stream().mapToInt(x -> x).toArray();
        reverse(scaleNotes);

        List<Integer> alankar1DscDerived = scaleService.deriveScaleNotesForDownAlakar(upAndDown.get(1), scaleNotes, pitchValue, numberOfOctaves);


        System.out.println(
                alankar1AscDerived.stream()
                        .map(note -> ""+note)
                        .collect(Collectors.joining(", ", "{", "}")));

        System.out.println(
                alankar1DscDerived.stream()
                        .map(note -> ""+note)
                        .collect(Collectors.joining(", ", "{", "}")));

//        System.out.println(
//                Arrays.stream(alankar1DscDerived)
//                        .map(i -> (i-60))
//                        .mapToObj(Integer::toString)
//                        .collect(Collectors.joining(", ", "{", "}")));

//        double[] rhythmArray = {C,C,C,C,C,C,C,C,C,C,
//                C,C,C,C,C,C,C,C,C,C,
//                C,C,C,C,C,C,C,C,C,C,
//                C,C,C,C,C,C,C,C,HALF_NOTE};

        double[] rhythmArray = {C,C,C,C,
                C,C,C,C,
                C,C,C,C,
                C,C,C,C,
                C,C,C,C,
                C,C,C,C,
                C,C,C,C,
                C,C,C,C,
                C,C,C,C,
                C,C,C,C,
                C,C,C,C,
                C,C,C,C,
                C,C,C,HALF_NOTE};
        //Ascending
        Phrase phraseAsc = new Phrase(0.0);
        int[] aaroh = alankar1AscDerived.stream().mapToInt(i->i).toArray();
        phraseAsc.addNoteList(aaroh, rhythmArray);
        //Part ascPart = new Part(phraseAsc);
        Part ascPart = new Part("phraseAsc", ACOUSTIC_GRAND);
        ascPart.addPhrase(phraseAsc);

        //Descending Phrase
        Phrase phraseDsc = new Phrase();
        phraseDsc.setStartTime(phraseAsc.getEndTime());
        //Collections.reverse(alankar1AscDerived);
        int[] avroh = alankar1DscDerived.stream().mapToInt(i->i).toArray();
        phraseDsc.addNoteList(avroh, rhythmArray);
        //Part dscPart = new Part(phraseDsc);
        Part dscPart = new Part("phraseDsc", ACOUSTIC_GRAND);
        dscPart.addPhrase(phraseDsc);

        Score score = new Score( key, tempo);
        score.insertPart(ascPart, 0);
        score.insertPart(dscPart, 1);


        Play.midi(score);

        return null;
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
}
