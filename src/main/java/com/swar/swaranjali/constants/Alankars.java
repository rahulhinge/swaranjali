package com.swar.swaranjali.constants;


import java.util.List;
import java.util.Map;

public interface Alankars {



    public static final Map<String, List<List<Integer>>> ALK_COLLECTION = Map.of(
            "ALK_1",
            List.of(
                    List.of(0, 2, 4, 2, 4, 5, 4, 5, 7, 5, 7, 9, 7, 9, 11, 9, 11, 12, 11, 12, 14),
                    List.of(12, 11, 9, 11, 9, 7, 9, 7, 5, 7, 5, 4, 5, 4, 2, 4, 2, 0, 2, 0, -1)
            ),
            "ALK_2",
            List.of(
                    List.of(0, 2, 4,4, 2, 4, 5,5, 4, 5, 7,7, 5, 7, 9,9, 7, 9, 11,11, 9, 11, 12,12, 11, 12, 14,14),
                    List.of(12, 11, 9,9, 11, 9, 7,7, 9, 7, 5,5, 7, 5, 4,4, 5, 4, 2,2, 4, 2, 0,0, 2, 0, -1, -1)
            ),"ALK_3",
            List.of(
                    List.of(0, 2,2, 4,   2, 4,4, 5,    4, 5,5, 7,  5, 7,7, 9,    7, 9,9, 11,    9, 11,11, 12,  11, 12, 12, 14),
                    List.of(12, 11,11, 9,   11, 9,9, 7,     9, 7,7, 5,   7, 5,5, 4,   5, 4,4, 2,   4, 2,2, 0,  2, 0,0, -1)
            )
    );

//    public default List<int[]> getAlankarByName(String alankarName) {
//        if(Alankars.ALK_COLLECTION.keySet().contains(alankarName)) {
//            return Alankars.ALK_COLLECTION.get(alankarName);
//        }
//        return null;
//    }
}
