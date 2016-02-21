package com.selonj.katas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 16-2-21.
 */
public class ArraySortTest {
    @Test
    public void anItem() throws Exception {
        assertSortedArrayEquals(new int[]{1}, new int[]{1});
    }

    @Test
    public void pairItems() throws Exception {
        assertSortedArrayEquals(new int[]{2, 1}, new int[]{1, 2});
    }

    private void assertSortedArrayEquals(int[] array, int[] expected) {
        ArrayUtil.sort(array);
        assertThat(array, equalTo(expected));
    }
}
