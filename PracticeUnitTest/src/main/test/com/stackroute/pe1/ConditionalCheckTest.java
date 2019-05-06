package com.stackroute.pe1;

import com.stackroute.pe1.ConditionalCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionalCheckTest {


    // Arrange

    ConditionalCheck chk;
    String strCheck;


    @Before
    public void setUp() throws Exception {
        chk = new ConditionalCheck();

    }

    @After
    public void tearDown() throws Exception {
        chk = null;
    }

    @Test
    public void testCheckTom() throws Exception {
        // Act
        strCheck = chk.checkFunctionTomOrJerry(21);
        // Assert
        assertEquals("Tom",strCheck);

        System.out.println("Printing Tom : Check");
    }

    @Test
    public void testCheckJerry() throws Exception {
        // Act
        strCheck = chk.checkFunctionTomOrJerry(26);
        //Assert
        assertEquals("Jerry",strCheck);

        System.out.println("Printing Jerry : Check");
    }

    @Test
    public void testCheckOther() throws Exception {
        // Act
        strCheck = chk.checkFunctionTomOrJerry(66);
        // Assert
        assertEquals("Neither Tom nor Jerry",strCheck);

        System.out.println("Out of Bound values : Check");
    }

    @Test
    public void testCheckException()  {
        // Act
        strCheck = chk.CheckinputForExceptions("*");
        // Assert
        assertEquals("Exception thrown",strCheck);

        System.out.println("Exceptions : Check");
    }
}