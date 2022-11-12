package com.swar.swaranjali.controller;

import com.swar.swaranjali.Utils;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import java.util.List;
import static org.assertj.core.api.Java6Assertions.assertThat;


@SpringBootTest
class C_Major_SwaranjaliControllerTest {

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
    public void palyCMajorAlk_0_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Ma, Pa, Dha, Nee, Saa}";
        String expectedAvroh = "{Saa, Nee, Dha, Pa, Ma, Ga, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 1, 3, List.of("ALK_0"),
                120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMajorAlk_0_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Ma, Pa, Dha, Nee, Saa, Reh, Gah, Mah, Pah, Dhah, Neeh, Sahh}";
        String expectedAvroh = "{Sahh, Neeh, Dhah, Pah, Mah, Gah, Reh, Saa, Nee, Dha, Pa, Ma, Ga, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 2, 3, List.of("ALK_0"),
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
    public void palyCMajorAlk_1_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Re, Ga, Ma, Ga, Ma, Pa, Ma, Pa, Dha, Pa, Dha, Nee, Dha, Nee, Saa}";
        String expectedAvroh = "{Saa, Nee, Dha, Nee, Dha, Pa, Dha, Pa, Ma, Pa, Ma, Ga, Ma, Ga, Re, Ga, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 1, 3, List.of("ALK_1"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMajorAlk_1_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Re, Ga, Ma, Ga, Ma, Pa, Ma, Pa, Dha, Pa, Dha, Nee, Dha, Nee, Saa, Nee, Saa, Reh, Saa, Reh, Gah, Reh, Gah, Mah, Gah, Mah, Pah, Mah, Pah, Dhah, Pah, Dhah, Neeh, Dhah, Neeh, Sahh}";
        String expectedAvroh = "{Sahh, Neeh, Dhah, Neeh, Dhah, Pah, Dhah, Pah, Mah, Pah, Mah, Gah, Mah, Gah, Reh, Gah, Reh, Saa, Reh, Saa, Nee, Saa, Nee, Dha, Nee, Dha, Pa, Dha, Pa, Ma, Pa, Ma, Ga, Ma, Ga, Re, Ga, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 2, 3, List.of("ALK_1"),
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
    public void palyCMajorAlk_2_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Ga, Re, Ga, Ma, Ma, Ga, Ma, Pa, Pa, Ma, Pa, Dha, Dha, Pa, Dha, Nee, Nee, Dha, Nee, Saa, Saa}";
        String expectedAvroh = "{Saa, Nee, Dha, Dha, Nee, Dha, Pa, Pa, Dha, Pa, Ma, Ma, Pa, Ma, Ga, Ga, Ma, Ga, Re, Re, Ga, Re, Sa, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 1, 3, List.of("ALK_2"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMajorAlk_2_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Ga, Re, Ga, Ma, Ma, Ga, Ma, Pa, Pa, Ma, Pa, Dha, Dha, Pa, Dha, Nee, Nee, Dha, Nee, Saa, Saa, Nee, Saa, Reh, Reh, Saa, Reh, Gah, Gah, Reh, Gah, Mah, Mah, Gah, Mah, Pah, Pah, Mah, Pah, Dhah, Dhah, Pah, Dhah, Neeh, Neeh, Dhah, Neeh, Sahh, Sahh}";
        String expectedAvroh = "{Sahh, Neeh, Dhah, Dhah, Neeh, Dhah, Pah, Pah, Dhah, Pah, Mah, Mah, Pah, Mah, Gah, Gah, Mah, Gah, Reh, Reh, Gah, Reh, Saa, Saa, Reh, Saa, Nee, Nee, Saa, Nee, Dha, Dha, Nee, Dha, Pa, Pa, Dha, Pa, Ma, Ma, Pa, Ma, Ga, Ga, Ma, Ga, Re, Re, Ga, Re, Sa, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 2, 3, List.of("ALK_2"),
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
    public void palyCMajorAlk_3_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Re, Ga, Re, Ga, Ga, Ma, Ga, Ma, Ma, Pa, Ma, Pa, Pa, Dha, Pa, Dha, Dha, Nee, Dha, Nee, Nee, Saa}";
        String expectedAvroh = "{Saa, Nee, Nee, Dha, Nee, Dha, Dha, Pa, Dha, Pa, Pa, Ma, Pa, Ma, Ma, Ga, Ma, Ga, Ga, Re, Ga, Re, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 1, 3, List.of("ALK_3"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMajorAlk_3_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Re, Ga, Re, Ga, Ga, Ma, Ga, Ma, Ma, Pa, Ma, Pa, Pa, Dha, Pa, Dha, Dha, Nee, Dha, Nee, Nee, Saa, Nee, Saa, Saa, Reh, Saa, Reh, Reh, Gah, Reh, Gah, Gah, Mah, Gah, Mah, Mah, Pah, Mah, Pah, Pah, Dhah, Pah, Dhah, Dhah, Neeh, Dhah, Neeh, Neeh, Sahh}";
        String expectedAvroh = "{Sahh, Neeh, Neeh, Dhah, Neeh, Dhah, Dhah, Pah, Dhah, Pah, Pah, Mah, Pah, Mah, Mah, Gah, Mah, Gah, Gah, Reh, Gah, Reh, Reh, Saa, Reh, Saa, Saa, Nee, Saa, Nee, Nee, Dha, Nee, Dha, Dha, Pa, Dha, Pa, Pa, Ma, Pa, Ma, Ma, Ga, Ma, Ga, Ga, Re, Ga, Re, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 2, 3, List.of("ALK_3"),
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
    public void palyCMajorAlk_4_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Sa, Re, Ga, Re, Re, Ga, Ma, Ga, Ga, Ma, Pa, Ma, Ma, Pa, Dha, Pa, Pa, Dha, Nee, Dha, Dha, Nee, Saa}";
        String expectedAvroh = "{Saa, Saa, Nee, Dha, Nee, Nee, Dha, Pa, Dha, Dha, Pa, Ma, Pa, Pa, Ma, Ga, Ma, Ma, Ga, Re, Ga, Ga, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 1, 3, List.of("ALK_4"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMajorAlk_4_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Sa, Re, Ga, Re, Re, Ga, Ma, Ga, Ga, Ma, Pa, Ma, Ma, Pa, Dha, Pa, Pa, Dha, Nee, Dha, Dha, Nee, Saa, Nee, Nee, Saa, Reh, Saa, Saa, Reh, Gah, Reh, Reh, Gah, Mah, Gah, Gah, Mah, Pah, Mah, Mah, Pah, Dhah, Pah, Pah, Dhah, Neeh, Dhah, Dhah, Neeh, Sahh}";
        String expectedAvroh = "{Sahh, Sahh, Neeh, Dhah, Neeh, Neeh, Dhah, Pah, Dhah, Dhah, Pah, Mah, Pah, Pah, Mah, Gah, Mah, Mah, Gah, Reh, Gah, Gah, Reh, Saa, Reh, Reh, Saa, Nee, Saa, Saa, Nee, Dha, Nee, Nee, Dha, Pa, Dha, Dha, Pa, Ma, Pa, Pa, Ma, Ga, Ma, Ma, Ga, Re, Ga, Ga, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 2, 3, List.of("ALK_4"),
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
    public void palyCMajorAlk_5_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Ma, Re, Ga, Ma, Pa, Ga, Ma, Pa, Dha, Ma, Pa, Dha, Nee, Pa, Dha, Nee, Saa}";
        String expectedAvroh = "{Saa, Nee, Dha, Pa, Nee, Dha, Pa, Ma, Dha, Pa, Ma, Ga, Pa, Ma, Ga, Re, Ma, Ga, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 1, 3, List.of("ALK_5"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMajorAlk_5_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Ma, Re, Ga, Ma, Pa, Ga, Ma, Pa, Dha, Ma, Pa, Dha, Nee, Pa, Dha, Nee, Saa, Dha, Nee, Saa, Reh, Nee, Saa, Reh, Gah, Saa, Reh, Gah, Mah, Reh, Gah, Mah, Pah, Gah, Mah, Pah, Dhah, Mah, Pah, Dhah, Neeh, Pah, Dhah, Neeh, Sahh}";
        String expectedAvroh = "{Sahh, Neeh, Dhah, Pah, Neeh, Dhah, Pah, Mah, Dhah, Pah, Mah, Gah, Pah, Mah, Gah, Reh, Mah, Gah, Reh, Saa, Gah, Reh, Saa, Nee, Reh, Saa, Nee, Dha, Saa, Nee, Dha, Pa, Nee, Dha, Pa, Ma, Dha, Pa, Ma, Ga, Pa, Ma, Ga, Re, Ma, Ga, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 2, 3, List.of("ALK_5"),
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
    public void palyCMajorAlk_6_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Ga, Re, Sa, Re, Ma, Ga, Re, Ga, Pa, Ma, Ga, Ma, Dha, Pa, Ma, Pa, Nee, Dha, Pa, Dha, Saa, Nee, Dha}";
        String expectedAvroh = "{Saa, Dha, Nee, Saa, Nee, Pa, Dha, Nee, Dha, Ma, Pa, Dha, Pa, Ga, Ma, Pa, Ma, Re, Ga, Ma, Ga, Sa, Re, Ga}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 1, 3, List.of("ALK_6"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMajorAlk_6_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Ga, Re, Sa, Re, Ma, Ga, Re, Ga, Pa, Ma, Ga, Ma, Dha, Pa, Ma, Pa, Nee, Dha, Pa, Dha, Saa, Nee, Dha, Nee, Reh, Saa, Nee, Saa, Gah, Reh, Saa, Reh, Mah, Gah, Reh, Gah, Pah, Mah, Gah, Mah, Dhah, Pah, Mah, Pah, Neeh, Dhah, Pah, Dhah, Sahh, Neeh, Dhah}";
        String expectedAvroh = "{Sahh, Dhah, Neeh, Sahh, Neeh, Pah, Dhah, Neeh, Dhah, Mah, Pah, Dhah, Pah, Gah, Mah, Pah, Mah, Reh, Gah, Mah, Gah, Saa, Reh, Gah, Reh, Nee, Saa, Reh, Saa, Dha, Nee, Saa, Nee, Pa, Dha, Nee, Dha, Ma, Pa, Dha, Pa, Ga, Ma, Pa, Ma, Re, Ga, Ma, Ga, Sa, Re, Ga}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 2, 3, List.of("ALK_6"),
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
    public void palyCMajorAlk_7_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Ga, Re, Ga, Re, Ma, Ga, Ma, Ga, Pa, Ma, Pa, Ma, Dha, Pa, Dha, Pa, Nee, Dha, Nee, Dha, Saa, Nee, Saa}";
        String expectedAvroh = "{Saa, Dha, Nee, Dha, Nee, Pa, Dha, Pa, Dha, Ma, Pa, Ma, Pa, Ga, Ma, Ga, Ma, Re, Ga, Re, Ga, Sa, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 1, 3, List.of("ALK_7"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMajorAlk_7_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Ga, Re, Ga, Re, Ma, Ga, Ma, Ga, Pa, Ma, Pa, Ma, Dha, Pa, Dha, Pa, Nee, Dha, Nee, Dha, Saa, Nee, Saa, Nee, Reh, Saa, Reh, Saa, Gah, Reh, Gah, Reh, Mah, Gah, Mah, Gah, Pah, Mah, Pah, Mah, Dhah, Pah, Dhah, Pah, Neeh, Dhah, Neeh, Dhah, Sahh, Neeh, Sahh}";
        String expectedAvroh = "{Sahh, Dhah, Neeh, Dhah, Neeh, Pah, Dhah, Pah, Dhah, Mah, Pah, Mah, Pah, Gah, Mah, Gah, Mah, Reh, Gah, Reh, Gah, Saa, Reh, Saa, Reh, Nee, Saa, Nee, Saa, Dha, Nee, Dha, Nee, Pa, Dha, Pa, Dha, Ma, Pa, Ma, Pa, Ga, Ma, Ga, Ma, Re, Ga, Re, Ga, Sa, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 2, 3, List.of("ALK_7"),
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
    public void palyCMajorAlk_8_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Re, Ga, Ma, Re, Ga, Ma, Ga, Ma, Pa, Ga, Ma, Pa, Ma, Pa, Dha, Ma, Pa, Dha, Pa, Dha, Nee, Pa, Dha, Nee, Dha, Nee, Saa}";
        String expectedAvroh = "{Saa, Nee, Dha, Nee, Dha, Pa, Nee, Dha, Pa, Dha, Pa, Ma, Dha, Pa, Ma, Pa, Ma, Ga, Pa, Ma, Ga, Ma, Ga, Re, Ma, Ga, Re, Ga, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 1, 3, List.of("ALK_8"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMajorAlk_8_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Re, Ga, Ma, Re, Ga, Ma, Ga, Ma, Pa, Ga, Ma, Pa, Ma, Pa, Dha, Ma, Pa, Dha, Pa, Dha, Nee, Pa, Dha, Nee, Dha, Nee, Saa, Dha, Nee, Saa, Nee, Saa, Reh, Nee, Saa, Reh, Saa, Reh, Gah, Saa, Reh, Gah, Reh, Gah, Mah, Reh, Gah, Mah, Gah, Mah, Pah, Gah, Mah, Pah, Mah, Pah, Dhah, Mah, Pah, Dhah, Pah, Dhah, Neeh, Pah, Dhah, Neeh, Dhah, Neeh, Sahh}";
        String expectedAvroh = "{Sahh, Neeh, Dhah, Neeh, Dhah, Pah, Neeh, Dhah, Pah, Dhah, Pah, Mah, Dhah, Pah, Mah, Pah, Mah, Gah, Pah, Mah, Gah, Mah, Gah, Reh, Mah, Gah, Reh, Gah, Reh, Saa, Gah, Reh, Saa, Reh, Saa, Nee, Reh, Saa, Nee, Saa, Nee, Dha, Saa, Nee, Dha, Nee, Dha, Pa, Nee, Dha, Pa, Dha, Pa, Ma, Dha, Pa, Ma, Pa, Ma, Ga, Pa, Ma, Ga, Ma, Ga, Re, Ma, Ga, Re, Ga, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 2, 3, List.of("ALK_8"),
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
    public void palyCMajorAlk_9_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Re, Ga, Ma, Re, Ga, Ma, Sa, Re, Ga, Re, Ga, Ma, Ga, Ma, Pa, Ga, Ma, Pa, Re, Ga, Ma, Ga, Ma, Pa, Ma, Pa, Dha, Ma, Pa, Dha, Ga, Ma, Pa, Ma, Pa, Dha, Pa, Dha, Nee, Pa, Dha, Nee, Ma, Pa, Dha, Pa, Dha, Nee, Dha, Nee, Saa, Dha, Nee, Saa, Pa, Dha, Nee}";
        String expectedAvroh = "{Saa, Nee, Dha, Nee, Dha, Pa, Nee, Dha, Pa, Saa, Nee, Dha, Nee, Dha, Pa, Dha, Pa, Ma, Dha, Pa, Ma, Nee, Dha, Pa, Dha, Pa, Ma, Pa, Ma, Ga, Pa, Ma, Ga, Dha, Pa, Ma, Pa, Ma, Ga, Ma, Ga, Re, Ma, Ga, Re, Pa, Ma, Ga, Ma, Ga, Re, Ga, Re, Sa, Ga, Re, Sa, Ma, Ga, Re}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 1, 3, List.of("ALK_9"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMajorAlk_9_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Re, Ga, Ma, Re, Ga, Ma, Sa, Re, Ga, Re, Ga, Ma, Ga, Ma, Pa, Ga, Ma, Pa, Re, Ga, Ma, Ga, Ma, Pa, Ma, Pa, Dha, Ma, Pa, Dha, Ga, Ma, Pa, Ma, Pa, Dha, Pa, Dha, Nee, Pa, Dha, Nee, Ma, Pa, Dha, Pa, Dha, Nee, Dha, Nee, Saa, Dha, Nee, Saa, Pa, Dha, Nee, Dha, Nee, Saa, Nee, Saa, Reh, Nee, Saa, Reh, Dha, Nee, Saa, Nee, Saa, Reh, Saa, Reh, Gah, Saa, Reh, Gah, Nee, Saa, Reh, Saa, Reh, Gah, Reh, Gah, Mah, Reh, Gah, Mah, Saa, Reh, Gah, Reh, Gah, Mah, Gah, Mah, Pah, Gah, Mah, Pah, Reh, Gah, Mah, Gah, Mah, Pah, Mah, Pah, Dhah, Mah, Pah, Dhah, Gah, Mah, Pah, Mah, Pah, Dhah, Pah, Dhah, Neeh, Pah, Dhah, Neeh, Mah, Pah, Dhah, Pah, Dhah, Neeh, Dhah, Neeh, Sahh, Dhah, Neeh, Sahh, Pah, Dhah, Neeh}";
        String expectedAvroh = "{Sahh, Neeh, Dhah, Neeh, Dhah, Pah, Neeh, Dhah, Pah, Sahh, Neeh, Dhah, Neeh, Dhah, Pah, Dhah, Pah, Mah, Dhah, Pah, Mah, Neeh, Dhah, Pah, Dhah, Pah, Mah, Pah, Mah, Gah, Pah, Mah, Gah, Dhah, Pah, Mah, Pah, Mah, Gah, Mah, Gah, Reh, Mah, Gah, Reh, Pah, Mah, Gah, Mah, Gah, Reh, Gah, Reh, Saa, Gah, Reh, Saa, Mah, Gah, Reh, Gah, Reh, Saa, Reh, Saa, Nee, Reh, Saa, Nee, Gah, Reh, Saa, Reh, Saa, Nee, Saa, Nee, Dha, Saa, Nee, Dha, Reh, Saa, Nee, Saa, Nee, Dha, Nee, Dha, Pa, Nee, Dha, Pa, Saa, Nee, Dha, Nee, Dha, Pa, Dha, Pa, Ma, Dha, Pa, Ma, Nee, Dha, Pa, Dha, Pa, Ma, Pa, Ma, Ga, Pa, Ma, Ga, Dha, Pa, Ma, Pa, Ma, Ga, Ma, Ga, Re, Ma, Ga, Re, Pa, Ma, Ga, Ma, Ga, Re, Ga, Re, Sa, Ga, Re, Sa, Ma, Ga, Re}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 2, 3, List.of("ALK_9"),
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
    public void palyCMajorAlk_10_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Re, Ga, Neel, Sa, Re, Ga, Ma, Ga, Ma, Sa, Re, Ga, Ma, Pa, Ma, Pa, Re, Ga, Ma, Pa, Dha, Pa, Dha, Ga, Ma, Pa, Dha, Nee, Dha, Nee, Ma, Pa, Dha, Nee, Saa, Nee, Saa, Pa, Dha, Nee, Saa, Reh, Saa, Reh, Dha, Nee, Saa, Reh, Gah, Reh, Gah, Nee, Saa}";
        String expectedAvroh = "{Saa, Nee, Dha, Nee, Dha, Reh, Saa, Nee, Dha, Pa, Dha, Pa, Saa, Nee, Dha, Pa, Ma, Pa, Ma, Nee, Dha, Pa, Ma, Ga, Ma, Ga, Dha, Pa, Ma, Ga, Re, Ga, Re, Pa, Ma, Ga, Re, Sa, Re, Sa, Ma, Ga, Re, Sa, Neel, Sa, Neel, Ga, Re, Sa, Neel, Dhal, Neel, Dhal, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 1, 3, List.of("ALK_10"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMajorAlk_10_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Re, Ga, Neel, Sa, Re, Ga, Ma, Ga, Ma, Sa, Re, Ga, Ma, Pa, Ma, Pa, Re, Ga, Ma, Pa, Dha, Pa, Dha, Ga, Ma, Pa, Dha, Nee, Dha, Nee, Ma, Pa, Dha, Nee, Saa, Nee, Saa, Pa, Dha, Nee, Saa, Reh, Saa, Reh, Dha, Nee, Saa, Reh, Gah, Reh, Gah, Nee, Saa, Reh, Gah, Mah, Gah, Mah, Saa, Reh, Gah, Mah, Pah, Mah, Pah, Reh, Gah, Mah, Pah, Dhah, Pah, Dhah, Gah, Mah, Pah, Dhah, Neeh, Dhah, Neeh, Mah, Pah, Dhah, Neeh, Sahh, Neeh, Sahh, Pah, Dhah, Neeh, Sahh, Rehh, Sahh, Rehh, Dhah, Neeh}";
        String expectedAvroh = "{Sahh, Neeh, Dhah, Neeh, Dhah, Rehh, Sahh, Neeh, Dhah, Pah, Dhah, Pah, Sahh, Neeh, Dhah, Pah, Mah, Pah, Mah, Neeh, Dhah, Pah, Mah, Gah, Mah, Gah, Dhah, Pah, Mah, Gah, Reh, Gah, Reh, Pah, Mah, Gah, Reh, Saa, Reh, Saa, Mah, Gah, Reh, Saa, Nee, Saa, Nee, Gah, Reh, Saa, Nee, Dha, Nee, Dha, Reh, Saa, Nee, Dha, Pa, Dha, Pa, Saa, Nee, Dha, Pa, Ma, Pa, Ma, Nee, Dha, Pa, Ma, Ga, Ma, Ga, Dha, Pa, Ma, Ga, Re, Ga, Re, Pa, Ma, Ga, Re, Sa, Re, Sa, Ma, Ga, Re, Sa, Neel, Sa, Neel, Ga, Re}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 2, 3, List.of("ALK_10"),
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
    public void palyCMajorAlk_11_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Ga, Re, Sa, Re, Ga, Ma, Ma, Ga, Re, Ga, Ma, Pa, Pa, Ma, Ga, Ma, Pa, Dha, Dha, Pa, Ma, Pa, Dha, Nee, Nee, Dha, Pa, Dha, Nee, Saa, Saa, Nee, Dha}";
        String expectedAvroh = "{Saa, Nee, Dha, Dha, Nee, Saa, Nee, Dha, Pa, Pa, Dha, Nee, Dha, Pa, Ma, Ma, Pa, Dha, Pa, Ma, Ga, Ga, Ma, Pa, Ma, Ga, Re, Re, Ga, Ma, Ga, Re, Sa, Sa, Re, Ga}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 1, 3, List.of("ALK_11"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMajorAlk_11_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Ga, Re, Sa, Re, Ga, Ma, Ma, Ga, Re, Ga, Ma, Pa, Pa, Ma, Ga, Ma, Pa, Dha, Dha, Pa, Ma, Pa, Dha, Nee, Nee, Dha, Pa, Dha, Nee, Saa, Saa, Nee, Dha, Nee, Saa, Reh, Reh, Saa, Nee, Saa, Reh, Gah, Gah, Reh, Saa, Reh, Gah, Mah, Mah, Gah, Reh, Gah, Mah, Pah, Pah, Mah, Gah, Mah, Pah, Dhah, Dhah, Pah, Mah, Pah, Dhah, Neeh, Neeh, Dhah, Pah, Dhah, Neeh, Sahh, Sahh, Neeh, Dhah}";
        String expectedAvroh = "{Sahh, Neeh, Dhah, Dhah, Neeh, Sahh, Neeh, Dhah, Pah, Pah, Dhah, Neeh, Dhah, Pah, Mah, Mah, Pah, Dhah, Pah, Mah, Gah, Gah, Mah, Pah, Mah, Gah, Reh, Reh, Gah, Mah, Gah, Reh, Saa, Saa, Reh, Gah, Reh, Saa, Nee, Nee, Saa, Reh, Saa, Nee, Dha, Dha, Nee, Saa, Nee, Dha, Pa, Pa, Dha, Nee, Dha, Pa, Ma, Ma, Pa, Dha, Pa, Ma, Ga, Ga, Ma, Pa, Ma, Ga, Re, Re, Ga, Ma, Ga, Re, Sa, Sa, Re, Ga}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 2, 3, List.of("ALK_11"),
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
    public void palyCMajorAlk_12_One_Octave() throws Exception {

        String expectedArroh = "{Ga, Re, Ga, Sa, Re, Ga, Neel, Sa, Ma, Ga, Ma, Re, Ga, Ma, Sa, Re, Pa, Ma, Pa, Ga, Ma, Pa, Re, Ga, Dha, Pa, Dha, Ma, Pa, Dha, Ga, Ma, Nee, Dha, Nee, Pa, Dha, Nee, Ma, Pa, Saa, Nee, Saa, Dha, Nee, Saa, Pa, Dha, Reh, Saa, Reh, Nee, Saa, Reh, Dha, Nee, Gah, Reh, Gah, Saa, Reh, Gah, Nee, Saa}";
        String expectedAvroh = "{Dha, Nee, Dha, Saa, Nee, Dha, Reh, Saa, Pa, Dha, Pa, Nee, Dha, Pa, Saa, Nee, Ma, Pa, Ma, Dha, Pa, Ma, Nee, Dha, Ga, Ma, Ga, Pa, Ma, Ga, Dha, Pa, Re, Ga, Re, Ma, Ga, Re, Pa, Ma, Sa, Re, Sa, Ga, Re, Sa, Ma, Ga, Neel, Sa, Neel, Re, Sa, Neel, Ga, Re, Dhal, Neel, Dhal, Sa, Neel, Dhal, Re, Sa}";

        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 1, 3, List.of("ALK_12"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    //@Disabled
    public void palyCMajorAlk_12_Two_Octave() throws Exception {

        String expectedArroh = "{Ga, Re, Ga, Sa, Re, Ga, Neel, Sa, Ma, Ga, Ma, Re, Ga, Ma, Sa, Re, Pa, Ma, Pa, Ga, Ma, Pa, Re, Ga, Dha, Pa, Dha, Ma, Pa, Dha, Ga, Ma, Nee, Dha, Nee, Pa, Dha, Nee, Ma, Pa, Saa, Nee, Saa, Dha, Nee, Saa, Pa, Dha, Reh, Saa, Reh, Nee, Saa, Reh, Dha, Nee, Gah, Reh, Gah, Saa, Reh, Gah, Nee, Saa, Mah, Gah, Mah, Reh, Gah, Mah, Saa, Reh, Pah, Mah, Pah, Gah, Mah, Pah, Reh, Gah, Dhah, Pah, Dhah, Mah, Pah, Dhah, Gah, Mah, Neeh, Dhah, Neeh, Pah, Dhah, Neeh, Mah, Pah, Sahh, Neeh, Sahh, Dhah, Neeh, Sahh, Pah, Dhah, Rehh, Sahh, Rehh, Neeh, Sahh, Rehh, Dhah, Neeh, Gahh, Rehh, Gahh, Sahh, Rehh, Gahh, Neeh, Sahh}";
        String expectedAvroh = "{Dhah, Neeh, Dhah, Sahh, Neeh, Dhah, Rehh, Sahh, Pah, Dhah, Pah, Neeh, Dhah, Pah, Sahh, Neeh, Mah, Pah, Mah, Dhah, Pah, Mah, Neeh, Dhah, Gah, Mah, Gah, Pah, Mah, Gah, Dhah, Pah, Reh, Gah, Reh, Mah, Gah, Reh, Pah, Mah, Saa, Reh, Saa, Gah, Reh, Saa, Mah, Gah, Nee, Saa, Nee, Reh, Saa, Nee, Gah, Reh, Dha, Nee, Dha, Saa, Nee, Dha, Reh, Saa, Pa, Dha, Pa, Nee, Dha, Pa, Saa, Nee, Ma, Pa, Ma, Dha, Pa, Ma, Nee, Dha, Ga, Ma, Ga, Pa, Ma, Ga, Dha, Pa, Re, Ga, Re, Ma, Ga, Re, Pa, Ma, Sa, Re, Sa, Ga, Re, Sa, Ma, Ga, Neel, Sa, Neel, Re, Sa, Neel, Ga, Re, Dhal, Neel, Dhal, Sa, Neel, Dhal, Re, Sa}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 2, 3, List.of("ALK_12"),
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
    public void palyCMajorAlk_13_One_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Re, Sa, Ga, Re, Sa, Ga, Re, Re, Ga, Ma, Ga, Re, Ma, Ga, Re, Ma, Ga, Ga, Ma, Pa, Ma, Ga, Pa, Ma, Ga, Pa, Ma, Ma, Pa, Dha, Pa, Ma, Dha, Pa, Ma, Dha, Pa, Pa, Dha, Nee, Dha, Pa, Nee, Dha, Pa, Nee, Dha, Dha, Nee, Saa, Nee, Dha, Saa, Nee, Dha, Saa, Nee, Nee, Saa, Reh, Saa, Nee, Reh, Saa, Nee, Reh, Saa, Saa, Reh, Gah, Reh, Saa, Gah, Reh, Saa, Gah, Reh}";
        String expectedAvroh = "{Saa, Nee, Dha, Nee, Saa, Dha, Nee, Saa, Dha, Nee, Nee, Dha, Pa, Dha, Nee, Pa, Dha, Nee, Pa, Dha, Dha, Pa, Ma, Pa, Dha, Ma, Pa, Dha, Ma, Pa, Pa, Ma, Ga, Ma, Pa, Ga, Ma, Pa, Ga, Ma, Ma, Ga, Re, Ga, Ma, Re, Ga, Ma, Re, Ga, Ga, Re, Sa, Re, Ga, Sa, Re, Ga, Sa, Re, Re, Sa, Neel, Sa, Re, Neel, Sa, Re, Neel, Sa, Sa, Neel, Dhal, Neel, Sa, Dhal, Neel, Sa, Dhal, Neel}";

        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 1, 3, List.of("ALK_13"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }

    @Test
    ////@Disabled
    public void palyCMajorAlk_13_Two_Octave() throws Exception {

        String expectedArroh = "{Sa, Re, Ga, Re, Sa, Ga, Re, Sa, Ga, Re, Re, Ga, Ma, Ga, Re, Ma, Ga, Re, Ma, Ga, Ga, Ma, Pa, Ma, Ga, Pa, Ma, Ga, Pa, Ma, Ma, Pa, Dha, Pa, Ma, Dha, Pa, Ma, Dha, Pa, Pa, Dha, Nee, Dha, Pa, Nee, Dha, Pa, Nee, Dha, Dha, Nee, Saa, Nee, Dha, Saa, Nee, Dha, Saa, Nee, Nee, Saa, Reh, Saa, Nee, Reh, Saa, Nee, Reh, Saa, Saa, Reh, Gah, Reh, Saa, Gah, Reh, Saa, Gah, Reh, Reh, Gah, Mah, Gah, Reh, Mah, Gah, Reh, Mah, Gah, Gah, Mah, Pah, Mah, Gah, Pah, Mah, Gah, Pah, Mah, Mah, Pah, Dhah, Pah, Mah, Dhah, Pah, Mah, Dhah, Pah, Pah, Dhah, Neeh, Dhah, Pah, Neeh, Dhah, Pah, Neeh, Dhah, Dhah, Neeh, Sahh, Neeh, Dhah, Sahh, Neeh, Dhah, Sahh, Neeh, Neeh, Sahh, Rehh, Sahh, Neeh, Rehh, Sahh, Neeh, Rehh, Sahh, Sahh, Rehh, Gahh, Rehh, Sahh, Gahh, Rehh, Sahh, Gahh, Rehh}";
        String expectedAvroh = "{Sahh, Neeh, Dhah, Neeh, Sahh, Dhah, Neeh, Sahh, Dhah, Neeh, Neeh, Dhah, Pah, Dhah, Neeh, Pah, Dhah, Neeh, Pah, Dhah, Dhah, Pah, Mah, Pah, Dhah, Mah, Pah, Dhah, Mah, Pah, Pah, Mah, Gah, Mah, Pah, Gah, Mah, Pah, Gah, Mah, Mah, Gah, Reh, Gah, Mah, Reh, Gah, Mah, Reh, Gah, Gah, Reh, Saa, Reh, Gah, Saa, Reh, Gah, Saa, Reh, Reh, Saa, Nee, Saa, Reh, Nee, Saa, Reh, Nee, Saa, Saa, Nee, Dha, Nee, Saa, Dha, Nee, Saa, Dha, Nee, Nee, Dha, Pa, Dha, Nee, Pa, Dha, Nee, Pa, Dha, Dha, Pa, Ma, Pa, Dha, Ma, Pa, Dha, Ma, Pa, Pa, Ma, Ga, Ma, Pa, Ga, Ma, Pa, Ga, Ma, Ma, Ga, Re, Ga, Ma, Re, Ga, Ma, Re, Ga, Ga, Re, Sa, Re, Ga, Sa, Re, Ga, Sa, Re, Re, Sa, Neel, Sa, Re, Neel, Sa, Re, Neel, Sa, Sa, Neel, Dhal, Neel, Sa, Dhal, Neel, Sa, Dhal, Neel}";


        ResponseEntity<List<List<Integer>>> listResponseEntity =
                swaranjaliController.playAlankar("C", "MAJOR_SCALE", 2, 3, List.of("ALK_13"),
                        120, "AC_GUITAR", false);
        List<List<Integer>> aarovAndAvrov = listResponseEntity.getBody();
        String actualAarov = Utils.printNotes(aarovAndAvrov.get(0), 48);
        String actualAvrov = Utils.printNotes(aarovAndAvrov.get(1), 48);
        assertThat(actualAarov).isEqualTo(expectedArroh);
        assertThat(actualAvrov).isEqualTo(expectedAvroh);
    }


    @Test
    public void test123() {


        List<Integer> test = List.of(72, 71, 69,     71, 69, 67,      69, 67, 65,      67, 65, 64,
                65, 64, 62,     64, 62, 60,      62, 60, 59,      60, 59, 60,
                59, 57, 59,     57, 55, 57,      55, 53, 55,      53, 52, 53,

                52, 50, 52);
        Utils.printNotes(test, 48);
    }



}