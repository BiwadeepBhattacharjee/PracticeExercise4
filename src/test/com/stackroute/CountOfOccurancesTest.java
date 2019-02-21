package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOfOccurancesTest {
    CountOfOccurances countOfOccurances;

    @Before
    public void setUp() throws Exception {
        countOfOccurances = new CountOfOccurances();
    }

    @After
    public void tearDown() throws Exception {
        countOfOccurances = null;
    }

    @Test
    public void countNumberOfOccurances() {
        int expected = 3;
        int actual = countOfOccurances.countNumberOfOccurances("She sells sea shells on the sea shore");
        assertEquals(expected, actual);
        assertNotNull(countOfOccurances);
    }

    @Test
    public void countNumberOfOccurancesFailure() {
        int expected = 2;
        int actual = countOfOccurances.countNumberOfOccurances("She sells sea shells on the sea shore");
        assertNotEquals(expected, actual);
        assertNotNull(countOfOccurances);
    }
}