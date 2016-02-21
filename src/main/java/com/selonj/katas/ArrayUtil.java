package com.selonj.katas;

/**
 * Created by L.x on 16-2-21.
 */
public class ArrayUtil {
    public static void sort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            if (array[j - 1] > array[j]) {
                swap(array, j - 1, j);
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
