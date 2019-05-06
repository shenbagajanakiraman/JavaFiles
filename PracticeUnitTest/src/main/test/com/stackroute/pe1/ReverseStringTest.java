package com.stackroute.pe1;

import com.stackroute.pe1.ReverseString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest extends ReverseString {

    ReverseString chk;

    @Before
    public void setUp() throws Exception {
        chk = new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        chk = null;
    }

    @Test
    public void testReverseString() {

        String strCheck = chk.reverseString("Shenbaga ");
        assertEquals(" agabnehS",strCheck);
    }
}