package algorithm.f_bruteForce;

import java.util.Arrays;
import java.util.Random;

import algorithm.util.SortUtil;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = SortUtil.createRandomIntArray(10);
		
		SortUtil.checkTime(() -> bubbleSort2(arr));
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		for (int i = 1; i <= arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j+1]) {
					SortUtil.swap(arr, j, j+1);
				}
			}
		}
	}
	
	private static void bubbleSort2(int[] arr) {
		for (int i = 1; i <= arr.length; i++) {
			boolean notSwap = true;
			
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j+1]) {
					SortUtil.swap(arr, j, j+1);
					notSwap = false;
				}
			}
			
			if (notSwap) break;
		}
	}
	
}
