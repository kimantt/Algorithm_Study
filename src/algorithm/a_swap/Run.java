package algorithm.a_swap;

public class Run {

	public static void main(String[] args) {
		
		swap();
		//swapUsingBits();
		
	}
	
	public static void swap() {
		// a에 담긴 값을 b에, b에 담긴 값을 a에 넣는 예제
		// 단, 대입연산자만 사용
		// 값을 직접 변수에 할당할 수는 없음
		
		int a = 10;
		int b = 15;
		System.out.println("a : " + a + ", b : " + b);
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a : " + a + ", b : " + b);
	}
	
	public static void swapUsingBits() {
		// temp를 사용하지 않고 swap (안쓰는 코드)
		int a = 10;
		int b = 15;
		System.out.println("a : " + a + ", b : " + b);
		
		a = a ^ b;
		b = a ^ b;
		a = b ^ a;
		System.out.println("a : " + a + ", b : " + b);
	}

}
