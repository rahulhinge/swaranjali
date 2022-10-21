package com.swar.swaranjali.service;

import jm.constants.Pitches;
import jm.constants.Scales;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
public class ScaleService {


    public List<Integer> retrieveUpScaleNotesForNumOfOctaves(String key, String scale, int pitch, int numberOfOctaves) throws Exception {

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

//        System.out.println(
//                octaveScaleNotes.stream().map(scaleNotes -> Arrays.stream(scaleNotes)
//                                .mapToObj(Integer::toString)
//                                .collect(Collectors.joining(", ", "{", "}"))
//                ));


//        int []alaknakUpNotesInScale =
//                octaveScaleNotes.stream()
//                        .flatMap(List::stream)
//                        .collect(Collectors.toList()).stream().mapToInt(x -> x).toArray();
        List<Integer> alaknakUpNotesInScale =
                octaveScaleNotes.stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList());
        return alaknakUpNotesInScale;
    }

    public List<Integer> deriveScaleNotesForUpAlakar(List<Integer> upAlankar, List<Integer> scaleNotes, int numOfOctaves) {
        //upAlankar param - > //0,  2,   4,   2,   4,   5,   4,   5,   7,   5,   7,   9,   7,   9,   11,   9,   11,   12,    11,   12,   14,   12,   14,   16
        // Making as Set -> 0 2, 4, 5, 7, 9, 11, 12, 14, 16
       // List<Integer> alankarNotesAsList = Arrays.stream(upAlankar).boxed().collect(Collectors.toList());
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
            List<Integer> secondOctave = aaroh.stream().map( note -> note+12).collect(Collectors.toList());
            aaroh.addAll(secondOctave);
        }
        int lastOctaveValue = aaroh.get(0) + 12 * numOfOctaves;
        //int[] aarohArray = aaroh.stream().filter(num -> num <= lastOctaveValue ).mapToInt(num->num).toArray();
        List<Integer> aarohList = aaroh.stream().filter(num -> num <= lastOctaveValue ).mapToInt(num->num).boxed().collect(Collectors.toList());
        int cutOfIndex = aarohList.size();
        for(int i=0; i<aarohList.size(); i++) {

            if(aarohList.get(i) == lastOctaveValue && aarohList.get(i+1) < lastOctaveValue) {
                cutOfIndex = i+1;
                break;
            }
        }
        aarohList = aarohList.subList(0, cutOfIndex);
        return aarohList;
    }

    public List<Integer> deriveScaleNotesForDownAlakar(List<Integer> downAlankar, List<Integer> scaleNotes, int pitchValue, int numOfOctaves) {
        //downAlankar param - > 12, 11, 9, 11, 9, 7, 9, 7, 5, 7, 5, 4, 5, 4, 2, 4, 2, 0, 2, 0, -1
        // Making as Set -> 12, 11, 9, 7, 5, 4, 2, 0, -1
       // List<Integer> alankarNotesAsList = Arrays.stream(downAlankar).boxed().collect(Collectors.toList());
        //Collections.reverse(alankarNotesAsList);//This is wrong
        NavigableSet<Integer> sorted = new TreeSet<>(downAlankar).descendingSet();
        scaleNotes.add(0, pitchValue + 12 * numOfOctaves);


        int counter = 0;
        Map<Integer, Integer> scaledAlankarNotesSet = new HashMap();
        for(int alankarNotePosition : sorted) {
            try {
                scaledAlankarNotesSet.put(12-alankarNotePosition, scaleNotes.get(counter) );
            } catch (IndexOutOfBoundsException e) {
                scaledAlankarNotesSet.put(12-alankarNotePosition, scaleNotes.get(counter-1) +  alankarNotePosition);
            }
            counter++;
        }

        List<Integer> avroh = downAlankar.stream().map(note -> scaledAlankarNotesSet.get(12 - note)).collect(Collectors.toList());
        if(numOfOctaves == 2) {
            List<Integer> secondOctave = avroh.stream().map( note -> note-12).collect(Collectors.toList());
            avroh.addAll(secondOctave);
        }
        // int[] aarohArray = avroh.stream().mapToInt(num->num).toArray();
        int lastOctaveValue = pitchValue;
        List<Integer> avrohList = avroh.stream().filter(num -> num >= lastOctaveValue ).mapToInt(num->num).boxed().collect(Collectors.toList());

        int cutOfIndex = avrohList.size();
        for(int i=0; i<avrohList.size(); i++) {

            if(avrohList.get(i) == lastOctaveValue && avrohList.get(i+1) > lastOctaveValue) {
                cutOfIndex = i+1;
                break;
            }
        }
        avrohList = avrohList.subList(0, cutOfIndex);
        return avrohList;
    }
}
