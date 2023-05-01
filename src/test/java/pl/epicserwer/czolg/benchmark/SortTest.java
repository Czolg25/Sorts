package pl.epicserwer.czolg.benchmark;

import org.openjdk.jmh.annotations.*;
import pl.epicserwer.czolg.sort.data.QuickSortPivotType;
import pl.epicserwer.czolg.sort.utils.GenerateArray;
import pl.epicserwer.czolg.sort.utils.sort.BubbleSort;
import pl.epicserwer.czolg.sort.utils.sort.QuickSort;

import java.util.concurrent.TimeUnit;

public class SortTest {
    private static final int ARRAY_LENGTH = 10_000;

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = 5)
    @Fork(1)
    @Measurement(iterations = 5)
    public void sortBubbleSortRandomCase() {
        int[] arr = GenerateArray.generateRandomArray(ARRAY_LENGTH);
        BubbleSort.sort(arr);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = 5)
    @Fork(1)
    @Measurement(iterations = 5)
    public void sortQuickSortRandomPivotRandomCase() {
        int[] arr = GenerateArray.generateRandomArray(ARRAY_LENGTH);
        QuickSort.sort(arr, QuickSortPivotType.RANDOM);
    }
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = 5)
    @Fork(1)
    @Measurement(iterations = 5)
    public void sortQuickSortFirstPivotRandomCase() {
        int[] arr = GenerateArray.generateRandomArray(ARRAY_LENGTH);
        QuickSort.sort(arr, QuickSortPivotType.RANDOM);
    }
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = 5)
    @Fork(1)
    @Measurement(iterations = 5)
    public void sortQuickSortLastPivotRandomCase() {
        int[] arr = GenerateArray.generateRandomArray(ARRAY_LENGTH);
        QuickSort.sort(arr, QuickSortPivotType.RANDOM);
    }
}
