import static org.junit.Assert.*;

import org.junit.Test;


public class NumbersInAStringSummerTest {

    @Test
    public void testSumOfIntegers(){
        assertEquals(999, NumbersInAStringSummer.sumOfNumbers("999problemsButJavaAint0"));
        assertEquals(0, NumbersInAStringSummer.sumOfNumbers("000 three five -1 1"));
        assertEquals(2, NumbersInAStringSummer.sumOfNumbers("samir1WhatAreYou2Doing3You-4"));
    }
}