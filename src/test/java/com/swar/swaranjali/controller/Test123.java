package com.swar.swaranjali.controller;

import java.util.ArrayList;
import java.util.List;

public class Test123 {


    public static void main(String[] args) {
        for(int i=0; i< 100; i++) {
            new Test123().getRandomNotesList(List.of(48, 50, 52, 53, 55, 57, 59, 60), 2);
            i++;
        }
    }

    public List<Integer> getRandomNotesList(List<Integer> listOfNotes, int numberOfRandomNotes) {
        List<Integer> randomNotesList = new ArrayList();
        for(int i=0; i<numberOfRandomNotes; i++) {
            int randomNum =  (int) ((Math.random() * ((listOfNotes.size()) - 0)) + 0);
            randomNotesList.add(listOfNotes.get(randomNum));
        }
        randomNotesList.stream().forEach(System.out::print);
        System.out.print(" ");
        return randomNotesList;
    }
}
