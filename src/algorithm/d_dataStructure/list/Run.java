package algorithm.d_dataStructure.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import algorithm.d_dataStructure.dto.School;

public class Run {

	public static void main(String[] args) {
		// 직접 구현한 _LinkedLink 테스트
		//System.out.println(init());
		//testGet();
		//testRemove();
		testForEach();
		//testSet();
		//testSort();
	}

	private static _LinkedList<Integer> init() {
		_LinkedList<Integer> list = new _LinkedList<Integer>();
		for (int i = 0; i < 15; i++) {
			list.add(i);
		}
		
		return list;
	}
	
	private static void testGet() {
		_LinkedList<Integer> list = init();
		for (int i = 5; i < 8; i++) {
			System.out.println(list.get(i));
		}
	}
	
	private static void testRemove() {
		_LinkedList<Integer> list = init();
		for (int i = 5; i < 8; i++) {
			list.remove(5);
		}
		
		System.out.println(list);
	}
	
	private static void testSet() {
		_LinkedList<Integer> list = init();
		System.out.println(list.set(0, 10));
		System.out.println(list);
	}
	
	private static void testForEach() {
		_LinkedList<Integer> list = init();
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
	
	private static void testSort() {
		School seoulUniv = new School("서울대", "관악구", "대학교");
		School yeonsaeUniv = new School("연세대", "서울", "대학교");
		School minsa = new School("민사고", "대전", "고등학교");
		School multicampus = new School("멀티캠퍼스", "역삼", "아카데미");
		
		ArrayList<School> schools = new ArrayList<School>();
		schools.add(seoulUniv);
		schools.add(yeonsaeUniv);
		schools.add(minsa);
		schools.add(multicampus);
		
		// 레벨을 기준으로 오름차순 정렬, 레벨이 같다면 이름으로 내림차순 정렬
		Collections.sort(schools);
		
		// 익명 클래스로도 가능
		Collections.sort(schools, new Comparator<School>() {
			@Override
			public int compare(School o1, School o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		// 람다식도 가능
		Collections.sort(schools, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		
		System.out.println(schools);
	}

}
