package algorithm.b_star;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// 사용자의 입력을 한 변의 길이로 가지는 마름모 출력
		// 입력값 검증 생략
		Scanner sc = new Scanner(System.in);
		System.out.print("한 변의 길이 입력 : ");
		int input = sc.nextInt();
		
		// 가로로 제일 긴 대각선까지만 출력
		for (int i = 1; i < input + 1; i++) {
			for (int h = input - i; h > 0; h--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 그 아래로 나머지 줄 출력
		for (int i = input - 1; i > 0; i--) {
			for (int h = input - i; h > 0; h--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}
