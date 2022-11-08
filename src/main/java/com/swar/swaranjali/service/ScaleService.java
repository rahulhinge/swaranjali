package com.swar.swaranjali.service;

import com.swar.swaranjali.constants.Rhythms;
import jm.constants.Pitches;
import jm.constants.Scales;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static com.swar.swaranjali.constants.Alankars.ALANKAR_KEYS_VAL;

@Service
public class ScaleService {


    public List<Integer> retrieveScaleNotesForNumOfOctaves(String key, String scale, int pitch, int numberOfOctaves) throws Exception {

        Field scaleName = Scales.class.getField(scale);
        int[] scaleFormula = (int[]) scaleName.get(Scales.class);

        Field pitchField = Pitches.class.getField(key + pitch);
        //Integer pitchValue = pitchField.getInt(Pitches.class);
        final AtomicInteger pitchValue = new AtomicInteger(pitchField.getInt(Pitches.class));

        List<List<Integer>> octaveScaleNotes = new ArrayList<>();
        for(int i=1; i<= numberOfOctaves; i++) {
          //  int[] scaleNotes = Arrays.stream(scaleFormula).boxed().map(j -> j+pitchValue.get()).collect(Collectors.toList()).stream().mapToInt(x -> x).toArray();
              List<Integer> scaleNotes = Arrays.stream(scaleFormula).boxed().map(j -> j+pitchValue.get()).collect(Collectors.toList());

            octaveScaleNotes.add(scaleNotes);
            pitchValue.set(pitchValue.get() + 12);
        }


        List<Integer> alaknakUpNotesInScale =
                octaveScaleNotes.stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList());
        return alaknakUpNotesInScale;
    }

    public List<Integer> deriveScaleNotesForUpAlakar(List<String> upAlankarSargam, List<Integer> scaleNotes, int numOfOctaves,
                                                     int alankarCutOffForOctave) {
        //upAlankar param - > //0,  2,   4,   2,   4,   5,   4,   5,   7,   5,   7,   9,   7,   9,   11,   9,   11,   12,    11,   12,   14,   12,   14,   16
        // Making as Set -> 0 2, 4, 5, 7, 9, 11, 12, 14, 16
        List<Integer> upAlankar = upAlankarSargam.stream().map(
                note -> ALANKAR_KEYS_VAL.get(note)).collect(Collectors.toList());
        TreeSet<Integer> sorted = new TreeSet<>(upAlankar);
        int counter = 0;
        Map<Integer, Integer> scaledAlankarNotesSet = new HashMap();
        for(int alankarNotePosition : sorted) {
            try {
                scaledAlankarNotesSet.put(alankarNotePosition, scaleNotes.get(counter) );
            } catch (IndexOutOfBoundsException e) {
                scaledAlankarNotesSet.put(alankarNotePosition, scaleNotes.get(0) +  alankarNotePosition);
            }
            counter++;
        }

        List<Integer> aaroh = upAlankar.stream().map(note -> scaledAlankarNotesSet.get(note)).collect(Collectors.toList());
        if(numOfOctaves == 2) {
            int notesPerBar = aaroh.size()/8;
            List<Integer> secondOctave = aaroh.stream().skip(notesPerBar).map( note -> note+12).collect(Collectors.toList());
            aaroh.addAll(secondOctave);
        }
//        int lastOctaveValue = aaroh.get(0) + 12 * numOfOctaves;
//        //int[] aarohArray = aaroh.stream().filter(num -> num <= lastOctaveValue ).mapToInt(num->num).toArray();
//        List<Integer> aarohList = aaroh.stream().filter(num -> num <= lastOctaveValue ).mapToInt(num->num).boxed().collect(Collectors.toList());
//        int cutOfIndex = aarohList.size();
//        for(int i=0; i<aarohList.size(); i++) {
//
//            if(aarohList.get(i) == lastOctaveValue && aarohList.get(i+1) < lastOctaveValue) {
//                cutOfIndex = i+1;
//                break;
//            }
//        }
//        aarohList = aarohList.subList(0, cutOfIndex);
        if(aaroh.size() > alankarCutOffForOctave) {
            aaroh = aaroh.subList(0, alankarCutOffForOctave);
        }

        return aaroh;
    }

    public List<Integer> deriveScaleNotesForDownAlakar(List<String> downAlankarSargam, List<Integer> scaleNotes,
                                                       int pitchValue, int numOfOctaves, int alankarCutOffForOctave) {
        //downAlankar param - > 12, 11, 9, 11, 9, 7, 9, 7, 5, 7, 5, 4, 5, 4, 2, 4, 2, 0, 2, 0, -1
        // Making as Set -> 12, 11, 9, 7, 5, 4, 2, 0, -1
       // List<Integer> alankarNotesAsList = Arrays.stream(downAlankar).boxed().collect(Collectors.toList());
        //Collections.reverse(alankarNotesAsList);//This is wrong
        List<Integer> downAlankar = downAlankarSargam.stream().map(
                note -> ALANKAR_KEYS_VAL.get(note)).collect(Collectors.toList());
        NavigableSet<Integer> sorted = new TreeSet<>(downAlankar).descendingSet();
        scaleNotes.add(0, pitchValue + 12 * numOfOctaves);


        int counter = 0;
        Map<Integer, Integer> scaledAlankarNotesSet = new HashMap();
        for(int alankarNotePosition : sorted) {
            try {
                scaledAlankarNotesSet.put(alankarNotePosition, scaleNotes.get(counter) );
            } catch (IndexOutOfBoundsException e) {
                scaledAlankarNotesSet.put(alankarNotePosition, (scaleNotes.get(0) - numOfOctaves * 12) +  alankarNotePosition);
            }
            counter++;
        }



        List<Integer> avroh = downAlankar.stream().map(note -> scaledAlankarNotesSet.get(note)).collect(Collectors.toList());
        if(numOfOctaves == 2) {
            int notesPerBar = avroh.size()/8;
            List<Integer> secondOctave = avroh.stream().skip(notesPerBar).map( note -> note-12).collect(Collectors.toList());
            avroh.addAll(secondOctave);
        }
        // int[] aarohArray = avroh.stream().mapToInt(num->num).toArray();
//        int lastOctaveValue = pitchValue;
//        List<Integer> avrohList = avroh.stream().filter(num -> num >= lastOctaveValue ).mapToInt(num->num).boxed().collect(Collectors.toList());
//
//        int cutOfIndex = avrohList.size();
//        for(int i=0; i<avrohList.size(); i++) {
//
//            if(avrohList.get(i) == lastOctaveValue && avrohList.get(i+1) > lastOctaveValue) {
//                cutOfIndex = i+1;
//                break;
//            }
//        }
//        avrohList = avrohList.subList(0, cutOfIndex);
        if(avroh.size() > alankarCutOffForOctave) {
            avroh = avroh.subList(0, alankarCutOffForOctave);
        }
        return avroh;
    }
}
