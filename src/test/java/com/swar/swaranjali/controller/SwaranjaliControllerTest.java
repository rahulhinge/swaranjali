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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static jm.constants.Durations.*;
import static jm.constants.Pitches.*;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SwaranjaliControllerTest {

    @Autowired
    private SwaranjaliController swaranjaliController;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void palyCMajorAlk_0_1Octave() throws Exception {
        swaranjaliController.playAlankar("C", "MAJOR_SCALE", 1, 3, List.of("ALK_0"),
                120, "AC_GUITAR", false);
    }


}