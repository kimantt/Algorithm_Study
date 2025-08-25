package algorithm.g_divideAndConquer;

import java.util.Arrays;
import java.util.Stack;

import algorithm.util.SortUtil;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = {10,9,8,7,6,5,4,3,2,1};
		SortUtil.checkTime(() -> {
			quickSort(a, 0, a.length - 1);
			System.out.println(Arrays.toString(a));
		});

	}
	
	private static void quickSort(int[] arr, int left, int right) {
		if (left >= right) return;
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(left);
		stack.add(right);
		
		while (!stack.isEmpty()) {
			right = stack.pop();
			left = stack.pop();
			
			int pivotIndex = partition(arr, left, right);
			if (pivotIndex - 1 > left) {
				stack.add(left);
				stack.add(pivotIndex - 1);
			}
			if (pivotIndex + 1 < right) {
				stack.add(pivotIndex + 1);
				stack.add(right);
			}
		}
	}
	
	private static int partition(int[] arr, int first, int last) {
		int pivotElement = arr[first];
		int leftPointer = first;
		int rightPointer = last;
		
		while (true) {
			while (leftPointer < last && arr[leftPointer] <= pivotElement) {
				leftPointer++;
			}
			
			while (rightPointer > first && arr[rightPointer] > pivotElement) {
				rightPointer--;
			}
			
			if (leftPointer >= rightPointer) break;
			SortUtil.swap(arr, leftPointer, rightPointer);
			leftPointer++;
			rightPointer--;
		}
		
		SortUtil.swap(arr, first, rightPointer);
		return rightPointer;
	}

}
