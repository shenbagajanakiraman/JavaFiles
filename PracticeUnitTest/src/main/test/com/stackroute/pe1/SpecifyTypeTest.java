package com.stackroute.pe1;

import com.stackroute.pe1.SpecifyType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpecifyTypeTest extends SpecifyType {

    SpecifyType chk;
    char ch;

    @Before
    public void setUp() throws Exception {
        chk = new SpecifyType();
    }

    @After
    public void tearDown() throws Exception {
        chk = null;
    }

    @Test
    public void testCheckSmallLetter() {
        // Arrange
        ch = 's';

        // Act
        String str = chk.checkTypeLetterOrSpecialCharacterOrNumber(ch);

        // Assert
        assertEquals("Small letter",str);

    }

    @Test
    public void testCheckCapitalLetter() {
        // Arrange
        ch = 'S';

        // Act
        String str = chk.checkTypeLetterOrSpecialCharacterOrNumber(ch);

        // Assert
        assertEquals("Capital letter",str);

    }

    @Test
    public void testCheckNumber() {
        // Arrange
        ch = '6';

        // Act
        String str = chk.checkTypeLetterOrSpecialCharacterOrNumber(ch);

        // Assert
        assertEquals("Number",str);

    }

    @Test
    public void testCheckSpecialChar() {
        // Arrange
        ch = '*';

        // Act
        String str = chk.checkTypeLetterOrSpecialCharacterOrNumber(ch);

        // Assert
        assertEquals("Special Character",str);

    }




}