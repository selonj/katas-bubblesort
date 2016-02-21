package com.selonj.katas;

/**
 * Created by L.x on 16-2-21.
 */
public class ArrayUtil {
    public static void sort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int i = j - 1;
            if (array[i] > array[j]) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
    }
}
