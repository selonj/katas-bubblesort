package com.selonj.katas;

/**
 * Created by L.x on 16-2-21.
 */
public class ArrayUtil {
    public static void sort(int[] array) {
        if (array.length > 1) {
            if (array[0] > array[1]) {
                int tmp = array[0];
                array[0] = array[1];
                array[1] = tmp;
            }
        }
    }
}
