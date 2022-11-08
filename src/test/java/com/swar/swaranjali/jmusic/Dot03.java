package com.swar.swaranjali.jmusic;

import jm.music.data.*;
import jm.JMC;
import jm.util.*;
import jm.music.tools.*;

public class Dot03 implements JMC {
    public static void main(String[] args) {
        Note n = new Note(C4, QUARTER_NOTE);
        Phrase phr = new Phrase(0.0);
        phr.addNote(n);
        Mod.repeat(phr, 15);

        Phrase phr2 = new Phrase(0.0);
        Note r = new Note(REST, EIGHTH_NOTE);
        phr2.addNote(r);
        Note n2 = new Note(E4, EIGHTH_NOTE);
        phr2.addNote(n2);
        Note r2 = new Note(REST, QUARTER_NOTE);
        phr2.addNote(r2);
        Mod.repeat(phr2, 7);

        Part p = new Part();
        p.addPhrase(phr);
        p.addPhrase(phr2);

        View.show(p);
    }
}