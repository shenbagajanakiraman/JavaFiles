package com.stackroute.pe1;

import com.stackroute.pe1.PalindromeAndSum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.*;

public class PalindromeAndSumTest extends PalindromeAndSum {

    PalindromeAndSum chk;

    @Before
    public void setUp() throws Exception {
        revnumber = 0;
        sum = 0;
        chk  = new PalindromeAndSum();
    }

    @After
    public void tearDown() throws Exception {
        chk = null;
    }

    @Test
        public void testCheckPalindrome()  {
        // Arrange
        number = 12321;

        // Act
        int palinNumber = chk.palindromeCheckInput(number);

        //Assert
        assertEquals(number+"is a Palindrome",palinNumber+"is a Palindrome");
        System.out.println("Palindrome Check");


        }

    @Test
    public void testCheckNotPalindrome() {

        //Arrange
        number = 12345;

        // Act
        int palinNumber = chk.palindromeCheckInput(number);

        // Assert
        assertEquals("54321 is not a Palindrome",palinNumber+" is not a Palindrome");
        System.out.println("Not Palindrome Check");
    }

    @Test
    public void testFindLesserSum() {

        //Arrange
        number = 1234321;

        //Act
        int palinSum = chk.sumOfPalindromeIntegers(number);

        //Assert
        assertEquals(8+" is lesser than 25",palinSum+" is lesser than 25");

        System.out.println("Lesser than 25 Sum check");

    }

    @Test
    public void testFindGreaterSum() {

        //Arrange
        number = 2468642;

        //Act
        int palinSum = chk.sumOfPalindromeIntegers(number);

        //Assert
        assertEquals(32+" is greater than 25",palinSum+" is greater than 25");

        System.out.println("Greater than 25 Sum check");

    }
}

