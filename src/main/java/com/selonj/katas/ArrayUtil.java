package com.selonj.katas;

/**
 * Created by L.x on 16-2-19.
 */
public class ArrayUtil {
    public static void sort(int[] array) {
        if (array.length > 1) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
