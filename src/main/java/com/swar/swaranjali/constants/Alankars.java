package com.swar.swaranjali.constants;


import java.util.List;
import java.util.Map;

import static com.swar.swaranjali.constants.Notes.*;
import static com.swar.swaranjali.constants.Notes.GAh;

public interface Alankars {

    public static final Map<String, Integer> ALANKAR_KEYS_VAL = Map.ofEntries(


            Map.entry(SAl, -12),
            Map.entry(RElk, -11),
            Map.entry(REl, -10),
            Map.entry(GAlk, -9),
            Map.entry(GAl, -8),
            Map.entry(MAl, -7),
            Map.entry(PAlk, -6),


            Map.entry(PAl, -5),
            Map.entry(DHAlk, -4),
            Map.entry(DHAl, -3),
            Map.entry(NEElk, -2),
            Map.entry(NEEl, -1),

            Map.entry(SA, 0),
            Map.entry(REk, 1),
            Map.entry(RE, 2),
            Map.entry(GAk, 3),
            Map.entry(GA, 4),
            Map.entry(MA, 5),
            Map.entry(PAk, 6),
            Map.entry(PA, 7),
            Map.entry(DHAk, 8),
            Map.entry(DHA, 9),
            Map.entry(NEEk, 10),
            Map.entry(NEE, 11),
            Map.entry(SAh, 12), //Octave

            Map.entry(REhk, 13),
            Map.entry(REh, 14),
            Map.entry(GAhk, 15),
            Map.entry(GAh, 16),
            Map.entry(MAh, 17),

            Map.entry(PAhk, 18),
            Map.entry(PAh, 19),
            Map.entry(DHAhk, 20),
            Map.entry(DHAh, 21),
            Map.entry(NEEhk, 22),
            Map.entry(NEEh, 23),
            Map.entry(SAhh, 24)
    );

    public static final Map<Integer, String> VAL_TO_SARGAM = Map.ofEntries(


            Map.entry(-12, SAl ),
            Map.entry(-11, RElk ),
            Map.entry(-10, REl),
            Map.entry(-9, GAlk),
            Map.entry(-8, GAl),
            Map.entry(-7, MAl),
            Map.entry(-6, PAlk),


            Map.entry(-5, PAl),
            Map.entry(-4, DHAlk),
            Map.entry(-3, DHAl),
            Map.entry(-2, NEElk),
            Map.entry(-1, NEEl),

            Map.entry(0, SA),
            Map.entry(1, REk),
            Map.entry(2, RE),
            Map.entry(3, GAk),
            Map.entry(4, GA),
            Map.entry(5, MA),
            Map.entry(6, PAk),
            Map.entry(7, PA),
            Map.entry(8, DHAk),
            Map.entry(9, DHA),
            Map.entry(10, NEEk),
            Map.entry(11, NEE),
            Map.entry(12, SAh), //Octave

            Map.entry(13, REhk),
            Map.entry(14, REh),
            Map.entry(15, GAhk),
            Map.entry(16, GAh),
            Map.entry(17, MAh),

            Map.entry(18, PAhk),
            Map.entry(19, PAh),
            Map.entry(20, DHAhk),
            Map.entry(21, DHAh),
            Map.entry(22, NEEhk),
            Map.entry(23, NEEh),
            Map.entry(24, SAhh)
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
            ),

