package com.stackroute.pe1;

import com.stackroute.pe1.Sample1;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;


public class Sample1Test {
    private Sample1 resh = new Sample1("Shenbaga");

    @Test
    public void getStr() {
        assertEquals("Shenbaga", resh.getStr());
    }
    @Test
    public void testUnHappy() {
         assertFalse(resh.isHappy());
    }
    @Test
    public void testHappy(){
        resh.isSheHappy();
        assertTrue(resh.isHappy());
    }
    @Test (expected = IllegalStateException.class)
    public void nameFail() throws Exception {
        resh.printHappyMsg();
    }

    @Ignore ("Exception throw is not defined")
    @Test
    public void name() throws Exception {
    resh.isSheHappy();
    resh.printHappyMsg();
    }
     @Test
    public void name1()  {
        resh.isSheHappy();
        String msg = resh.getHappyMsg();
        assertEquals("I am Happy",msg);
    }
}