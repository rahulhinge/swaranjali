package com.swar.swaranjali.constants;


import java.util.List;
import java.util.Map;

import static com.swar.swaranjali.constants.Notes.*;
import static com.swar.swaranjali.constants.Notes.GAh;

public interface Alankars {

    public static final Map<String, Integer> ALANKAR_KEYS_VAL = Map.ofEntries(

            Map.entry(PAl, -5),
            Map.entry(DHAl, -3),
            Map.entry(NEEl, -1),

            Map.entry(SA, 0),
            Map.entry(RE, 2),
            Map.entry(GA, 4),
            Map.entry(MA, 5),
            Map.entry(PA, 7),
            Map.entry(DHA, 9),
            Map.entry(NEE, 11),
            Map.entry(SAh, 12), //Octave

            Map.entry(REh, 14),
            Map.entry(GAh, 16),
            Map.entry(MAh, 17)
    );

//  48  50  52         53         55        57             59    60(Derived)
//  C3  D3  E3         F3         G3        A3             B3    C4(Derived)
//  0   2   4          5          7         9              11    12 -UP
//  12  11  9          7          5         4              2     0    -1

    public static final Map<String, List<List<String>>> ALK_SARGAM_COLLECTION = Map.ofEntries(
            Map.entry(
                    "ALK_0",
                    List.of(
                            List.of(SA, RE, GA, MA, PA, DHA, NEE, SAh),

                            List.of(SAh, NEE, DHA, PA, MA, GA, RE, SA)
                    )
            ),
            Map.entry(
                "ALK_1",
                List.of(
                    List.of(SA, RE, GA,        RE, GA, MA,      GA, MA, PA,      MA, PA, DHA,
                            PA, DHA, NEE,      DHA, NEE, SAh,   NEE, SAh, REh,   SAh, REh, GAh),

                     List.of(SAh, NEE, DHA,     NEE, DHA, PA,    DHA, PA, MA,      PA, MA, GA,
                             MA, GA, RE,        GA, RE, SA,      RE, SA, NEEl,     SA, NEEl, DHAl)
                 )
            ),

            Map.entry(
                    "ALK_2",
                    List.of(
                            List.of(SA, RE, GA,GA,       RE, GA, MA,MA,       GA, MA, PA,PA,      MA, PA, DHA,DHA,
                                    PA, DHA, NEE,NEE,    DHA, NEE, SAh,SAh,   NEE, SAh, REh,REh,   SAh, REh, GAh,GAh ),

                            List.of(SAh, NEE, DHA,DHA,  NEE, DHA, PA,PA,    DHA, PA, MA,MA,      PA, MA, GA,GA,
                                    MA, GA, RE,RE,      GA, RE, SA,SA,      RE, SA, NEEl,NEEl,   SA, NEEl, DHAl,DHAl)
                    )
            ),

            Map.entry(
                    "ALK_3",
                    List.of(
                            List.of(SA, RE, RE,GA,       RE, GA, GA,MA,       GA, MA, MA,PA,      MA, PA, PA,DHA,
                                    PA, DHA, DHA,NEE,    DHA, NEE, NEE,SAh,   NEE, SAh, SAh,REh,   SAh, REh, REh,GAh ),

                            List.of(SAh, NEE, NEE,DHA,  NEE, DHA, DHA,PA,    DHA, PA, PA,MA,      PA, MA, MA,GA,
                                    MA, GA, GA,RE,      GA, RE, RE,SA,      RE, SA, SA,NEEl,      SA, NEEl, NEEl,DHAl)
                    )
            ),

            Map.entry(
                    "ALK_4",
                    List.of(
                            List.of(SA, SA, RE,GA,       RE, RE, GA,MA,       GA, GA, MA,PA,      MA, MA, PA,DHA,
                                    PA, PA, DHA,NEE,    DHA, DHA, NEE,SAh,   NEE, NEE, SAh,REh,   SAh, SAh, REh,GAh ),

                            List.of(SAh, SAh, NEE,DHA,  NEE, NEE, DHA,PA,    DHA, DHA, PA,MA,      PA, PA, MA,GA,
                                    MA, MA, GA,RE,      GA, GA, RE,SA,      RE, RE, SA,NEEl,      SA, SA, NEEl,DHAl)
                    )
            ),

            Map.entry(
                    "ALK_5",
                    List.of(
                            List.of(
                                    SA, RE, GA, MA,        RE, GA, MA,PA,     GA, MA,PA,DHA,       MA,PA,DHA,NEE,
                                    PA, DHA, NEE,SAh,      DHA, NEE, SAh,REh, NEE, SAh, REh, GAh,  SAh, REh, GAh, MAh ),
                            List.of(
                                    SAh, NEE, DHA,PA,     NEE, DHA, PA,MA,    DHA, PA, MA,GA,      PA, MA, GA,RE,
                                    MA, GA, RE,SA,        GA, RE, SA,NEEl,    RE, SA, NEEl, DHAl,  SA, NEEl, DHAl,PAl)
                    )
            ),

            Map.entry(
                    "ALK_6",
                    List.of(
                            List.of(
                                    SA, GA, RE, SA,        RE, MA, GA,RE,     GA, PA,MA,GA,       MA, DHA,PA,MA,
                                    PA, NEE,DHA,PA,      DHA,  SAh,NEE,DHA,   NEE, REh,SAh, NEE,  SAh, GAh,REh, SAh ),
                            List.of(
                                    SAh, DHA,NEE,SAh,     NEE, PA,DHA, NEE,    DHA, MA,PA, DHA,      PA, GA,MA, PA,
                                    MA, RE,GA, MA,        GA, SA,RE, GA,       RE, NEEl,SA, RE,     SA, DHAl,NEEl, SA)
                    )
            ),

            Map.entry(
                    "ALK_7",
                    List.of(
                            List.of(
                                    SA, GA, RE, GA,        RE, MA, GA,MA,     GA, PA,MA,PA,       MA, DHA,PA,DHA,
                                    PA, NEE,DHA,NEE,      DHA,  SAh,NEE,SAh,   NEE, REh,SAh, REh,  SAh, GAh,REh, GAh ),
                            List.of(
                                    SAh, DHA,NEE,DHA,     NEE, PA,DHA, PA,    DHA, MA,PA, MA,      PA, GA,MA, GA,
                                    MA, RE,GA, RE,        GA, SA,RE, SA,       RE, NEEl,SA, NEEl,     SA, DHAl,NEEl, DHAl)
                    )
            ),

            Map.entry(
                    "ALK_8",
                    List.of(
                            List.of(
                                    SA,RE,GA,RE,GA,MA,        RE,GA,MA,GA,MA,PA,     GA, MA,PA,MA,PA,DHA,       MA,PA,DHA,PA,DHA,NEE,
                                    PA,DHA,NEE,DHA,NEE,SAh,      DHA,NEE,SAh,NEE,SAh,REh,   NEE,SAh,REh,SAh,REh,GAh,  SAh,REh,GAh,REh,GAh,MAh ),
                            List.of(
                                    SAh,NEE,DHA,NEE,DHA,PA,     NEE,DHA,PA,DHA,PA,MA,    DHA,PA,MA,PA,MA,GA,      PA,MA,GA,MA,GA,RE,
                                    MA,GA,RE,GA,RE,SA,        GA,RE,SA,RE,SA,NEEl,       RE,SA,NEEl,SA,NEEl,DHAl,     SA,NEEl,DHAl,NEEl,DHAl,PAl)
                    )
            )
    );