            Map.entry(
                    "ALK_9",
                    List.of(
                            List.of(
                                    SA,RE,GA, RE,GA,MA,       RE,GA,MA, SA,RE,GA,        RE,GA,MA, GA,MA,PA,
                                    GA,MA,PA, RE,GA,MA,       GA,MA,PA,MA,PA,DHA,        MA,PA,DHA, GA,MA,PA,
                                    MA,PA,DHA,PA,DHA,NEE,     PA,DHA,NEE, MA,PA,DHA,     PA,DHA,NEE,DHA,NEE,SAh,
                                    DHA,NEE,SAh,PA,DHA,NEE,   DHA,NEE,SAh,NEE,SAh,REh,  NEE,SAh,REh,DHA,NEE,SAh,
                                    NEE,SAh,REh,SAh,REh,GAh,  SAh,REh,GAh,NEE,SAh,REh,  SAh,REh,GAh,REh,GAh,MAh,
                                    REh,GAh,MAh,SAh,REh,GAh),
                            List.of(
                                    SAh,NEE,DHA,NEE,DHA,PA,     NEE,DHA,PA,SAh,NEE,DHA,   NEE,DHA,PA,DHA,PA,MA,
                                    DHA,PA,MA,NEE,DHA,PA,       DHA,PA,MA,PA,MA,GA,       PA,MA,GA,DHA,PA,MA,
                                    PA,MA,GA,MA,GA,RE,        MA,GA,RE,PA,MA,GA,          MA,GA,RE,GA,RE,SA,
                                    GA,RE,SA,MA,GA,RE,      GA,RE,SA,RE,SA,NEEl,     RE,SA,NEEl,GA,RE,SA,
                                    RE,SA,NEEl,SA,NEEl,DHAl,   SA,NEEl,DHAl,RE,SA,NEEl, SA,NEEl,DHAl,NEEl,DHAl,PAl,
                                    NEEl,DHAl,PAl, SA,NEEl,DHAl )
                    )
            ),
            Map.entry(
                    "ALK_10",
                    List.of(
                            List.of(
                                    SA,RE,GA,RE,GA,NEEl,SA,        RE,GA,MA,GA,MA,SA,RE,          GA, MA,PA,MA,PA,RE,GA,
                                    MA,PA,DHA,PA,DHA,GA,MA,       PA,DHA,NEE,DHA,NEE,MA,PA,      DHA,NEE,SAh,NEE,SAh,PA,DHA,
                                    NEE,SAh,REh,SAh,REh,DHA,NEE,  SAh,REh,GAh,REh,GAh,NEE,SAh ),
                            List.of(
                                    SAh,NEE,DHA,NEE,DHA,REh,SAh,     NEE,DHA,PA,DHA,PA,SAh,NEE,    DHA,PA,MA,PA,MA,NEE,DHA,
                                    PA,MA,GA,MA,GA,DHA,PA,           MA,GA,RE,GA,RE,PA,MA,        GA,RE,SA,RE,SA,MA,GA,
                                    RE,SA,NEEl,SA,NEEl,GA,RE,        SA,NEEl,DHAl,NEEl,DHAl,RE,SA)
                    )
            ),
            Map.entry(
                    "ALK_11",
                    List.of(
                            List.of(
                                    SA,RE,GA,GA,RE,SA,        RE,GA,MA,MA,GA,RE,          GA, MA,PA,PA,MA,GA,
                                    MA,PA,DHA,DHA,PA,MA,       PA,DHA,NEE,NEE,DHA,PA,      DHA,NEE,SAh,SAh,NEE,DHA,
                                    NEE,SAh,REh,REh,SAh,NEE,  SAh,REh,GAh,GAh,REh,SAh ),
                            List.of(
                                    SAh,NEE,DHA,DHA,NEE,SAh,     NEE,DHA,PA,PA,DHA,NEE,    DHA,PA,MA,MA,PA,DHA,
                                    PA,MA,GA,GA,MA,PA,           MA,GA,RE,RE,GA,MA,        GA,RE,SA,SA,RE,GA,
                                    RE,SA,NEEl,NEEl,SA,RE,        SA,NEEl,DHAl,DHAl,NEEl,SA)
                    )
            ),
            Map.entry(
                    "ALK_12",
                    List.of(
                            List.of(
                                    GA,RE,GA,SA,RE,GA,NEEl,SA,           MA,GA,MA,RE,GA,MA,SA,RE,
                                    PA,MA,PA,GA,MA,PA,RE,GA,             DHA,PA,DHA,MA,PA,DHA,GA,MA,
                                    NEE,DHA,NEE,PA,DHA,NEE,MA,PA,        SAh,NEE,SAh,DHA,NEE,SAh,PA,DHA,
                                    REh,SAh,REh,NEE,SAh,REh,DHA,NEE,     GAh,REh,GAh,SAh,REh,GAh,NEE,SAh
                            ),
                            List.of(
                                    DHA,NEE,DHA,SAh,NEE,DHA,REh,SAh,     PA,DHA,PA,NEE,DHA,PA,SAh,NEE,
                                    MA,PA,MA,DHA,PA,MA,NEE,DHA,          GA,MA,GA,PA,MA,GA,DHA,PA,
                                    RE,GA,RE,MA,GA,RE,PA,MA,             SA,RE,SA,GA,RE,SA,MA,GA,
                                    NEEl,SA,NEEl,RE,SA,NEEl,GA,RE,       DHAl,NEEl,DHAl,SA,NEEl,DHAl,RE,SA
                                    )
                    )
            ),
            Map.entry(
                    "ALK_13",
                    List.of(
                            List.of(
                                    SA,RE,GA,RE,SA,       GA,RE,SA,GA,RE,       RE,GA,MA,GA,RE,        MA,GA,RE,MA,GA,
                                    GA,MA,PA,MA,GA,       PA,MA,GA,PA,MA,       MA,PA,DHA,PA,MA,       DHA,PA,MA,DHA,PA,
                                    PA,DHA,NEE,DHA,PA,    NEE,DHA,PA,NEE,DHA,   DHA,NEE,SAh,NEE,DHA,   SAh,NEE,DHA,SAh,NEE,
                                    NEE,SAh,REh,SAh,NEE,  REh,SAh,NEE,REh,SAh,  SAh,REh,GAh,REh,SAh,   GAh,REh,SAh,GAh,REh
                            ),
                            List.of(
                                    SAh,NEE,DHA,NEE,SAh,   DHA,NEE,SAh,DHA,NEE,  NEE,DHA,PA,DHA,NEE,   PA,DHA,NEE,PA,DHA,
                                    DHA,PA,MA,PA,DHA,      MA,PA,DHA,MA,PA,      PA,MA,GA,MA,PA,       GA,MA,PA,GA,MA,
                                    MA,GA,RE,GA,MA,        RE,GA,MA,RE,GA,       GA,RE,SA,RE,GA,       SA,RE,GA,SA,RE,
                                    RE,SA,NEEl,SA,RE,      NEEl,SA,RE,NEEl,SA,   SA,NEEl,DHAl,NEEl,SA, DHAl,NEEl,SA,DHAl,NEEl
                            )
                    )
            )


    );


}
