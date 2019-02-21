package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose transpose;

    @Before
    public void setUp() throws Exception {
        transpose = new Transpose();
    }

    @After
    public void tearDown() throws Exception {
        transpose = null;
    }

    @Test
    public void testTransposeWords() {
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god", transpose.transposeWords("a quick brown fox jumps over the lazy dog"));
        assertNotNull(transpose.transposeWords("a quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void testTransposeWordsFailure() {
        assertNotEquals("a kciuq nworb fox spmuj revo eht yzal god", transpose.transposeWords("a quick brown fox jumps over the lazy dog"));
        assertNotNull(transpose.transposeWords("a quick brown fox jumps over the lazy dog"));
    }
}