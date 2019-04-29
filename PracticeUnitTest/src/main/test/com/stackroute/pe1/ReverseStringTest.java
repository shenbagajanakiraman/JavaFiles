package com.stackroute.pe1;

import com.stackroute.pe1.ReverseString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest extends ReverseString {

    ReverseString chk;

    @Before
    public void setUp() throws Exception {
        chk = new ReverseString();
    }


    @Test
    public void reverseString() {

        String strCheck = chk.reverseStr("Shenbaga ");
        assertEquals(" agabnehS",strCheck);
    }
}