package com.swar.swaranjali.jmusic;

import jm.music.data.*;
import jm.JMC;
import jm.util.*;
//import qt.QTPlayer;
import jm.music.tools.*;

public class Dot05 implements JMC {
    private static Score aScore = new Score("Composition 101");
    private static int partCounter = 0;

    public static void main(String[] args) {
        new Dot05();
    }

    public Dot05() {
        double[] n = {C4, QUARTER_NOTE};
        notesToPart(n, 0.0, 23, CLARINET);

        double[] phrase2data = {REST, EIGHTH_NOTE, E4, EIGHTH_NOTE,
                REST, QUARTER_NOTE};
        notesToPart(phrase2data, 4.0, 9, FLUTE);

        double[] phrase3data = {REST, QUARTER_NOTE, F4, EIGHTH_NOTE,
                REST, EIGHTH_NOTE};
        notesToPart(phrase3data, 8.0, 7, NYLON_GUITAR);

        View.show(aScore);
       // QTPlayer.display(aScore);
    }

    private static void notesToPart(double[] notes,
                                    double startTime, int repeats, int instrument) {
        // create a new phrase from the notes and loop it
        Phrase aPhrase = new Phrase(startTime);
        aPhrase.addNoteList(notes);
        Mod.repeat(aPhrase, repeats);
        // create a new part and add the phrase to it
        Part aPart = new Part("Part "+ partCounter,
                instrument, partCounter);
        aPart.addPhrase(aPhrase);
        // keep track of how many parts have been created
        partCounter++;
        // add the part to the score
        aScore.addPart(aPart);
    }
}
