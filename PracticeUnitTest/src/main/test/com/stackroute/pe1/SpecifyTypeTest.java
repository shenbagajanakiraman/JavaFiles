package com.stackroute.pe1;

import com.stackroute.pe1.SpecifyType;
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

    @Test
    public void CheckSmallLetter() {
        // Arrange
        ch = 's';

        // Act
        String str = chk.checkType(ch);

        // Assert
        assertEquals("Small letter",str);

    }

    @Test
    public void CheckCapitalLetter() {
        // Arrange
        ch = 'S';

        // Act
        String str = chk.checkType(ch);

        // Assert
        assertEquals("Capital letter",str);

    }

    @Test
    public void CheckNumber() {
        // Arrange
        ch = '6';

        // Act
        String str = chk.checkType(ch);

        // Assert
        assertEquals("Number",str);

    }

    @Test
    public void CheckSpecialChar() {
        // Arrange
        ch = '*';

        // Act
        String str = chk.checkType(ch);

        // Assert
        assertEquals("Special Character",str);

    }




}