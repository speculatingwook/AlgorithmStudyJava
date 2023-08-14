package algorithms.sort;
/**
 * 버블 정렬 알고리즘
 * | 평균 수행 시간: O(N^2)
 * | 최악 수행 시간: O(N^2)
 * | 메모리(공간 복잡도): O(1)
 * | 안정성: O
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
