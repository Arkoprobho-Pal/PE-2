package com.stackroute.main;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem1Test {
    private static Problem1 palindrome;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        palindrome = new Problem1();

    }
    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        palindrome = null;

    }
    @Test
    public void testGetReverseAndPalindrome()
    {

        assertEquals("testGetReverseAndPalindromw(),Spliting Queries into tokens does not return correct values ",
                new String("reverse input: acbca>>It's Palindrome!"),
                palindrome.Result("acbca"));
        assertEquals("testGetReverseAndPalindromw(),Spliting Queries into tokens does not return correct values ",
                new String("reverse input: acbba>>It's not Palindrome!"),
                palindrome.Result("abbca"));

        assertEquals(
                "null return for blank string input",
                null,
                palindrome.Result(null));
        assertEquals(
                "null return for blank string input",
                null,
                palindrome.Result(""));
    }



}