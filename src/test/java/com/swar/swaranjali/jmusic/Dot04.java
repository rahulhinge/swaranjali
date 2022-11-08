package com.swar.swaranjali.jmusic;

import jm.music.data.*;
import jm.JMC;
import jm.util.*;
import jm.music.tools.*;

/**
 * Dots and Dashes jMusic Tutorial
 * Example 4
 * @author Andrew Brown
 */
public class Dot04 implements JMC {

    public static void main(String[] args) {
        new Dot04();
    }

    /*
     * Constructor
     */
    public Dot04() {
        Note n = new Note(C4, QUARTER_NOTE);
        Phrase phr = new Phrase(0.0);
        phr.addNote(n);
        Mod.repeat(phr, 15);

        Phrase phr2 = new Phrase(0.0);
        double[] phrase2data = {REST, EIGHTH_NOTE, E4, EIGHTH_NOTE, REST, QUARTER_NOTE};
        phr2.addNoteList(phrase2data);
        Mod.repeat(phr2, 7);

        Phrase phr3 = new Phrase(0.0);
        double[] phrase3data = {REST, QUARTER_NOTE, F4, EIGHTH_NOTE, REST, EIGHTH_NOTE};
        phr3.addNoteList(phrase3data);
        Mod.repeat(phr3, 7);

        Part p = new Part();
        Phrase[] phrases = {phr, phr2, phr3};
        p.addPhraseList(phrases);

        View.sketch(p);
    }
}
