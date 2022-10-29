package com.swar.swaranjali.controller;

import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static jm.constants.Durations.*;
import static jm.constants.Pitches.*;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SwaranjaliControllerTest {

    private SwaranjaliController swaranjaliController = new SwaranjaliController();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getMajorScaleForC() {
        ResponseEntity<List<String>> result = swaranjaliController.getScale("C", "major");
        List<String> cMajor = Arrays.asList(new String[]{"C","D", "E", "F", "G", "A", "B", "C"});
        assertThat(result.getBody()).isEqualTo(cMajor);
    }

    @Test
    void getMinorScaleForC() {
        ResponseEntity<List<String>> result = swaranjaliController.getScale("C", "minor");
        List<String> cMinor = Arrays.asList(new String[]{"C","D", "Eb", "F", "G", "Ab", "Bb", "C"});
        assertThat(result.getBody()).isEqualTo(cMinor);
    }

    @Test
    void payANote() throws Exception {

        swaranjaliController.playAlankar("C", "MAJOR_SCALE", 2,3,List.of("ALK_1"), 120, "ACOUSTIC_GUITAR");
//        Thread.sleep(2000);
//        swaranjaliController.playAlankar("D", 3,"ALK_1", 120);
//        Thread.sleep(2000);
//        swaranjaliController.playAlankar("E", 3,"ALK_1", 120);
    }
}