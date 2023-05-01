package pl.epicserwer.czolg.sort.utils;

import java.util.Random;

public class GenerateArray {
    private static final Random RANDOM = new Random();

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = RANDOM.nextInt(size);
        }

        return array;
    }

    public static int[] generateBestArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        return array;
    }


    public static int[] generateWorstArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = size-i;
        }

        return array;
    }
}
