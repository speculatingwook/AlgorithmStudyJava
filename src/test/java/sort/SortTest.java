package algorithms.sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortTest {

    @DisplayName("[선택 정렬] 정렬된 배열이 올바르게 반환되어야 한다.")
    @Test
    void testSelectionSort() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        SelectionSort.selectionSort(arr);
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        assertThat(arr).isEqualTo(expected);

        int[] arr2 = {5, 1, 4, 2, 8};
        SelectionSort.selectionSort(arr2);
        int[] expected2 = {1, 2, 4, 5, 8};
        assertThat(arr2).isEqualTo(expected2);
    }

    @DisplayName("[버블 정렬] 정렬된 배열이 올바르게 반환되어야 한다.")
    @Test
    void testBubbleSort() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.bubbleSort(arr);
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        assertThat(arr).isEqualTo(expected);

        int[] arr2 = {5, 1, 4, 2, 8};
        BubbleSort.bubbleSort(arr2);
        int[] expected2 = {1, 2, 4, 5, 8};
        assertThat(arr2).isEqualTo(expected2);
    }

}
