package algorithm.h_dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class GreedyQuiz {

	public static void main(String[] args) {
		// Greedy Quiz
		coin(3465);
	}

	private static void coin(int pay) {
		int c500 = pay / 500;
		pay = pay % 500;
		int c100 = pay / 100;
		pay = pay % 100;
		int c50 = pay / 50;
		pay = pay % 50;
		int c10 = pay / 10;
		pay = pay % 10;
		int c1 = pay;
		
		System.out.printf("{500:%d, 100:%d, 50:%d, 10:%d, 1:%d}\n", c500, c100, c50, c10, c1);
	}
	
	

}
