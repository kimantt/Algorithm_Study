package algorithm.d_dataStructure;

public class Run {

	public static void main(String[] args) {
		// 직접 구현한 _ArrayList 테스트
		System.out.println(init());
		testGet();
		testRemove();
	}

	private static _ArrayList<Integer> init() {
		_ArrayList<Integer> list = new _ArrayList<Integer>();
		for (int i = 0; i < 15; i++) {
			list.add(i);
		}
		
		return list;
	}
	
	private static void testGet() {
		_ArrayList<Integer> list = init();
		for (int i = 5; i < 8; i++) {
			System.out.println(list.get(i));
		}
	}
	
	private static void testRemove() {
		_ArrayList<Integer> list = init();
		for (int i = 5; i < 8; i++) {
			list.remove(5);
		}
		
		System.out.println(list);
	}

}
