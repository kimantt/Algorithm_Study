package algorithm.e_search;

public class LinearSearch {

	public static void main(String[] args) {
		
		int target = 999;
		int[] nums = {1, 6, 12, 17, 999, 22, 14, 6, 19};
		
		//int index = linearSearch(nums, target);
		int index = sentinelSearch(nums, target);
		System.out.println(index);
	}

	// 선형탐색
	private static int linearSearch(int[] nums, int target) {
		int i = 0;
		while (true) {
			if (i == nums.length) return -1;
			if (nums[i] == target) return i;
			i++;
		}
	}
	
	// 보초법
	private static int sentinelSearch(int[] nums, int target) {
		int lastIndex = nums.length - 1;
		if (nums[lastIndex] == target) return lastIndex;
		
		nums[lastIndex] = target;
		
		int i = 0;
		while (true) {
			if (target == nums[i]) {
				return i < lastIndex ? i : -1;
			}
			i++;
		}
	}

}
