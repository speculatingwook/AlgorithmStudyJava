package algorithms.sort;

/**
 * 선택 정렬 알고리즘
 * | 평균 수행 시간: O(N^2)
 * | 최악 수행 시간: O(N^2)
 * | 메모리(공간 복잡도): O(1)
 * | 안정성: X
 */
public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;

        // 배열의 모든 요소를 반복하면서 선택 정렬 수행
        for (int i = 0; i < n - 1; i++) {
            // 최솟값의 인덱스를 저장하는 변수
            int minIndex = i;

            // 현재 인덱스보다 뒤쪽에 있는 요소들과 비교하여 최솟값의 인덱스를 찾음
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 최솟값을 현재 인덱스의 위치로 이동
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
