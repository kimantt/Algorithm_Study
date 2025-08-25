package algorithm.g_divideAndConquer;

import algorithm.util.SortUtil;

public class Quiz {

	public static void main(String[] args) {
		//cpuCacheHit();
		SortUtil.checkTime(() -> System.out.println(q1(3, 10)));
	}

	private static void cpuCacheHit() {
		// CPU 참조 지역성에 따른 속도 차이
		int size = 10240;
		int[][] dArr = new int[size][size];
		SortUtil.checkTime(() -> {
			for (int i = 0; i < dArr.length; i++) {
				for (int j = 0; j < dArr.length; j++) {
					dArr[j][i] = i;
				}
			}
		});
		SortUtil.checkTime(() -> {
			for (int i = 0; i < dArr.length; i++) {
				for (int j = 0; j < dArr.length; j++) {
					dArr[i][j] = i;
				}
			}
		});
	}
	
	private static long q1(long i, long j) {
		// 분할정복 문제 : 거듭제곱
		if (j == 0) return 1;
		if (j == 1) return i;
		
		long half = q1(i, j / 2);
		long result = half * half;
		
		
		if (j % 2 == 0) return result;
		return result * i;
	}

}
