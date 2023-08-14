package algorithms.sort;


import static utils.Array.swap;

/**
 * 퀵 정렬 알고리즘
 * | 평균 수행 시간: O(NlogN)
 * | 최악 수행 시간: O(N^2)
 * | 메모리(공간 복잡도): O(logN)
 * | 안정성: X
 */
public class QuickSort {
    public static int[] quickSort(int[] nums) {
        quickSortRecursive(nums, 0, nums.length - 1);
        return nums;
    }
    public static void quickSortRecursive(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivotPosition = partition(arr, left, right);

        quickSortRecursive(arr, left, pivotPosition-1);
        quickSortRecursive(arr, pivotPosition+1, right);
    }

    // 로무토(Lomuto) 분할법
    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = (left - 1);
        for (int j = left; j < right; ++j) {
            if (arr[j] < pivot) {
                ++i;
                swap(arr, i, j);
            }
        }

        int pivotPos = i + 1;
        swap(arr, pivotPos, right);
        return pivotPos;
    }

}
