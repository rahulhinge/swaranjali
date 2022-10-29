package com.swar.swaranjali.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.swar.swaranjali.constants.Alankars.ALANKAR_KEYS_VAL;

@Service
public class AlankarService {

    public List<Integer> getAlankarAscValList(List<String> alankarAscStringList) {
        List<Integer> alankarAscValList = alankarAscStringList.stream().map(note -> ALANKAR_KEYS_VAL.get(note)).collect(Collectors.toList());

        System.out.println(
                alankarAscValList.stream()
                        .map(
                                note -> note.toString())
                        .collect(Collectors.joining(", ", "(", ")")));
        return alankarAscValList;
    }

    public List<Integer> getAlankarDscValList(List<String> alankarDscStringList) {
        List<Integer> alankarDscValList = alankarDscStringList.stream().map(note -> ALANKAR_KEYS_VAL.get(note)).collect(Collectors.toList());
        System.out.println(
                alankarDscValList.stream()
                        .map(
                                note -> note.toString())
                        .collect(Collectors.joining(", ", "(", ")")));
        return alankarDscValList;
    }
}
