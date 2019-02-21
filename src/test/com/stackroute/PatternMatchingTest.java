package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternMatchingTest {
    PatternMatching patternMatching;

    @Before
    public void setUp() throws Exception {
        patternMatching = new PatternMatching();
    }

    @After
    public void tearDown() throws Exception {
        patternMatching = null;
    }

    @Test
    public void patternMatchingMethod() {
        boolean expected = true;
        boolean actual = patternMatching.patternMatchingMethod("Harry is here");
        assertEquals(expected, actual);
        assertNotNull(patternMatching);
    }

    @Test
    public void patternMatchingMethodFailure() {
        boolean expected = true;
        boolean actual = patternMatching.patternMatchingMethod("Henry is here");
        assertNotEquals(expected, actual);
        assertNotNull(patternMatching);
    }
}