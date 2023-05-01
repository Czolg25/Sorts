package pl.epicserwer.czolg.sort.utils.sort;

import pl.epicserwer.czolg.sort.data.QuickSortPivotType;

import java.util.Random;

public class QuickSort {
    private static final Random RANDOM = new Random();

    public static void sort(int[] arr, QuickSortPivotType quickSortPivotType) {
        quickSort(arr, 0, arr.length - 1, quickSortPivotType);
    }

    private static void quickSort(int[] arr, int first, int last,QuickSortPivotType quickSortPivotType) {
        int i,j,temp,pivot;

        i=first;
        j=last;
        pivot=arr[getPivotIndex( first, last, quickSortPivotType)];
        while (i <= j) {
            while (i<arr.length&& arr[i] < pivot) {
                i++;
            }
            while (j>0 &&arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (first < j) {
            quickSort(arr, first, j, quickSortPivotType);
        }
        if (i < last) {
            quickSort(arr, i, last, quickSortPivotType);
        }
    }

    private static int getPivotIndex( int low, int high, QuickSortPivotType quickSortPivotType) {
        switch (quickSortPivotType) {
            case RANDOM:
                return RANDOM.nextInt(high - low) + low;
            case FIRST:
                return low;
            case LAST:
                return high;
            case MIDDLE:
                return (low + high) / 2;
            default:
                return 0;
        }
    }
}
