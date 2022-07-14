package com.nickdeakin.interview;

import org.json.JSONArray;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class InterviewTest {

    private InterviewImpl underTest;
    private JSONArray input;

    @Before
    public void setUp() throws Exception {
        underTest = new InterviewImpl();

        input = new JSONArray();
        input.put(10);
        input.put(4);
        input.put(63);
        input.put(2);
        input.put(5);
        input.put(8);
        input.put(-1);
    }

    @Test
    public void when_sortArray_isCalled_with_unsortedValues_and_ascendingIsTrue_then_returnsAscendingOrder() throws Exception {
        JSONArray sorted = underTest.sortArray(input, true);

        assertEquals(-1, sorted.getInt(0));
        assertEquals(2, sorted.getInt(1));
        assertEquals(4, sorted.getInt(2));
        assertEquals(5, sorted.getInt(3));
        assertEquals(8, sorted.getInt(4));
        assertEquals(10, sorted.getInt(5));
        assertEquals(63, sorted.getInt(6));
    }

    @Test
    public void when_sortArray_isCalled_with_unsortedValues_and_ascendingIsFalse_then_returnsDescendingOrder() throws Exception {
        JSONArray sorted = underTest.sortArray( input, false);

        assertEquals(63, sorted.getInt(0));
        assertEquals(10, sorted.getInt(1));
        assertEquals(8, sorted.getInt(2));
        assertEquals(5, sorted.getInt(3));
        assertEquals(4, sorted.getInt(4));
        assertEquals(2, sorted.getInt(5));
        assertEquals(-1, sorted.getInt(6));
    }

    @Test
    public void when_filterArray_isCalled_with_min5_and_max50_then_returnsValuesFrom5To50() throws Exception {
        int min = 5;
        int max = 50;

        JSONArray filtered = underTest.filterArray( input, min, max);

        // Add tests to ensure filterArray is working

        Assert.fail();
    }

    @Test
    public void when_textTester_isCalled_theValueShouldNotBeHardcoded() throws Exception {
        String expected = "mock text";

        // Ensure that textTester() returns any value for our test

        // expected text here is "mock text"
        assertEquals(expected, underTest.textTester());
    }
}
