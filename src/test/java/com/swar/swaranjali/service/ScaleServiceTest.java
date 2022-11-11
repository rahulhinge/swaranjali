package com.swar.swaranjali.service;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ScaleServiceTest {

    private ScaleService scaleService = new ScaleService();

    @Test
    void retrieveCScaleMajorScaleNotesForOneOctaves() throws Exception {

        List<Integer> actualScaleNotes = scaleService.retrieveScaleNotesForNumOfOctaves(
                "C", "MAJOR_SCALE", 3, 1);

        List<Integer> expectedScaleNotes = List.of(48, 50, 52, 53, 55, 57, 59, 60);
        assertThat(expectedScaleNotes).isEqualTo(actualScaleNotes);
    }

    @Test
    void retrieveCScaleMajorScaleNotesForTwoOctaves() throws Exception {

        List<Integer> actualScaleNotes = scaleService.retrieveScaleNotesForNumOfOctaves(
                "C", "MAJOR_SCALE", 3, 2);

        List<Integer> expectedScaleNotes = List.of(48, 50, 52, 53, 55, 57, 59, 60, 62, 64, 65, 67, 69, 71, 72);
        assertThat(expectedScaleNotes).isEqualTo(actualScaleNotes);
    }

    @Test
    void retrieveCScaleMinorScaleNotesForOneOctaves() throws Exception {

        List<Integer> actualScaleNotes = scaleService.retrieveScaleNotesForNumOfOctaves(
                "C", "MINOR_SCALE", 3, 1);

        List<Integer> expectedScaleNotes = List.of(48, 50, 51, 53, 55, 56, 58, 60);
        assertThat(expectedScaleNotes).isEqualTo(actualScaleNotes);
    }

    @Test
    void retrieveCScaleMinotScaleNotesForTwoOctaves() throws Exception {

        List<Integer> actualScaleNotes = scaleService.retrieveScaleNotesForNumOfOctaves(
                "C", "MINOR_SCALE", 3, 2);

        List<Integer> expectedScaleNotes = List.of(48, 50, 51, 53, 55, 56, 58, 60, 62, 63, 65, 67, 68, 70, 72);
        assertThat(expectedScaleNotes).isEqualTo(actualScaleNotes);
    }

    @Test
    void retrieveCScaleHarmonicMinorScaleNotesForOneOctaves() throws Exception {

        List<Integer> actualScaleNotes = scaleService.retrieveScaleNotesForNumOfOctaves(
                "C", "HARMONIC_MINOR_SCALE", 3, 1);

        List<Integer> expectedScaleNotes = List.of(48, 50, 51, 53, 55, 56, 59, 60);
        assertThat(expectedScaleNotes).isEqualTo(actualScaleNotes);
    }

    @Test
    void retrieveCScaleHarmonicMinotScaleNotesForTwoOctaves() throws Exception {

        List<Integer> actualScaleNotes = scaleService.retrieveScaleNotesForNumOfOctaves(
                "C", "HARMONIC_MINOR_SCALE", 3, 2);

        List<Integer> expectedScaleNotes = List.of(48, 50, 51, 53, 55, 56, 59, 60, 62, 63, 65, 67, 68, 71, 72);
        assertThat(expectedScaleNotes).isEqualTo(actualScaleNotes);
    }
}