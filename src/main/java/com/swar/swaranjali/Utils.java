package com.swar.swaranjali;

import java.util.List;
import java.util.stream.Collectors;

import static com.swar.swaranjali.constants.Alankars.VAL_TO_SARGAM;

public class Utils {

    public static String printNotes(List<Integer> listOfNotes, int tonicNote) {
        String aaroh =                 listOfNotes.stream()
                .map(
                        note -> getSargamName(note - tonicNote))

                .collect(Collectors.joining(", ", "{", "}"));
       // System.out.println(aaroh);
        return aaroh;
    }

    private static String getSargamName(int noteKey) {
        String noteNameToReturn = "NOT_FOUND";
        if(VAL_TO_SARGAM.containsKey(noteKey)) {
            return VAL_TO_SARGAM.get(noteKey);
        }
        return noteNameToReturn;
    }
}
