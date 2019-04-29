package com.stackroute.pe1;

import com.stackroute.pe1.ConditionalCheck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionalCheckTest {


    // Arrange

    ConditionalCheck chk = new ConditionalCheck();
    String strCheck;


    @Before
    public void setUp() throws Exception {

    }



    @Test
    public void checkTom() throws Exception {
        // Act
        strCheck = chk.checkFunction(21);
        // Assert
        assertEquals("Tom",strCheck);

        System.out.println("Printing Tom : Check");
    }

    @Test
    public void checkJerry() throws Exception {
        // Act
        strCheck = chk.checkFunction(26);
        //Assert
        assertEquals("Jerry",strCheck);

        System.out.println("Printing Jerry : Check");
    }

    @Test
    public void checkOther() throws Exception {
        // Act
        strCheck = chk.checkFunction(66);
        // Assert
        assertEquals("Neither Tom nor Jerry",strCheck);

        System.out.println("Out of Bound values : Check");
    }

    @Test
    public void checkException()  {
        // Act
        strCheck = chk.Checkinput("*");
        // Assert
        assertEquals("Exception thrown",strCheck);

        System.out.println("Exceptions : Check");
    }
}