package sort;

import algorithms.sort.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class SortTest {
    private static final int[] arr = {64, 34, 25, 12, 22, 11,12, 90};
    private static final int[] arr2 = {5, 1, 4, 2, 8};
    private static final int[] expected = {11, 12, 12, 22, 25, 34, 64, 90};
    private static final int[] expected2 = {1, 2, 4, 5, 8};


    @DisplayName("[선택 정렬] 정렬된 배열이 올바르게 반환되어야 한다.")
    @Test
    void testSelectionSort() {
        int [] test1 =  arr.clone();
        int [] test2 = arr2.clone();
        assertThat(SelectionSort.selectionSort(test1)).isEqualTo(expected);
        assertThat(SelectionSort.selectionSort(test2)).isEqualTo(expected2);
    }

    @DisplayName("[버블 정렬] 정렬된 배열이 올바르게 반환되어야 한다.")
    @Test
    void testBubbleSort() {
        int [] test1 =  arr.clone();
        int [] test2 = arr2.clone();
        assertThat(BubbleSort.bubbleSort(test1)).isEqualTo(expected);
        assertThat(BubbleSort.bubbleSort(test2)).isEqualTo(expected2);
    }

    @DisplayName("[삽입 정렬] 정렬된 배열이 올바르게 반환되어야 한다.")
    @Test
    void testInsertionSort() {
        int [] test1 =  arr.clone();
        int [] test2 = arr2.clone();
        assertThat(InsertionSort.insertionSort(test1)).isEqualTo(expected);
        assertThat(InsertionSort.insertionSort(test2)).isEqualTo(expected2);
    }

    @DisplayName("[퀵 정렬] 정렬된 배열이 올바르게 반환되어야 한다.")
    @Test
    void testQuickSort() {
        int [] test1 =  arr.clone();
        int [] test2 = arr2.clone();
        assertThat(QuickSort.quickSort(test1)).isEqualTo(expected);
        assertThat(QuickSort.quickSort(test2)).isEqualTo(expected2);
    }
    @DisplayName("[병합 정렬] 정렬된 배열이 올바르게 반환되어야 한다.")
    @Test
    void testMergeSort() {
        int [] test1 =  arr.clone();
        int [] test2 = arr2.clone();
        assertThat(MergeSort.mergeSort(test1)).isEqualTo(expected);
        assertThat(MergeSort.mergeSort(test2)).isEqualTo(expected2);
    }

}
