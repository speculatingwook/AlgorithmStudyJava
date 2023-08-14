package algorithms.sort;

/**
 * 병합 정렬 알고리즘
 * | 평균 수행 시간: O(NlogN)
 * | 최악 수행 시간: O(NlogN)
 * | 메모리(공간 복잡도): O(N)
 * | 안정성: O
 */
public class MergeSort {
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr; // 배열의 크기가 1 이하면 이미 정렬된 것으로 간주
        }

        int mid = arr.length / 2;

        // 배열을 두 부분으로 나눔
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        // 재귀적으로 두 부분을 정렬
        left = mergeSort(left);
        right = mergeSort(right);

        // 정렬된 두 부분을 병합
        return merge(left, right);
    }


    private static int[] merge(int[] arr1, int[] arr2) {
        int arr1Index = 0;
        int arr2Index = 0;
        int[] sortedArr = new int[arr1.length + arr2.length];
        int i = 0;

        // 두 배열의 요소를 비교하며 작은 값을 결과 배열에 추가
        while (arr1Index < arr1.length && arr2Index < arr2.length) {
            if (arr1[arr1Index] < arr2[arr2Index]) {
                sortedArr[i] = arr1[arr1Index];
                arr1Index++;
            } else {
                sortedArr[i] = arr2[arr2Index];
                arr2Index++;
            }
            i++;
        }

        // arr1의 나머지 요소를 결과 배열에 추가
        while (arr1Index < arr1.length) {
            sortedArr[i] = arr1[arr1Index];
            arr1Index++;
            i++;
        }

        // arr2의 나머지 요소를 결과 배열에 추가
        while (arr2Index < arr2.length) {
            sortedArr[i] = arr2[arr2Index];
            arr2Index++;
            i++;
        }

        return sortedArr;
    }


}
