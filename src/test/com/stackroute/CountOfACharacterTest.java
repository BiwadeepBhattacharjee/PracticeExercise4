package com.stackroute;

import static org.junit.Assert.*;

public class CountOfACharacterTest {
    CountOfACharacter count;

    @org.junit.Before
    public void setUp() throws Exception {
        count = new CountOfACharacter();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        count = null;
    }

    @org.junit.Test
    public void testOccurancesOfACharacter() {
        int expected = 2;
        int actual = count.occurancesOfACharacter('B', "BiswadeepBhattacharjee");
        assertEquals(expected, actual);
        assertNotNull(count);
    }

    @org.junit.Test
    public void testOccurancesOfACharacterFailure() {
        int expected = 4;
        int actual = count.occurancesOfACharacter('B', "BiswadeepBhattacharjee");
        assertNotEquals(expected, actual);
        assertNotNull(count);
    }
}