package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AlphabeticalOrderTest {
    AlphabeticalOrder alphabeticalOrder;

    @Before
    public void setUp() throws Exception {
        alphabeticalOrder = new AlphabeticalOrder();
    }

    @After
    public void tearDown() throws Exception {
        alphabeticalOrder = null;
    }

    @Test
    public void testSortInAlphabeticalOrder() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("roger");
        arrayList.add("federer");
        arrayList.add("has");
        arrayList.add("won");
        arrayList.add("twenty");
        arrayList.add("grand");
        arrayList.add("slams");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("federer");
        expected.add("grand");
        expected.add("has");
        expected.add("roger");
        expected.add("slams");
        expected.add("twenty");
        expected.add("won");
        assertEquals(expected, alphabeticalOrder.sortInAlphabeticalOrder(arrayList));
        assertNotNull(alphabeticalOrder);
    }

    @Test
    public void testSortInAlphabeticalOrderFailure() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("roger");
        arrayList.add("federer");
        arrayList.add("has");
        arrayList.add("won");
        arrayList.add("twenty");
        arrayList.add("grand");
        arrayList.add("slams");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("federer");
        expected.add("grand");
        expected.add("has");
        expected.add("twenty");
        expected.add("slams");
        expected.add("won");
        expected.add("won");
        assertNotEquals(expected, alphabeticalOrder.sortInAlphabeticalOrder(arrayList));
        assertNotNull(alphabeticalOrder);
    }
}