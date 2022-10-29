package com.swar.swaranjali.constants;

import java.util.List;
import java.util.Map;

import static jm.constants.Durations.C;
import static jm.constants.Durations.HALF_NOTE;

public interface Rhythms {

    public static final Map<String, Map<Integer, List<Double>>>  RHYTHM_COLLECTION = Map.of(
            "ALK_1",
            Map.of( 1, List.of(
                            C,C,C,  C,C,C,  C,C,C,  C,C,C,
                            C,C,C,  C,C,HALF_NOTE),
                    2, List.of(
                            C,C,C,  C,C,C,  C,C,C,  C,C,C,
                            C,C,C,  C,C,C,  C,C,C,  C,C,C,
                            C,C,C,  C,C,C,  C,C,C,  C,C,C,
                            C,C,HALF_NOTE)),

            "ALK_2",
            Map.of( 1, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,HALF_NOTE  ),
                    2, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,HALF_NOTE  )),

            "ALK_3",
            Map.of( 1, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,HALF_NOTE  ),
                    2, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,HALF_NOTE  )),

            "ALK_4",
            Map.of( 1, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,HALF_NOTE  ),
                    2, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,HALF_NOTE  )),

            "ALK_5",
            Map.of( 1, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,HALF_NOTE  ),
                    2, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,HALF_NOTE  )),

            "ALK_6",
            Map.of( 1, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,HALF_NOTE  ),
                    2, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,HALF_NOTE  )),

            "ALK_7",
            Map.of( 1, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,HALF_NOTE  ),
                    2, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,HALF_NOTE  )),

            "ALK_8",
            Map.of( 1, List.of(
                            C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,HALF_NOTE  ),
                    2, List.of(
                            C,C,C,C,C,C,   C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,C,   C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,C,   C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,HALF_NOTE  )),

            "IDENTIFY",
            Map.of( 1, List.of(C),
                    2, List.of(C,C),
                    3, List.of(C,C,C),
                    4, List.of(C,C,C,C),
                    5, List.of(C,C,C,C,C),
                    6, List.of(C,C,C,C,C,C),
                    7, List.of(C,C,C,C,C,C,C),
                    8, List.of(C,C,C,C,C,C,C,C))
    );

}
