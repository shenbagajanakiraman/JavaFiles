
/*
 Program to Add Integer values and Printing the Sum
Also Check if the input is valid
*/

package com.stackroute.pe1;

import com.stackroute.pe1.AddingIntegers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddingIntegersTest extends AddingIntegers {

    AddingIntegers chk;
    int strChk;
    boolean chkFlag;
    String strCheck;


    @Before
    public void setUp() throws Exception {
        chk = new AddingIntegers();
    }

    @After
    public void tearDown() throws Exception {
        chk = null;
    }

    @Test
    public void testPrintSumOfIntegers() {

        // Arrange
        int arrayInt[] = {30,40,30,0};

        // Act
        strChk = chk.findSumOfIntegers(arrayInt);

        // Assert
        assertEquals(100,strChk);

        System.out.println("Return Sum : Check");

    }

    //  Finding Float values

    @Test
    public void testCheckIfInputIsNotInteger() {
        // Arrange
        float arrayDouble1[] = {3.6f,40,30,0};

        // Act
        chkFlag = chk.findIfInputIsFloat(arrayDouble1);

        // Assert

        assertFalse(chkFlag);

        System.out.println("Float value found : Check");

    }

    //  Checking if All input values are integers

    @Test
    public void testCheckIfAllInputsAreIntegers() {
        // Arrange
        float arrayDouble1[] = {30,40,30,20,0};

        // Act
        chkFlag = chk.findIfInputIsFloat(arrayDouble1);

        // Assert

        assertTrue(chkFlag);

        System.out.println("Input Integers: Check");

    }


    @Test
    public void testCheckIfExceptionIsThrown()  {
        // Act
        strCheck = chk.checkInputForExceptions("*");
        // Assert
        assertEquals("Exception thrown",strCheck);

        System.out.println("Exceptions : Check");
    }
}