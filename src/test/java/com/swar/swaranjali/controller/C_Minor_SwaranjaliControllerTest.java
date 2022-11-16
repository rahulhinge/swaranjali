package com.swar.swaranjali.controller;

import com.swar.swaranjali.Utils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;


@SpringBootTest
class C_Minor_SwaranjaliControllerTest {

    @Autowired
    private SwaranjaliController swaranjaliController;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    //@Disabled
    public void palyCMinorAlk_0_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Ma, Pa, Dhak, Neek, Saa}";
        String expectedAvroh = "{Saa, Neek, Dhak, Pa, Ma, Gak, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_0"),
                120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMinorAlk_0_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Ma, Pa, Dhak, Neek, Saa, Reh, Gahk, Mah, Pah, Dhahk, Neehk, Sahh}";
        String expectedAvroh = "{Sahh, Neehk, Dhahk, Pah, Mah, Gahk, Reh, Saa, Neek, Dhak, Pa, Ma, Gak, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_0"),
                120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    ///////////////   ALK-1   //////////////

    @Test
    //@Disabled
    public void palyCMinorAlk_1_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Re, Gak, Ma, Gak, Ma, Pa, Ma, Pa, Dhak, Pa, Dhak, Neek, Dhak, Neek, Saa}";
        String expectedAvroh = "{Saa, Neek, Dhak, Neek, Dhak, Pa, Dhak, Pa, Ma, Pa, Ma, Gak, Ma, Gak, Re, Gak, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_1"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMinorAlk_1_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Re, Gak, Ma, Gak, Ma, Pa, Ma, Pa, Dhak, Pa, Dhak, Neek, Dhak, Neek, Saa, Neek, Saa, Reh, Saa, Reh, Gahk, Reh, Gahk, Mah, Gahk, Mah, Pah, Mah, Pah, Dhahk, Pah, Dhahk, Neehk, Dhahk, Neehk, Sahh}";
        String expectedAvroh = "{Sahh, Neehk, Dhahk, Neehk, Dhahk, Pah, Dhahk, Pah, Mah, Pah, Mah, Gahk, Mah, Gahk, Reh, Gahk, Reh, Saa, Reh, Saa, Neek, Saa, Neek, Dhak, Neek, Dhak, Pa, Dhak, Pa, Ma, Pa, Ma, Gak, Ma, Gak, Re, Gak, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_1"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }


    ///////////////   ALK-2   //////////////

    @Test
    //@Disabled
    public void palyCMinorAlk_2_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Gak, Re, Gak, Ma, Ma, Gak, Ma, Pa, Pa, Ma, Pa, Dhak, Dhak, Pa, Dhak, Neek, Neek, Dhak, Neek, Saa, Saa}";
        String expectedAvroh = "{Saa, Neek, Dhak, Dhak, Neek, Dhak, Pa, Pa, Dhak, Pa, Ma, Ma, Pa, Ma, Gak, Gak, Ma, Gak, Re, Re, Gak, Re, Sa, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_2"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMinorAlk_2_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Gak, Re, Gak, Ma, Ma, Gak, Ma, Pa, Pa, Ma, Pa, Dhak, Dhak, Pa, Dhak, Neek, Neek, Dhak, Neek, Saa, Saa, Neek, Saa, Reh, Reh, Saa, Reh, Gahk, Gahk, Reh, Gahk, Mah, Mah, Gahk, Mah, Pah, Pah, Mah, Pah, Dhahk, Dhahk, Pah, Dhahk, Neehk, Neehk, Dhahk, Neehk, Sahh, Sahh}";
        String expectedAvroh = "{Sahh, Neehk, Dhahk, Dhahk, Neehk, Dhahk, Pah, Pah, Dhahk, Pah, Mah, Mah, Pah, Mah, Gahk, Gahk, Mah, Gahk, Reh, Reh, Gahk, Reh, Saa, Saa, Reh, Saa, Neek, Neek, Saa, Neek, Dhak, Dhak, Neek, Dhak, Pa, Pa, Dhak, Pa, Ma, Ma, Pa, Ma, Gak, Gak, Ma, Gak, Re, Re, Gak, Re, Sa, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_2"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }


    ///////////////   ALK-3   //////////////

    @Test
    //@Disabled
    public void palyCMinorAlk_3_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Re, Gak, Re, Gak, Gak, Ma, Gak, Ma, Ma, Pa, Ma, Pa, Pa, Dhak, Pa, Dhak, Dhak, Neek, Dhak, Neek, Neek, Saa}";
        String expectedAvroh = "{Saa, Neek, Neek, Dhak, Neek, Dhak, Dhak, Pa, Dhak, Pa, Pa, Ma, Pa, Ma, Ma, Gak, Ma, Gak, Gak, Re, Gak, Re, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_3"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMinorAlk_3_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Re, Gak, Re, Gak, Gak, Ma, Gak, Ma, Ma, Pa, Ma, Pa, Pa, Dhak, Pa, Dhak, Dhak, Neek, Dhak, Neek, Neek, Saa, Neek, Saa, Saa, Reh, Saa, Reh, Reh, Gahk, Reh, Gahk, Gahk, Mah, Gahk, Mah, Mah, Pah, Mah, Pah, Pah, Dhahk, Pah, Dhahk, Dhahk, Neehk, Dhahk, Neehk, Neehk, Sahh}";
        String expectedAvroh = "{Sahh, Neehk, Neehk, Dhahk, Neehk, Dhahk, Dhahk, Pah, Dhahk, Pah, Pah, Mah, Pah, Mah, Mah, Gahk, Mah, Gahk, Gahk, Reh, Gahk, Reh, Reh, Saa, Reh, Saa, Saa, Neek, Saa, Neek, Neek, Dhak, Neek, Dhak, Dhak, Pa, Dhak, Pa, Pa, Ma, Pa, Ma, Ma, Gak, Ma, Gak, Gak, Re, Gak, Re, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_3"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }


    ///////////////   ALK-4   //////////////

    @Test
    //@Disabled
    public void palyCMinorAlk_4_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Sa, Re, Gak, Re, Re, Gak, Ma, Gak, Gak, Ma, Pa, Ma, Ma, Pa, Dhak, Pa, Pa, Dhak, Neek, Dhak, Dhak, Neek, Saa}";
        String expectedAvroh = "{Saa, Saa, Neek, Dhak, Neek, Neek, Dhak, Pa, Dhak, Dhak, Pa, Ma, Pa, Pa, Ma, Gak, Ma, Ma, Gak, Re, Gak, Gak, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_4"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMinorAlk_4_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Sa, Re, Gak, Re, Re, Gak, Ma, Gak, Gak, Ma, Pa, Ma, Ma, Pa, Dhak, Pa, Pa, Dhak, Neek, Dhak, Dhak, Neek, Saa, Neek, Neek, Saa, Reh, Saa, Saa, Reh, Gahk, Reh, Reh, Gahk, Mah, Gahk, Gahk, Mah, Pah, Mah, Mah, Pah, Dhahk, Pah, Pah, Dhahk, Neehk, Dhahk, Dhahk, Neehk, Sahh}";
        String expectedAvroh = "{Sahh, Sahh, Neehk, Dhahk, Neehk, Neehk, Dhahk, Pah, Dhahk, Dhahk, Pah, Mah, Pah, Pah, Mah, Gahk, Mah, Mah, Gahk, Reh, Gahk, Gahk, Reh, Saa, Reh, Reh, Saa, Neek, Saa, Saa, Neek, Dhak, Neek, Neek, Dhak, Pa, Dhak, Dhak, Pa, Ma, Pa, Pa, Ma, Gak, Ma, Ma, Gak, Re, Gak, Gak, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_4"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    ///////////////   ALK-5   //////////////

    @Test
    //@Disabled
    public void palyCMinorAlk_5_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Ma, Re, Gak, Ma, Pa, Gak, Ma, Pa, Dhak, Ma, Pa, Dhak, Neek, Pa, Dhak, Neek, Saa}";
        String expectedAvroh = "{Saa, Neek, Dhak, Pa, Neek, Dhak, Pa, Ma, Dhak, Pa, Ma, Gak, Pa, Ma, Gak, Re, Ma, Gak, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_5"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMinorAlk_5_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Ma, Re, Gak, Ma, Pa, Gak, Ma, Pa, Dhak, Ma, Pa, Dhak, Neek, Pa, Dhak, Neek, Saa, Dhak, Neek, Saa, Reh, Neek, Saa, Reh, Gahk, Saa, Reh, Gahk, Mah, Reh, Gahk, Mah, Pah, Gahk, Mah, Pah, Dhahk, Mah, Pah, Dhahk, Neehk, Pah, Dhahk, Neehk, Sahh}";
        String expectedAvroh = "{Sahh, Neehk, Dhahk, Pah, Neehk, Dhahk, Pah, Mah, Dhahk, Pah, Mah, Gahk, Pah, Mah, Gahk, Reh, Mah, Gahk, Reh, Saa, Gahk, Reh, Saa, Neek, Reh, Saa, Neek, Dhak, Saa, Neek, Dhak, Pa, Neek, Dhak, Pa, Ma, Dhak, Pa, Ma, Gak, Pa, Ma, Gak, Re, Ma, Gak, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_5"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    ///////////////   ALK-6   //////////////

    @Test
    //@Disabled
    public void palyCMinorAlk_6_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Gak, Re, Sa, Re, Ma, Gak, Re, Gak, Pa, Ma, Gak, Ma, Dhak, Pa, Ma, Pa, Neek, Dhak, Pa, Dhak, Saa, Neek, Dhak}";
        String expectedAvroh = "{Saa, Dhak, Neek, Saa, Neek, Pa, Dhak, Neek, Dhak, Ma, Pa, Dhak, Pa, Gak, Ma, Pa, Ma, Re, Gak, Ma, Gak, Sa, Re, Gak}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_6"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMinorAlk_6_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Gak, Re, Sa, Re, Ma, Gak, Re, Gak, Pa, Ma, Gak, Ma, Dhak, Pa, Ma, Pa, Neek, Dhak, Pa, Dhak, Saa, Neek, Dhak, Neek, Reh, Saa, Neek, Saa, Gahk, Reh, Saa, Reh, Mah, Gahk, Reh, Gahk, Pah, Mah, Gahk, Mah, Dhahk, Pah, Mah, Pah, Neehk, Dhahk, Pah, Dhahk, Sahh, Neehk, Dhahk}";
        String expectedAvroh = "{Sahh, Dhahk, Neehk, Sahh, Neehk, Pah, Dhahk, Neehk, Dhahk, Mah, Pah, Dhahk, Pah, Gahk, Mah, Pah, Mah, Reh, Gahk, Mah, Gahk, Saa, Reh, Gahk, Reh, Neek, Saa, Reh, Saa, Dhak, Neek, Saa, Neek, Pa, Dhak, Neek, Dhak, Ma, Pa, Dhak, Pa, Gak, Ma, Pa, Ma, Re, Gak, Ma, Gak, Sa, Re, Gak}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_6"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    ///////////////   ALK-7   //////////////

    @Test
    //@Disabled
    public void palyCMinorAlk_7_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Gak, Re, Gak, Re, Ma, Gak, Ma, Gak, Pa, Ma, Pa, Ma, Dhak, Pa, Dhak, Pa, Neek, Dhak, Neek, Dhak, Saa, Neek, Saa}";
        String expectedAvroh = "{Saa, Dhak, Neek, Dhak, Neek, Pa, Dhak, Pa, Dhak, Ma, Pa, Ma, Pa, Gak, Ma, Gak, Ma, Re, Gak, Re, Gak, Sa, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_7"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMinorAlk_7_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Gak, Re, Gak, Re, Ma, Gak, Ma, Gak, Pa, Ma, Pa, Ma, Dhak, Pa, Dhak, Pa, Neek, Dhak, Neek, Dhak, Saa, Neek, Saa, Neek, Reh, Saa, Reh, Saa, Gahk, Reh, Gahk, Reh, Mah, Gahk, Mah, Gahk, Pah, Mah, Pah, Mah, Dhahk, Pah, Dhahk, Pah, Neehk, Dhahk, Neehk, Dhahk, Sahh, Neehk, Sahh}";
        String expectedAvroh = "{Sahh, Dhahk, Neehk, Dhahk, Neehk, Pah, Dhahk, Pah, Dhahk, Mah, Pah, Mah, Pah, Gahk, Mah, Gahk, Mah, Reh, Gahk, Reh, Gahk, Saa, Reh, Saa, Reh, Neek, Saa, Neek, Saa, Dhak, Neek, Dhak, Neek, Pa, Dhak, Pa, Dhak, Ma, Pa, Ma, Pa, Gak, Ma, Gak, Ma, Re, Gak, Re, Gak, Sa, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_7"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    ///////////////   ALK-8   //////////////

    @Test
    //@Disabled
    public void palyCMinorAlk_8_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Re, Gak, Ma, Re, Gak, Ma, Gak, Ma, Pa, Gak, Ma, Pa, Ma, Pa, Dhak, Ma, Pa, Dhak, Pa, Dhak, Neek, Pa, Dhak, Neek, Dhak, Neek, Saa}";
        String expectedAvroh = "{Saa, Neek, Dhak, Neek, Dhak, Pa, Neek, Dhak, Pa, Dhak, Pa, Ma, Dhak, Pa, Ma, Pa, Ma, Gak, Pa, Ma, Gak, Ma, Gak, Re, Ma, Gak, Re, Gak, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_8"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMinorAlk_8_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Re, Gak, Ma, Re, Gak, Ma, Gak, Ma, Pa, Gak, Ma, Pa, Ma, Pa, Dhak, Ma, Pa, Dhak, Pa, Dhak, Neek, Pa, Dhak, Neek, Dhak, Neek, Saa, Dhak, Neek, Saa, Neek, Saa, Reh, Neek, Saa, Reh, Saa, Reh, Gahk, Saa, Reh, Gahk, Reh, Gahk, Mah, Reh, Gahk, Mah, Gahk, Mah, Pah, Gahk, Mah, Pah, Mah, Pah, Dhahk, Mah, Pah, Dhahk, Pah, Dhahk, Neehk, Pah, Dhahk, Neehk, Dhahk, Neehk, Sahh}";
        String expectedAvroh = "{Sahh, Neehk, Dhahk, Neehk, Dhahk, Pah, Neehk, Dhahk, Pah, Dhahk, Pah, Mah, Dhahk, Pah, Mah, Pah, Mah, Gahk, Pah, Mah, Gahk, Mah, Gahk, Reh, Mah, Gahk, Reh, Gahk, Reh, Saa, Gahk, Reh, Saa, Reh, Saa, Neek, Reh, Saa, Neek, Saa, Neek, Dhak, Saa, Neek, Dhak, Neek, Dhak, Pa, Neek, Dhak, Pa, Dhak, Pa, Ma, Dhak, Pa, Ma, Pa, Ma, Gak, Pa, Ma, Gak, Ma, Gak, Re, Ma, Gak, Re, Gak, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_8"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    ///////////////   ALK-9   //////////////

    @Test
    //@Disabled
    public void palyCMinorAlk_9_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Re, Gak, Ma, Re, Gak, Ma, Sa, Re, Gak, Re, Gak, Ma, Gak, Ma, Pa, Gak, Ma, Pa, Re, Gak, Ma, Gak, Ma, Pa, Ma, Pa, Dhak, Ma, Pa, Dhak, Gak, Ma, Pa, Ma, Pa, Dhak, Pa, Dhak, Neek, Pa, Dhak, Neek, Ma, Pa, Dhak, Pa, Dhak, Neek, Dhak, Neek, Saa, Dhak, Neek, Saa, Pa, Dhak, Neek}";
        String expectedAvroh = "{Saa, Neek, Dhak, Neek, Dhak, Pa, Neek, Dhak, Pa, Saa, Neek, Dhak, Neek, Dhak, Pa, Dhak, Pa, Ma, Dhak, Pa, Ma, Neek, Dhak, Pa, Dhak, Pa, Ma, Pa, Ma, Gak, Pa, Ma, Gak, Dhak, Pa, Ma, Pa, Ma, Gak, Ma, Gak, Re, Ma, Gak, Re, Pa, Ma, Gak, Ma, Gak, Re, Gak, Re, Sa, Gak, Re, Sa, Ma, Gak, Re}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_9"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMinorAlk_9_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Re, Gak, Ma, Re, Gak, Ma, Sa, Re, Gak, Re, Gak, Ma, Gak, Ma, Pa, Gak, Ma, Pa, Re, Gak, Ma, Gak, Ma, Pa, Ma, Pa, Dhak, Ma, Pa, Dhak, Gak, Ma, Pa, Ma, Pa, Dhak, Pa, Dhak, Neek, Pa, Dhak, Neek, Ma, Pa, Dhak, Pa, Dhak, Neek, Dhak, Neek, Saa, Dhak, Neek, Saa, Pa, Dhak, Neek, Dhak, Neek, Saa, Neek, Saa, Reh, Neek, Saa, Reh, Dhak, Neek, Saa, Neek, Saa, Reh, Saa, Reh, Gahk, Saa, Reh, Gahk, Neek, Saa, Reh, Saa, Reh, Gahk, Reh, Gahk, Mah, Reh, Gahk, Mah, Saa, Reh, Gahk, Reh, Gahk, Mah, Gahk, Mah, Pah, Gahk, Mah, Pah, Reh, Gahk, Mah, Gahk, Mah, Pah, Mah, Pah, Dhahk, Mah, Pah, Dhahk, Gahk, Mah, Pah, Mah, Pah, Dhahk, Pah, Dhahk, Neehk, Pah, Dhahk, Neehk, Mah, Pah, Dhahk, Pah, Dhahk, Neehk, Dhahk, Neehk, Sahh, Dhahk, Neehk, Sahh, Pah, Dhahk, Neehk}";
        String expectedAvroh = "{Sahh, Neehk, Dhahk, Neehk, Dhahk, Pah, Neehk, Dhahk, Pah, Sahh, Neehk, Dhahk, Neehk, Dhahk, Pah, Dhahk, Pah, Mah, Dhahk, Pah, Mah, Neehk, Dhahk, Pah, Dhahk, Pah, Mah, Pah, Mah, Gahk, Pah, Mah, Gahk, Dhahk, Pah, Mah, Pah, Mah, Gahk, Mah, Gahk, Reh, Mah, Gahk, Reh, Pah, Mah, Gahk, Mah, Gahk, Reh, Gahk, Reh, Saa, Gahk, Reh, Saa, Mah, Gahk, Reh, Gahk, Reh, Saa, Reh, Saa, Neek, Reh, Saa, Neek, Gahk, Reh, Saa, Reh, Saa, Neek, Saa, Neek, Dhak, Saa, Neek, Dhak, Reh, Saa, Neek, Saa, Neek, Dhak, Neek, Dhak, Pa, Neek, Dhak, Pa, Saa, Neek, Dhak, Neek, Dhak, Pa, Dhak, Pa, Ma, Dhak, Pa, Ma, Neek, Dhak, Pa, Dhak, Pa, Ma, Pa, Ma, Gak, Pa, Ma, Gak, Dhak, Pa, Ma, Pa, Ma, Gak, Ma, Gak, Re, Ma, Gak, Re, Pa, Ma, Gak, Ma, Gak, Re, Gak, Re, Sa, Gak, Re, Sa, Ma, Gak, Re}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_9"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    ///////////////   ALK-10   //////////////

    @Test
    //@Disabled
    public void palyCMinorAlk_10_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Re, Gak, Neelk, Sa, Re, Gak, Ma, Gak, Ma, Sa, Re, Gak, Ma, Pa, Ma, Pa, Re, Gak, Ma, Pa, Dhak, Pa, Dhak, Gak, Ma, Pa, Dhak, Neek, Dhak, Neek, Ma, Pa, Dhak, Neek, Saa, Neek, Saa, Pa, Dhak, Neek, Saa, Reh, Saa, Reh, Dhak, Neek, Saa, Reh, Gahk, Reh, Gahk, Neek, Saa}";
        String expectedAvroh = "{Saa, Neek, Dhak, Neek, Dhak, Reh, Saa, Neek, Dhak, Pa, Dhak, Pa, Saa, Neek, Dhak, Pa, Ma, Pa, Ma, Neek, Dhak, Pa, Ma, Gak, Ma, Gak, Dhak, Pa, Ma, Gak, Re, Gak, Re, Pa, Ma, Gak, Re, Sa, Re, Sa, Ma, Gak, Re, Sa, Neelk, Sa, Neelk, Gak, Re, Sa, Neelk, Dhalk, Neelk, Dhalk, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_10"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMinorAlk_10_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Re, Gak, Neelk, Sa, Re, Gak, Ma, Gak, Ma, Sa, Re, Gak, Ma, Pa, Ma, Pa, Re, Gak, Ma, Pa, Dhak, Pa, Dhak, Gak, Ma, Pa, Dhak, Neek, Dhak, Neek, Ma, Pa, Dhak, Neek, Saa, Neek, Saa, Pa, Dhak, Neek, Saa, Reh, Saa, Reh, Dhak, Neek, Saa, Reh, Gahk, Reh, Gahk, Neek, Saa, Reh, Gahk, Mah, Gahk, Mah, Saa, Reh, Gahk, Mah, Pah, Mah, Pah, Reh, Gahk, Mah, Pah, Dhahk, Pah, Dhahk, Gahk, Mah, Pah, Dhahk, Neehk, Dhahk, Neehk, Mah, Pah, Dhahk, Neehk, Sahh, Neehk, Sahh, Pah, Dhahk, Neehk, Sahh, Rehh, Sahh, Rehh, Dhahk, Neehk}";
        String expectedAvroh = "{Sahh, Neehk, Dhahk, Neehk, Dhahk, Rehh, Sahh, Neehk, Dhahk, Pah, Dhahk, Pah, Sahh, Neehk, Dhahk, Pah, Mah, Pah, Mah, Neehk, Dhahk, Pah, Mah, Gahk, Mah, Gahk, Dhahk, Pah, Mah, Gahk, Reh, Gahk, Reh, Pah, Mah, Gahk, Reh, Saa, Reh, Saa, Mah, Gahk, Reh, Saa, Neek, Saa, Neek, Gahk, Reh, Saa, Neek, Dhak, Neek, Dhak, Reh, Saa, Neek, Dhak, Pa, Dhak, Pa, Saa, Neek, Dhak, Pa, Ma, Pa, Ma, Neek, Dhak, Pa, Ma, Gak, Ma, Gak, Dhak, Pa, Ma, Gak, Re, Gak, Re, Pa, Ma, Gak, Re, Sa, Re, Sa, Ma, Gak, Re, Sa, Neelk, Sa, Neelk, Gak, Re}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_10"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    ///////////////   ALK-11   //////////////

    @Test
    //@Disabled
    public void palyCMinorAlk_11_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Gak, Re, Sa, Re, Gak, Ma, Ma, Gak, Re, Gak, Ma, Pa, Pa, Ma, Gak, Ma, Pa, Dhak, Dhak, Pa, Ma, Pa, Dhak, Neek, Neek, Dhak, Pa, Dhak, Neek, Saa, Saa, Neek, Dhak}";
        String expectedAvroh = "{Saa, Neek, Dhak, Dhak, Neek, Saa, Neek, Dhak, Pa, Pa, Dhak, Neek, Dhak, Pa, Ma, Ma, Pa, Dhak, Pa, Ma, Gak, Gak, Ma, Pa, Ma, Gak, Re, Re, Gak, Ma, Gak, Re, Sa, Sa, Re, Gak}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_11"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMinorAlk_11_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Gak, Re, Sa, Re, Gak, Ma, Ma, Gak, Re, Gak, Ma, Pa, Pa, Ma, Gak, Ma, Pa, Dhak, Dhak, Pa, Ma, Pa, Dhak, Neek, Neek, Dhak, Pa, Dhak, Neek, Saa, Saa, Neek, Dhak, Neek, Saa, Reh, Reh, Saa, Neek, Saa, Reh, Gahk, Gahk, Reh, Saa, Reh, Gahk, Mah, Mah, Gahk, Reh, Gahk, Mah, Pah, Pah, Mah, Gahk, Mah, Pah, Dhahk, Dhahk, Pah, Mah, Pah, Dhahk, Neehk, Neehk, Dhahk, Pah, Dhahk, Neehk, Sahh, Sahh, Neehk, Dhahk}";
        String expectedAvroh = "{Sahh, Neehk, Dhahk, Dhahk, Neehk, Sahh, Neehk, Dhahk, Pah, Pah, Dhahk, Neehk, Dhahk, Pah, Mah, Mah, Pah, Dhahk, Pah, Mah, Gahk, Gahk, Mah, Pah, Mah, Gahk, Reh, Reh, Gahk, Mah, Gahk, Reh, Saa, Saa, Reh, Gahk, Reh, Saa, Neek, Neek, Saa, Reh, Saa, Neek, Dhak, Dhak, Neek, Saa, Neek, Dhak, Pa, Pa, Dhak, Neek, Dhak, Pa, Ma, Ma, Pa, Dhak, Pa, Ma, Gak, Gak, Ma, Pa, Ma, Gak, Re, Re, Gak, Ma, Gak, Re, Sa, Sa, Re, Gak}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_11"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    ///////////////   ALK-12   //////////////

    @Test
    //@Disabled
    public void palyCMinorAlk_12_One_Octave() throws Exception {

        String expectedArroh = "{Gak, Re, Gak, Sa, Re, Gak, Neelk, Sa, Ma, Gak, Ma, Re, Gak, Ma, Sa, Re, Pa, Ma, Pa, Gak, Ma, Pa, Re, Gak, Dhak, Pa, Dhak, Ma, Pa, Dhak, Gak, Ma, Neek, Dhak, Neek, Pa, Dhak, Neek, Ma, Pa, Saa, Neek, Saa, Dhak, Neek, Saa, Pa, Dhak, Reh, Saa, Reh, Neek, Saa, Reh, Dhak, Neek, Gahk, Reh, Gahk, Saa, Reh, Gahk, Neek, Saa}";
        String expectedAvroh = "{Dhak, Neek, Dhak, Saa, Neek, Dhak, Reh, Saa, Pa, Dhak, Pa, Neek, Dhak, Pa, Saa, Neek, Ma, Pa, Ma, Dhak, Pa, Ma, Neek, Dhak, Gak, Ma, Gak, Pa, Ma, Gak, Dhak, Pa, Re, Gak, Re, Ma, Gak, Re, Pa, Ma, Sa, Re, Sa, Gak, Re, Sa, Ma, Gak, Neelk, Sa, Neelk, Re, Sa, Neelk, Gak, Re, Dhalk, Neelk, Dhalk, Sa, Neelk, Dhalk, Re, Sa}";

        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_12"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMinorAlk_12_Two_Octave() throws Exception {

        String expectedArroh = "{Gak, Re, Gak, Sa, Re, Gak, Neelk, Sa, Ma, Gak, Ma, Re, Gak, Ma, Sa, Re, Pa, Ma, Pa, Gak, Ma, Pa, Re, Gak, Dhak, Pa, Dhak, Ma, Pa, Dhak, Gak, Ma, Neek, Dhak, Neek, Pa, Dhak, Neek, Ma, Pa, Saa, Neek, Saa, Dhak, Neek, Saa, Pa, Dhak, Reh, Saa, Reh, Neek, Saa, Reh, Dhak, Neek, Gahk, Reh, Gahk, Saa, Reh, Gahk, Neek, Saa, Mah, Gahk, Mah, Reh, Gahk, Mah, Saa, Reh, Pah, Mah, Pah, Gahk, Mah, Pah, Reh, Gahk, Dhahk, Pah, Dhahk, Mah, Pah, Dhahk, Gahk, Mah, Neehk, Dhahk, Neehk, Pah, Dhahk, Neehk, Mah, Pah, Sahh, Neehk, Sahh, Dhahk, Neehk, Sahh, Pah, Dhahk, Rehh, Sahh, Rehh, Neehk, Sahh, Rehh, Dhahk, Neehk, Gahhk, Rehh, Gahhk, Sahh, Rehh, Gahhk, Neehk, Sahh}";
        String expectedAvroh = "{Dhahk, Neehk, Dhahk, Sahh, Neehk, Dhahk, Rehh, Sahh, Pah, Dhahk, Pah, Neehk, Dhahk, Pah, Sahh, Neehk, Mah, Pah, Mah, Dhahk, Pah, Mah, Neehk, Dhahk, Gahk, Mah, Gahk, Pah, Mah, Gahk, Dhahk, Pah, Reh, Gahk, Reh, Mah, Gahk, Reh, Pah, Mah, Saa, Reh, Saa, Gahk, Reh, Saa, Mah, Gahk, Neek, Saa, Neek, Reh, Saa, Neek, Gahk, Reh, Dhak, Neek, Dhak, Saa, Neek, Dhak, Reh, Saa, Pa, Dhak, Pa, Neek, Dhak, Pa, Saa, Neek, Ma, Pa, Ma, Dhak, Pa, Ma, Neek, Dhak, Gak, Ma, Gak, Pa, Ma, Gak, Dhak, Pa, Re, Gak, Re, Ma, Gak, Re, Pa, Ma, Sa, Re, Sa, Gak, Re, Sa, Ma, Gak, Neelk, Sa, Neelk, Re, Sa, Neelk, Gak, Re, Dhalk, Neelk, Dhalk, Sa, Neelk, Dhalk, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_12"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }


    ///////////////   ALK-13   //////////////

    @Test
    ////@Disabled
    public void palyCMinorAlk_13_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Re, Sa, Gak, Re, Sa, Gak, Re, Re, Gak, Ma, Gak, Re, Ma, Gak, Re, Ma, Gak, Gak, Ma, Pa, Ma, Gak, Pa, Ma, Gak, Pa, Ma, Ma, Pa, Dhak, Pa, Ma, Dhak, Pa, Ma, Dhak, Pa, Pa, Dhak, Neek, Dhak, Pa, Neek, Dhak, Pa, Neek, Dhak, Dhak, Neek, Saa, Neek, Dhak, Saa, Neek, Dhak, Saa, Neek, Neek, Saa, Reh, Saa, Neek, Reh, Saa, Neek, Reh, Saa, Saa, Reh, Gahk, Reh, Saa, Gahk, Reh, Saa, Gahk, Reh}";
        String expectedAvroh = "{Saa, Neek, Dhak, Neek, Saa, Dhak, Neek, Saa, Dhak, Neek, Neek, Dhak, Pa, Dhak, Neek, Pa, Dhak, Neek, Pa, Dhak, Dhak, Pa, Ma, Pa, Dhak, Ma, Pa, Dhak, Ma, Pa, Pa, Ma, Gak, Ma, Pa, Gak, Ma, Pa, Gak, Ma, Ma, Gak, Re, Gak, Ma, Re, Gak, Ma, Re, Gak, Gak, Re, Sa, Re, Gak, Sa, Re, Gak, Sa, Re, Re, Sa, Neelk, Sa, Re, Neelk, Sa, Re, Neelk, Sa, Sa, Neelk, Dhalk, Neelk, Sa, Dhalk, Neelk, Sa, Dhalk, Neelk}";

        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_13"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    ////@Disabled
    public void palyCMinorAlk_13_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Re, Sa, Gak, Re, Sa, Gak, Re, Re, Gak, Ma, Gak, Re, Ma, Gak, Re, Ma, Gak, Gak, Ma, Pa, Ma, Gak, Pa, Ma, Gak, Pa, Ma, Ma, Pa, Dhak, Pa, Ma, Dhak, Pa, Ma, Dhak, Pa, Pa, Dhak, Neek, Dhak, Pa, Neek, Dhak, Pa, Neek, Dhak, Dhak, Neek, Saa, Neek, Dhak, Saa, Neek, Dhak, Saa, Neek, Neek, Saa, Reh, Saa, Neek, Reh, Saa, Neek, Reh, Saa, Saa, Reh, Gahk, Reh, Saa, Gahk, Reh, Saa, Gahk, Reh, Reh, Gahk, Mah, Gahk, Reh, Mah, Gahk, Reh, Mah, Gahk, Gahk, Mah, Pah, Mah, Gahk, Pah, Mah, Gahk, Pah, Mah, Mah, Pah, Dhahk, Pah, Mah, Dhahk, Pah, Mah, Dhahk, Pah, Pah, Dhahk, Neehk, Dhahk, Pah, Neehk, Dhahk, Pah, Neehk, Dhahk, Dhahk, Neehk, Sahh, Neehk, Dhahk, Sahh, Neehk, Dhahk, Sahh, Neehk, Neehk, Sahh, Rehh, Sahh, Neehk, Rehh, Sahh, Neehk, Rehh, Sahh, Sahh, Rehh, Gahhk, Rehh, Sahh, Gahhk, Rehh, Sahh, Gahhk, Rehh}";
        String expectedAvroh = "{Sahh, Neehk, Dhahk, Neehk, Sahh, Dhahk, Neehk, Sahh, Dhahk, Neehk, Neehk, Dhahk, Pah, Dhahk, Neehk, Pah, Dhahk, Neehk, Pah, Dhahk, Dhahk, Pah, Mah, Pah, Dhahk, Mah, Pah, Dhahk, Mah, Pah, Pah, Mah, Gahk, Mah, Pah, Gahk, Mah, Pah, Gahk, Mah, Mah, Gahk, Reh, Gahk, Mah, Reh, Gahk, Mah, Reh, Gahk, Gahk, Reh, Saa, Reh, Gahk, Saa, Reh, Gahk, Saa, Reh, Reh, Saa, Neek, Saa, Reh, Neek, Saa, Reh, Neek, Saa, Saa, Neek, Dhak, Neek, Saa, Dhak, Neek, Saa, Dhak, Neek, Neek, Dhak, Pa, Dhak, Neek, Pa, Dhak, Neek, Pa, Dhak, Dhak, Pa, Ma, Pa, Dhak, Ma, Pa, Dhak, Ma, Pa, Pa, Ma, Gak, Ma, Pa, Gak, Ma, Pa, Gak, Ma, Ma, Gak, Re, Gak, Ma, Re, Gak, Ma, Re, Gak, Gak, Re, Sa, Re, Gak, Sa, Re, Gak, Sa, Re, Re, Sa, Neelk, Sa, Re, Neelk, Sa, Re, Neelk, Sa, Sa, Neelk, Dhalk, Neelk, Sa, Dhalk, Neelk, Sa, Dhalk, Neelk}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_13"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    ///////////////   ALK-14   //////////////

    @Test
    ////@Disabled
    public void palyCMinorAlk_14_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Re, Re, Gak, Sa, Re, Sa, Gak, Gak, Re, Re, Re, Neelk, Sa, Re, Gak, Ma, Gak, Gak, Ma, Re, Gak, Re, Ma, Ma, Gak, Gak, Gak, Sa, Re, Gak, Ma, Pa, Ma, Ma, Pa, Gak, Ma, Gak, Pa, Pa, Ma, Ma, Ma, Re, Gak, Ma, Pa, Dhak, Pa, Pa, Dhak, Ma, Pa, Ma, Dhak, Dhak, Pa, Pa, Pa, Gak, Ma, Pa, Dhak, Neek, Dhak, Dhak, Neek, Pa, Dhak, Pa, Neek, Neek, Dhak, Dhak, Dhak, Ma, Pa, Dhak, Neek, Saa, Neek, Neek, Saa, Dhak, Neek, Dhak, Saa, Saa, Neek, Neek, Neek, Pa, Dhak, Neek, Saa, Reh, Saa, Saa, Reh, Neek, Saa, Neek, Reh, Reh, Saa, Saa, Saa, Dhak, Neek, Saa, Reh, Gahk, Reh, Reh, Gahk, Saa, Reh, Saa, Gahk, Gahk, Reh, Reh, Reh, Neek, Saa}";
        String expectedAvroh = "{Saa, Neek, Dhak, Neek, Neek, Dhak, Saa, Neek, Saa, Dhak, Dhak, Neek, Neek, Neek, Reh, Saa, Neek, Dhak, Pa, Dhak, Dhak, Pa, Neek, Dhak, Neek, Pa, Pa, Dhak, Dhak, Dhak, Saa, Neek, Dhak, Pa, Ma, Pa, Pa, Ma, Dhak, Pa, Dhak, Ma, Ma, Pa, Pa, Pa, Neek, Dhak, Pa, Ma, Gak, Ma, Ma, Gak, Pa, Ma, Pa, Gak, Gak, Ma, Ma, Ma, Dhak, Pa, Ma, Gak, Re, Gak, Gak, Re, Ma, Gak, Ma, Re, Re, Gak, Gak, Gak, Pa, Ma, Gak, Re, Sa, Re, Re, Sa, Gak, Re, Gak, Sa, Sa, Re, Re, Re, Ma, Gak, Re, Sa, Neelk, Sa, Sa, Neelk, Re, Sa, Re, Neelk, Neelk, Sa, Sa, Sa, Gak, Re, Sa, Neelk, Dhalk, Neelk, Neelk, Dhalk, Sa, Neelk, Sa, Dhalk, Dhalk, Neelk, Neelk, Neelk, Re, Sa}";

        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_14"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    ////@Disabled
    public void palyCMinorAlk_14_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Re, Re, Gak, Sa, Re, Sa, Gak, Gak, Re, Re, Re, Neelk, Sa, Re, Gak, Ma, Gak, Gak, Ma, Re, Gak, Re, Ma, Ma, Gak, Gak, Gak, Sa, Re, Gak, Ma, Pa, Ma, Ma, Pa, Gak, Ma, Gak, Pa, Pa, Ma, Ma, Ma, Re, Gak, Ma, Pa, Dhak, Pa, Pa, Dhak, Ma, Pa, Ma, Dhak, Dhak, Pa, Pa, Pa, Gak, Ma, Pa, Dhak, Neek, Dhak, Dhak, Neek, Pa, Dhak, Pa, Neek, Neek, Dhak, Dhak, Dhak, Ma, Pa, Dhak, Neek, Saa, Neek, Neek, Saa, Dhak, Neek, Dhak, Saa, Saa, Neek, Neek, Neek, Pa, Dhak, Neek, Saa, Reh, Saa, Saa, Reh, Neek, Saa, Neek, Reh, Reh, Saa, Saa, Saa, Dhak, Neek, Saa, Reh, Gahk, Reh, Reh, Gahk, Saa, Reh, Saa, Gahk, Gahk, Reh, Reh, Reh, Neek, Saa, Reh, Gahk, Mah, Gahk, Gahk, Mah, Reh, Gahk, Reh, Mah, Mah, Gahk, Gahk, Gahk, Saa, Reh, Gahk, Mah, Pah, Mah, Mah, Pah, Gahk, Mah, Gahk, Pah, Pah, Mah, Mah, Mah, Reh, Gahk, Mah, Pah, Dhahk, Pah, Pah, Dhahk, Mah, Pah, Mah, Dhahk, Dhahk, Pah, Pah, Pah, Gahk, Mah, Pah, Dhahk, Neehk, Dhahk, Dhahk, Neehk, Pah, Dhahk, Pah, Neehk, Neehk, Dhahk, Dhahk, Dhahk, Mah, Pah, Dhahk, Neehk, Sahh, Neehk, Neehk, Sahh, Dhahk, Neehk, Dhahk, Sahh, Sahh, Neehk, Neehk, Neehk, Pah, Dhahk, Neehk, Sahh, Rehh, Sahh, Sahh, Rehh, Neehk, Sahh, Neehk, Rehh, Rehh, Sahh, Sahh, Sahh, Dhahk, Neehk}";
        String expectedAvroh = "{Sahh, Neehk, Dhahk, Neehk, Neehk, Dhahk, Sahh, Neehk, Sahh, Dhahk, Dhahk, Neehk, Neehk, Neehk, Rehh, Sahh, Neehk, Dhahk, Pah, Dhahk, Dhahk, Pah, Neehk, Dhahk, Neehk, Pah, Pah, Dhahk, Dhahk, Dhahk, Sahh, Neehk, Dhahk, Pah, Mah, Pah, Pah, Mah, Dhahk, Pah, Dhahk, Mah, Mah, Pah, Pah, Pah, Neehk, Dhahk, Pah, Mah, Gahk, Mah, Mah, Gahk, Pah, Mah, Pah, Gahk, Gahk, Mah, Mah, Mah, Dhahk, Pah, Mah, Gahk, Reh, Gahk, Gahk, Reh, Mah, Gahk, Mah, Reh, Reh, Gahk, Gahk, Gahk, Pah, Mah, Gahk, Reh, Saa, Reh, Reh, Saa, Gahk, Reh, Gahk, Saa, Saa, Reh, Reh, Reh, Mah, Gahk, Reh, Saa, Neek, Saa, Saa, Neek, Reh, Saa, Reh, Neek, Neek, Saa, Saa, Saa, Gahk, Reh, Saa, Neek, Dhak, Neek, Neek, Dhak, Saa, Neek, Saa, Dhak, Dhak, Neek, Neek, Neek, Reh, Saa, Neek, Dhak, Pa, Dhak, Dhak, Pa, Neek, Dhak, Neek, Pa, Pa, Dhak, Dhak, Dhak, Saa, Neek, Dhak, Pa, Ma, Pa, Pa, Ma, Dhak, Pa, Dhak, Ma, Ma, Pa, Pa, Pa, Neek, Dhak, Pa, Ma, Gak, Ma, Ma, Gak, Pa, Ma, Pa, Gak, Gak, Ma, Ma, Ma, Dhak, Pa, Ma, Gak, Re, Gak, Gak, Re, Ma, Gak, Ma, Re, Re, Gak, Gak, Gak, Pa, Ma, Gak, Re, Sa, Re, Re, Sa, Gak, Re, Gak, Sa, Sa, Re, Re, Re, Ma, Gak, Re, Sa, Neelk, Sa, Sa, Neelk, Re, Sa, Re, Neelk, Neelk, Sa, Sa, Sa, Gak, Re}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_14"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }


    ///////////////   ALK-15   //////////////

    @Test
    ////@Disabled
    public void palyCMinorAlk_15_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Re, Re, Gak, Sa, Re, Sa, Gak, Gak, Re, Neelk, Neelk, Sa, Re, Re, Gak, Ma, Gak, Gak, Ma, Re, Gak, Re, Ma, Ma, Gak, Sa, Sa, Re, Gak, Gak, Ma, Pa, Ma, Ma, Pa, Gak, Ma, Gak, Pa, Pa, Ma, Re, Re, Gak, Ma, Ma, Pa, Dhak, Pa, Pa, Dhak, Ma, Pa, Ma, Dhak, Dhak, Pa, Gak, Gak, Ma, Pa, Pa, Dhak, Neek, Dhak, Dhak, Neek, Pa, Dhak, Pa, Neek, Neek, Dhak, Ma, Ma, Pa, Dhak, Dhak, Neek, Saa, Neek, Neek, Saa, Dhak, Neek, Dhak, Saa, Saa, Neek, Pa, Pa, Dhak, Neek, Neek, Saa, Reh, Saa, Saa, Reh, Neek, Saa, Neek, Reh, Reh, Saa, Dhak, Dhak, Neek, Saa, Saa, Reh, Gahk, Reh, Reh, Gahk, Saa, Reh, Saa, Gahk, Gahk, Reh, Neek, Neek, Saa, Reh}";
        String expectedAvroh = "{Saa, Neek, Dhak, Neek, Neek, Dhak, Saa, Neek, Saa, Dhak, Dhak, Neek, Reh, Reh, Saa, Neek, Neek, Dhak, Pa, Dhak, Dhak, Pa, Neek, Dhak, Neek, Pa, Pa, Dhak, Saa, Saa, Neek, Dhak, Dhak, Pa, Ma, Pa, Pa, Ma, Dhak, Pa, Dhak, Ma, Ma, Pa, Neek, Neek, Dhak, Pa, Pa, Ma, Gak, Ma, Ma, Gak, Pa, Ma, Pa, Gak, Gak, Ma, Dhak, Dhak, Pa, Ma, Ma, Gak, Re, Gak, Gak, Re, Ma, Gak, Ma, Re, Re, Gak, Pa, Pa, Ma, Gak, Gak, Re, Sa, Re, Re, Sa, Gak, Re, Gak, Sa, Sa, Re, Ma, Ma, Gak, Re, Re, Sa, Neelk, Sa, Sa, Neelk, Re, Sa, Re, Neelk, Neelk, Sa, Gak, Gak, Re, Sa, Sa, Neelk, Dhalk, Neelk, Neelk, Dhalk, Sa, Neelk, Sa, Dhalk, Dhalk, Neelk, Re, Re, Sa, Neelk}";

        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 1, 3, List.of("ALK_15"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    ////@Disabled
    public void palyCMinorAlk_15_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Gak, Re, Re, Gak, Sa, Re, Sa, Gak, Gak, Re, Neelk, Neelk, Sa, Re, Re, Gak, Ma, Gak, Gak, Ma, Re, Gak, Re, Ma, Ma, Gak, Sa, Sa, Re, Gak, Gak, Ma, Pa, Ma, Ma, Pa, Gak, Ma, Gak, Pa, Pa, Ma, Re, Re, Gak, Ma, Ma, Pa, Dhak, Pa, Pa, Dhak, Ma, Pa, Ma, Dhak, Dhak, Pa, Gak, Gak, Ma, Pa, Pa, Dhak, Neek, Dhak, Dhak, Neek, Pa, Dhak, Pa, Neek, Neek, Dhak, Ma, Ma, Pa, Dhak, Dhak, Neek, Saa, Neek, Neek, Saa, Dhak, Neek, Dhak, Saa, Saa, Neek, Pa, Pa, Dhak, Neek, Neek, Saa, Reh, Saa, Saa, Reh, Neek, Saa, Neek, Reh, Reh, Saa, Dhak, Dhak, Neek, Saa, Saa, Reh, Gahk, Reh, Reh, Gahk, Saa, Reh, Saa, Gahk, Gahk, Reh, Neek, Neek, Saa, Reh, Reh, Gahk, Mah, Gahk, Gahk, Mah, Reh, Gahk, Reh, Mah, Mah, Gahk, Saa, Saa, Reh, Gahk, Gahk, Mah, Pah, Mah, Mah, Pah, Gahk, Mah, Gahk, Pah, Pah, Mah, Reh, Reh, Gahk, Mah, Mah, Pah, Dhahk, Pah, Pah, Dhahk, Mah, Pah, Mah, Dhahk, Dhahk, Pah, Gahk, Gahk, Mah, Pah, Pah, Dhahk, Neehk, Dhahk, Dhahk, Neehk, Pah, Dhahk, Pah, Neehk, Neehk, Dhahk, Mah, Mah, Pah, Dhahk, Dhahk, Neehk, Sahh, Neehk, Neehk, Sahh, Dhahk, Neehk, Dhahk, Sahh, Sahh, Neehk, Pah, Pah, Dhahk, Neehk, Neehk, Sahh, Rehh, Sahh, Sahh, Rehh, Neehk, Sahh, Neehk, Rehh, Rehh, Sahh, Dhahk, Dhahk, Neehk, Sahh}";
        String expectedAvroh = "{Sahh, Neehk, Dhahk, Neehk, Neehk, Dhahk, Sahh, Neehk, Sahh, Dhahk, Dhahk, Neehk, Rehh, Rehh, Sahh, Neehk, Neehk, Dhahk, Pah, Dhahk, Dhahk, Pah, Neehk, Dhahk, Neehk, Pah, Pah, Dhahk, Sahh, Sahh, Neehk, Dhahk, Dhahk, Pah, Mah, Pah, Pah, Mah, Dhahk, Pah, Dhahk, Mah, Mah, Pah, Neehk, Neehk, Dhahk, Pah, Pah, Mah, Gahk, Mah, Mah, Gahk, Pah, Mah, Pah, Gahk, Gahk, Mah, Dhahk, Dhahk, Pah, Mah, Mah, Gahk, Reh, Gahk, Gahk, Reh, Mah, Gahk, Mah, Reh, Reh, Gahk, Pah, Pah, Mah, Gahk, Gahk, Reh, Saa, Reh, Reh, Saa, Gahk, Reh, Gahk, Saa, Saa, Reh, Mah, Mah, Gahk, Reh, Reh, Saa, Neek, Saa, Saa, Neek, Reh, Saa, Reh, Neek, Neek, Saa, Gahk, Gahk, Reh, Saa, Saa, Neek, Dhak, Neek, Neek, Dhak, Saa, Neek, Saa, Dhak, Dhak, Neek, Reh, Reh, Saa, Neek, Neek, Dhak, Pa, Dhak, Dhak, Pa, Neek, Dhak, Neek, Pa, Pa, Dhak, Saa, Saa, Neek, Dhak, Dhak, Pa, Ma, Pa, Pa, Ma, Dhak, Pa, Dhak, Ma, Ma, Pa, Neek, Neek, Dhak, Pa, Pa, Ma, Gak, Ma, Ma, Gak, Pa, Ma, Pa, Gak, Gak, Ma, Dhak, Dhak, Pa, Ma, Ma, Gak, Re, Gak, Gak, Re, Ma, Gak, Ma, Re, Re, Gak, Pa, Pa, Ma, Gak, Gak, Re, Sa, Re, Re, Sa, Gak, Re, Gak, Sa, Sa, Re, Ma, Ma, Gak, Re, Re, Sa, Neelk, Sa, Sa, Neelk, Re, Sa, Re, Neelk, Neelk, Sa, Gak, Gak, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MINOR_SCALE", 2, 3, List.of("ALK_15"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }






}