    public static final List<String> ALK_1_SARGAM_DSC = List.of(
            SAh, NEE, DHA,     NEE, DHA, PA,    DHA, PA, MA,      PA, MA, GA,
            MA, GA, RE,        GA, RE, SA,      RE, SA, NEEl);

    public static final Map<String, List<List<Integer>>> ALK_COLLECTION = Map.of(
            "ALK_1",
            List.of(
                    List.of(0, 2, 4,      2, 4, 5,       4, 5, 7,      5, 7, 9,
                            7, 9, 11,     9, 11, 12,     11, 12, 14),
                    List.of(12, 11, 9,    11, 9, 7,      9, 7, 5,      7, 5, 4,
                            5, 4, 2,      4, 2, 0,       2, 0, -1)
            ),
            "ALK_2",
            List.of(
                    List.of(0, 2, 4,4, 2, 4, 5,5, 4, 5, 7,7, 5, 7, 9,9, 7, 9, 11,11, 9, 11, 12,12, 11, 12, 14,14),
                    List.of(12, 11, 9,9, 11, 9, 7,7, 9, 7, 5,5, 7, 5, 4,4, 5, 4, 2,2, 4, 2, 0,0, 2, 0, -1, -1)
            ),
            "ALK_3",
            List.of(
                    List.of(0, 2,2, 4,   2, 4,4, 5,    4, 5,5, 7,  5, 7,7, 9,    7, 9,9, 11,    9, 11,11, 12,  11, 12, 12, 14),
                    List.of(12, 11,11, 9,   11, 9,9, 7,     9, 7,7, 5,   7, 5,5, 4,   5, 4,4, 2,   4, 2,2, 0,  2, 0, 0, -1)
            ),
            "ALK_4",
            List.of(
                    List.of(0,0,  2, 4,    2,2, 4, 5,   4,4,  5, 7,   5,5, 7, 9,     7,7,  9, 11,   9,9,11, 12,  11, 11,12, 14),
                    List.of(12,12, 11, 9, 11,11, 9, 7, 9,9, 7, 5, 7,7, 5, 4, 5,5, 4, 2, 4,4, 2, 0, 2,2, 0, -1)
            ),
            "ALK_5",
            List.of(
                    List.of(0,2,4,5,      2,4,5,7,   4,5,7,9,     5,7,9,11,
                            7,9,11,12,  9,11,12,14,  11,12,14,16),
                    List.of(12,11,9,7,     11,9,7,5,   9,7,5,4,    7,5,4,2,
                            5,4,2,0,     4,2,0,-1, 2,0,-1, -3)
            ),
            "ALK_6",
            List.of(
                    List.of(0, 4, 2, 0,    2, 5, 4, 2,     4, 7, 5, 4,     5, 9, 7, 5,
                            7, 11, 9, 7,   9, 12, 11, 9,   11, 14, 12, 11),
                    List.of(12, 9, 11, 12, 11, 7, 9, 11, 9, 5, 7, 9, 7, 4, 5, 7, 5, 2, 4, 5, 4, 0, 2, 4, 2, -1, 0, 2)
            )

    );




}
