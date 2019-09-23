package com.stackroute.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    private MemberVariable memberVariable;
    @Before
    public void setUp() throws Exception {
        memberVariable= new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        memberVariable=null;
    }
    
    @Test
    public void someTest(){
        assertEquals("testGetReverseAndPalindromw(),Spliting Queries into tokens does not return correct values ",
                new String("Members Name: Suman Members Age: 22 Members Salary: 50000.99"),
                memberVariable.MemberData("Suman", 22, 50000.99));

        assertEquals(
                "null return for invalid input",
                null,
                memberVariable.MemberData("Arko", 0, 32344.3));
        assertEquals(
                "null return for invalid input",
                null,
                memberVariable.MemberData("12sdffef", 24, 312375.2));
        assertEquals(
                "null return for invalid input",
                null,
                memberVariable.MemberData("", 32, 1233.7));
        assertEquals(
                "null return for invalid input",
                null,
                memberVariable.MemberData("hari", 0, 0.0));
        assertEquals(
                "null return for invalid input",
                null,
                memberVariable.MemberData("asd", 0, null));
    }
}