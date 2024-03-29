package com.selonj.katas;

import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 16-2-19.
 */
public class ArraySortTest {
    @Test
    public void anItem() throws Exception {
        assertSortedArray(new int[]{1}, equalTo(new int[]{1}));
    }

    @Test
    public void pairItems() throws Exception {
        assertSortedArray(new int[]{2, 1}, equalTo(new int[]{1, 2}));
        assertSortedArray(new int[]{1, 2}, equalTo(new int[]{1, 2}));
    }

    @Test
    public void items() throws Exception {
        assertSortedArray(new int[]{1, 2, 3}, equalTo(new int[]{1, 2, 3}));
        assertSortedArray(new int[]{1, 3, 2}, equalTo(new int[]{1, 2, 3}));
        assertSortedArray(new int[]{2, 1, 3}, equalTo(new int[]{1, 2, 3}));
        assertSortedArray(new int[]{3, 1, 2}, equalTo(new int[]{1, 2, 3}));
        assertSortedArray(new int[]{2, 3, 1}, equalTo(new int[]{1, 2, 3}));
        assertSortedArray(new int[]{3, 2, 1}, equalTo(new int[]{1, 2, 3}));
    }

    private void assertSortedArray(int[] array, Matcher<int[]> matcher) {
        ArrayUtil.sort(array);
        assertThat(array, matcher);
    }
}
