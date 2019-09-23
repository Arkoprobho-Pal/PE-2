package com.stackroute.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    private EvenNumTest evenNumTest;
    @Before
    public void setUp() throws Exception {
        evenNumTest=new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        evenNumTest=null;
    }

    @Test
    public void someTest() {
        assertEquals("test ",
                new String("true"),
                evenNumTest.isEven(22));

        assertEquals("test ",
                new String("false"),
                evenNumTest.isEven(21));

    }
}