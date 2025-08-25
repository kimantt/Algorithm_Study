package algorithm.h_dynamicProgramming;

public class DP {

	public static void main(String[] args) {
		// 피보나치 수열
		int n = 7;
		int res = fibonacci(n);
		System.out.println(res);
	}

	private static int fiboRecursive(int n) {
		if (n == 0) return 0;
		if (n == 1 || n == 2) return 1;
		
		return fiboRecursive(n-1) + fiboRecursive(n-2);
	}
	
	private static int fibonacci(int n) {
		if (n < 1) return -1;
		
		int prev = 1, cur = 1;
		for (int i = 3; i <= n; i++) {
			int temp = cur;
			cur = prev + cur;
			prev = temp;
		}
		
		return cur;
	}

}
