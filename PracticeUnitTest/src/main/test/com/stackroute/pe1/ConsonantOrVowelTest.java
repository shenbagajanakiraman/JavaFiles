package com.stackroute.pe1;

import com.stackroute.pe1.ConsonantOrVowel;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConsonantOrVowelTest extends ConsonantOrVowel {

    ConsonantOrVowel chk;
    String strCheck;

    @Before
    public void setUp() throws Exception {
        chk = new ConsonantOrVowel();

    }

    @Test
    public void check() {
        // Arrange
        String str = "Reshma";

        // Act
        strCheck = chk.findType(str);

        //Assert
        assertEquals("R - Consonant \ne - Vowel \ns - Consonant \nh - Consonant \nm - Consonant \na - Vowel \n",strCheck);




    }
}