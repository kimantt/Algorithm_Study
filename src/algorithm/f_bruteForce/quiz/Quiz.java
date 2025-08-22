package algorithm.f_bruteForce.quiz;

public class Quiz {

	public static void main(String[] args) {
		// N번째 종말의 수 구하기
		System.out.println(getNumber(10));
	}

	private static int getNumber(int target) {
		if (target < 1) return -1;
		
		int cnt = 0;
		Integer i = 666;
		
		while (true) {
			if (i.toString().contains("666")) cnt++;
			if (cnt == target) return i;
			i++;
		}
	}

}
