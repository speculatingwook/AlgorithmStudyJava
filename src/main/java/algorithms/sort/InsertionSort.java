package algorithms.sort;
/**
 * 삽입 정렬 알고리즘
 * | 평균 수행 시간: O(N^2)
 * | 최악 수행 시간: O(N^2)
 * | 메모리: O(1)
 * | 안정성: O
 */
public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = i;
            while (count>0) {
                if (arr[count-1] > arr[count]) {
                    int temp = arr[count];
                    arr[count] = arr[count - 1];
                    arr[count-1] = temp;
                }
                count --;
            }
        }
        return arr;
    }

}
