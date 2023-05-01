package pl.epicserwer.czolg.benchmark;

import org.openjdk.jmh.annotations.*;
import pl.epicserwer.czolg.sort.data.QuickSortPivotType;
import pl.epicserwer.czolg.sort.utils.GenerateArray;
import pl.epicserwer.czolg.sort.utils.sort.BubbleSort;
import pl.epicserwer.czolg.sort.utils.sort.QuickSort;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class SortTest {
    private static final int ARRAY_LENGTH = 10_000;
    private static final int NUMBER_OF_WARM = 5;
    private static final int NUMBER_OF_FORK = 1;
    private static final int NUMBER_OF_ITERATION = 5;

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = NUMBER_OF_WARM)
    @Fork(NUMBER_OF_FORK)
    @Measurement(iterations = NUMBER_OF_ITERATION)
    public void sortBubbleSortRandomCase() {
        int[] arr = GenerateArray.generateRandomArray(ARRAY_LENGTH);
        BubbleSort.sort(arr);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = NUMBER_OF_WARM)
    @Fork(NUMBER_OF_FORK)
    @Measurement(iterations = NUMBER_OF_ITERATION)
    public void sortQuickSortRandomPivotRandomCase() {
        int[] arr = GenerateArray.generateRandomArray(ARRAY_LENGTH);
        QuickSort.sort(arr, QuickSortPivotType.RANDOM);
    }
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = NUMBER_OF_WARM)
    @Fork(NUMBER_OF_FORK)
    @Measurement(iterations = NUMBER_OF_ITERATION)
    public void sortQuickSortFirstPivotRandomCase() {
        int[] arr = GenerateArray.generateRandomArray(ARRAY_LENGTH);
        QuickSort.sort(arr, QuickSortPivotType.RANDOM);
    }
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = NUMBER_OF_WARM)
    @Fork(NUMBER_OF_FORK)
    @Measurement(iterations = NUMBER_OF_ITERATION)
    public void sortQuickSortLastPivotRandomCase() {
        int[] arr = GenerateArray.generateRandomArray(ARRAY_LENGTH);
        QuickSort.sort(arr, QuickSortPivotType.RANDOM);
    }
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = NUMBER_OF_WARM)
    @Fork(NUMBER_OF_FORK)
    @Measurement(iterations = NUMBER_OF_ITERATION)
    public void sortJavaSortRandomCase() {
        int[] arr = GenerateArray.generateRandomArray(ARRAY_LENGTH);
        Arrays.sort(arr);
    }
}
