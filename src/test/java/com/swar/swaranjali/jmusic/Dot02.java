package com.swar.swaranjali.jmusic;

import jm.music.data.*;
import jm.JMC;
import jm.util.*;
import jm.music.tools.*;

public class Dot02 implements JMC {
    public static void main(String[] args) {
        Note n = new Note(C4, QUARTER_NOTE);
        Phrase phr = new Phrase();
        phr.addNote(n);

        Mod.repeat(phr, 15);

        View.notate(phr);
    }
}
