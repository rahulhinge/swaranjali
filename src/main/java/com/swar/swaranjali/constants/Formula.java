package com.swar.swaranjali.constants;

import java.util.HashMap;
import java.util.Map;

public class Formula {
    public static final String[] notes = { "C","D", "E", "F", "G", "A", "B" };
    public static final String[] majorScale = { "W","W", "H", "W", "W", "W", "H" };
    public static final String[] minorScale = { "W", "H","W","W", "H", "W", "W" };
    public static final String[] melodicMinorScale = { "W", "H","W","W", "W", "W", "H" };
    public static Map<String, String> wholeSteps  = new HashMap<String, String>() {{
        put("C", "D");
        put("D", "E");
        put("E", "F#");
        put("F", "G");
        put("G", "A");
        put("A", "B");
        put("B", "C#");

        put("C#", "D#");
        put("D#", "E#");
        put("E#", "G");//This is F to G
        put("F#", "G#");
        put("G#", "A#");
        put("A#", "C");
        put("B#", "D");//This is C to D

        put("Cb", "Db");
        put("Db", "Eb");
        put("Eb", "F");
        put("Fb", "Gb");
        put("Gb", "Ab");
        put("Ab", "Bb");
        put("Bb", "C");
    }};

    public static Map<String, String> halfSteps  = new HashMap<String, String>() {{
        put("C", "Db");
        put("D", "Eb");
        put("E", "F");
        put("F", "Gb");
        put("G", "Ab");
        put("A", "Bb");
        put("B", "C");

        put("C#", "D");
        put("D#", "E");
        put("E#", "F#");//This is F to F#
        put("F#", "G");
        put("G#", "A");
        put("A#", "B");
        put("B#", "C#");//This is C to C#

        put("Cb", "C§");
        put("Db", "D");
        put("Eb", "Fb");
        put("Fb", "F");//This is E to F
        put("Gb", "G");
        put("Ab", "A");
        put("Bb", "Cb");
    }};
}
