package com.stackroute.main;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    private static Problem2 powerCheck;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        powerCheck = new Problem2();

    }
    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        powerCheck = null;

    }
    @Test
    public void testGetNumberIsAPowerOfANumberCheck()
    {

        assertEquals("testGetNumberIsAPowerOfANumberCheck() into tokens does not return correct values ",
                new String("the number 1024 is a power of 4"),
                powerCheck.Result(1024,4));
        assertEquals("testGetReverseAndPalindromw(),Spliting Queries into tokens does not return correct values ",
                new String("the number 1000 is NOT a power of 4"),
                powerCheck.Result(1000,4));

        assertEquals(
                "null return for invalid input",
                null,
                powerCheck.Result(null,null));
        assertEquals(
                "null return for invalid input",
                null,
                powerCheck.Result(0,4));
        assertEquals(
                "null return for invalid input",
                null,
                powerCheck.Result(8,0));
        assertEquals(
                "null return for invalid input",
                null,
                powerCheck.Result(0,0));
        assertEquals(
                "null return for invalid input",
                null,
                powerCheck.Result(78,null));
    }



}
