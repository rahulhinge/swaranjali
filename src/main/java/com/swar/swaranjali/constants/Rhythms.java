package com.swar.swaranjali.constants;

import java.util.List;
import java.util.Map;

import static jm.constants.Durations.C;
import static jm.constants.Durations.HALF_NOTE;

public interface Rhythms {

    public static final Map<String, Map<Integer, List<Double>>>  RHYTHM_COLLECTION = Map.ofEntries(

            Map.entry(
                    "ALK_0",
                    Map.of( 1, List.of(
                                    C,C,C,C,C,C,C,HALF_NOTE),
                            2, List.of(
                                    C,C,C,C,C,C,C,C,C,C,C,C,C,C,HALF_NOTE))
            ),


            Map.entry(
            "ALK_1",
            Map.of( 1, List.of(
                            C,C,C,  C,C,C,  C,C,C,  C,C,C,
                            C,C,C,  C,C,HALF_NOTE),
                    2, List.of(
                            C,C,C,  C,C,C,  C,C,C,  C,C,C,
                            C,C,C,  C,C,C,  C,C,C,  C,C,C,
                            C,C,C,  C,C,C,  C,C,C,  C,C,C,
                            C,C,HALF_NOTE))
            ),

            Map.entry(
            "ALK_2",
            Map.of( 1, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,HALF_NOTE  ),
                    2, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,HALF_NOTE  ))
            ),

            Map.entry(
            "ALK_3",
            Map.of( 1, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,HALF_NOTE  ),
                    2, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,HALF_NOTE  ))
            ),

            Map.entry(
            "ALK_4",
            Map.of( 1, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,HALF_NOTE  ),
                    2, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,HALF_NOTE  ))
            ),

            Map.entry(
            "ALK_5",
            Map.of( 1, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,HALF_NOTE  ),
                    2, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,HALF_NOTE  ))
            ),

            Map.entry(
            "ALK_6",
            Map.of( 1, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,HALF_NOTE  ),
                    2, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,HALF_NOTE  ))
            ),


            Map.entry(
            "ALK_7",
            Map.of( 1, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,HALF_NOTE  ),
                    2, List.of(
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,C,  C,C,C,C,  C,C,C,C,  C,C,C,C,
                            C,C,C,HALF_NOTE  ))
            ),

            Map.entry(
            "ALK_8",
            Map.of( 1, List.of(
                            C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,HALF_NOTE  ),
                    2, List.of(
                            C,C,C,C,C,C,   C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,C,   C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,C,   C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,HALF_NOTE  ))
            ),

            Map.entry(
            "ALK_9",
            Map.of( 1, List.of(
                            C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,HALF_NOTE  ),
                    2, List.of(
                            C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                            C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,HALF_NOTE
                             ))
            ),

            Map.entry(
                    "ALK_10",
                    Map.of( 1, List.of(
                                    C,C,C,C,C,C,C,  C,C,C,C,C,C,C,  C,C,C,C,C,C,C,
                                    C,C,C,C,C,C,C,  C,C,C,C,C,C,C,  C,C,C,C,C,C,C,
                                    C,C,C,C,C,C,C,  C,C,C,C,C,C,HALF_NOTE  ),
                            2, List.of(
                                    C,C,C,C,C,C,   C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                                    C,C,C,C,C,C,   C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,C,
                                    C,C,C,C,C,C,   C,C,C,C,C,C,  C,C,C,C,C,C,  C,C,C,C,C,HALF_NOTE  ))
            ),

            Map.entry(
            "IDENTIFY",
            Map.of( 1, List.of(C),
                    2, List.of(C,C),
                    3, List.of(C,C,C),
                    4, List.of(C,C,C,C),
                    5, List.of(C,C,C,C,C),
                    6, List.of(C,C,C,C,C,C),
                    7, List.of(C,C,C,C,C,C,C),
                    8, List.of(C,C,C,C,C,C,C,C))
            )
    );

}
