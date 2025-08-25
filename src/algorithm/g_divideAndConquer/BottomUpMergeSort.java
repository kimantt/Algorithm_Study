package algorithm.g_divideAndConquer;

import java.util.Arrays;

import algorithm.util.SortUtil;

// bottom-up (상향식)
// 가장 간단하고 작은 부분 문제들을 해결한 다음, 그 해답을 결합해 더 큰 문제의 해답을 만들어가는 방식
// 시작점 : 가장 작은 문제 (길이가 1인 두 배열을 병합
// 진행 방향 : 부분 -> 전체
public class BottomUpMergeSort {

	public static void main(String[] args) {
		int[] a = {10,9,8,7,6,5,4,3,2,1};
		SortUtil.checkTime(() -> {
			mergeSort(a);
			System.out.println(Arrays.toString(a));
		});

	}

	private static void mergeSort(int[] arr) {
		int n = arr.length;
		
		// size : 부분 배열의 길이
		for (int size = 1; size < n; size *= 2) {
			// left : 첫번째 부분 배열의 시작 인덱스
			for (int left = 0; left < n-1; left += 2 * size) {
				int mid = Math.min(left + size - 1, n - 1);
				// right : 두번째 부분 배열의 끝 인덱스
				int right = Math.min(left + 2*size - 1, n - 1);
				merge(arr, left, mid, right);
			}
		}
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int leftSize = mid - left + 1;
		int rightSize = right - mid;
		
		if (rightSize == 0) return;
		
		int[] leftArr = new int[leftSize];
		int[] rightArr = new int[rightSize];
		
		for (int i = 0; i < leftSize; i++) {
			leftArr[i] = arr[left + i];
		}
		
		for (int i = 0; i < rightSize; i++) {
			rightArr[i] = arr[mid + 1 + i];
		}
		
		int i = 0, j = 0, k = left;
		while (i <leftSize && j < rightSize) {
			if (leftArr[i] < rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		while (i < leftSize) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		
		while (j < rightSize) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}
	
}
