package com.swar.swaranjali.controller;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.swar.swaranjali.constants.Notes.*;

public class AlankarBuilder {

    private static final Map<String, Integer> ALANKAR_KEYS_VAL = Map.ofEntries(

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
            Map.entry(GAh, 16)


    );

    private static final List<String> ALK_1_SARGAM_ASC = List.of(
            SA, RE, GA,        RE, GA, MA,      GA, MA, PA,      MA, PA, DHA,
            PA, DHA, NEE,      DHA, NEE, SAh,   NEE, SAh, REh );
    private static final List<String> ALK_1_SARGAM_DSC = List.of(
            SAh, NEE, DHA,     NEE, DHA, PA,    DHA, PA, MA,      PA, MA, GA,
            MA, GA, RE,        GA, RE, SA,      RE, SA, NEEl);



    private static final List<String> ALK_5_SARGAM_ASC = List.of(
            SA, RE, GA, MA,        RE, GA, MA,PA,     GA, MA,PA,DHA,  MA,PA,DHA,NEE,
            PA, DHA, NEE,SAh,      DHA, NEE, SAh,REh, NEE, SAh, REh, GAh );
    private static final List<String> ALK_5_SARGAM_DSC = List.of(
            SAh, NEE, DHA,PA,     NEE, DHA, PA,MA,    DHA, PA, MA,GA,      PA, MA, GA,RE,
            MA, GA, RE,SA,        GA, RE, SA,NEEl,    RE, SA, NEEl, DHAl);


    private static final List<String> ALK_6_SARGAM_ASC = List.of(
            SA, GA, RE, SA,        RE, MA, GA, RE,       GA, PA, MA, GA,     MA, DHA, PA, MA,
            PA, NEE, DHA, PA,      DHA, SAh, NEE, DHA,   NEE, REh, SAh, NEE);
    private static final List<String> ALK_6_SARGAM_DSC = List.of(
            SAh, DHA, NEE, SAh,    NEE, PA, DHA, NEE,    DHA, MA, PA, DHA,  PA, GA, MA, PA,
            MA, RE, GA, MA,        GA, SA, RE, GA,       RE, NEEl, SA, RE
    );


    public static void main(String[] args) {

        List<Integer> alankarAscValList = ALK_5_SARGAM_ASC.stream().map(note -> ALANKAR_KEYS_VAL.get(note)).collect(Collectors.toList());
        System.out.println(
                alankarAscValList.stream()
                        .map(
                                note -> note.toString())
                        .collect(Collectors.joining(", ", "(", ")")));
        List<Integer> alankarDscValList = ALK_5_SARGAM_DSC.stream().map(note -> ALANKAR_KEYS_VAL.get(note)).collect(Collectors.toList());
        System.out.println(
                alankarDscValList.stream()
                        .map(
                                note -> note.toString())
                        .collect(Collectors.joining(", ", "(", ")")));
    }
}
