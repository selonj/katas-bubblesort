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
    }

    private void assertSortedArray(int[] array, Matcher<int[]> matcher) {
        ArrayUtil.sort(array);
        assertThat(array, matcher);
    }
}
