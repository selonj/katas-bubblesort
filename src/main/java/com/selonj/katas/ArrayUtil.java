package com.selonj.katas;

/**
 * Created by L.x on 16-2-21.
 */
public class ArrayUtil {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            sort1(array, array.length - i + 1);
        }
    }

    private static void sort1(int[] array, int end) {
        for (int j = 1; j < end; j++) {
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
