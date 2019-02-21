package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {
    Replace rep;

    @Before
    public void setUp() throws Exception {
        rep = new Replace();
    }

    @After
    public void tearDown() throws Exception {
        rep = null;
    }

    @Test
    public void testReplaceCharacter() {
        String expected = "faity fry";
        String actual = rep.replaceCharacter("daily dry");
        assertEquals(expected, actual);
        assertNotNull(rep);
    }

    @Test
    public void testReplaceCharacterFailure() {
        String expected = "ddll";
        String actual = rep.replaceCharacter("ddll");
        assertNotEquals(expected, actual);
        assertNotNull(rep);
    }
}