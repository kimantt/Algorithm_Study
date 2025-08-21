package algorithm.d_dataStructure.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import algorithm.d_dataStructure.list._LinkedList;

public class EXmain {

	public static void main(String[] args) {
		// 문자열에서 가장 많이 반복되는 문자 찾기
		char[] maxChars = maxChars("hashmap");		
		
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < maxChars.length; i++) {
			sb.append("\"").append(maxChars[i]).append("\"").append(", ");
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.deleteCharAt(sb.lastIndexOf(" "));
		sb.append("]");
		System.out.println(sb.toString());
	}

	public static char[] maxChars(String str) {
		char[] characters = str.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			int init = 1;
			if (charMap.get(characters[i]) != null) init = charMap.get(characters[i]) + 1;
			charMap.put(characters[i], init);
		}
		
		int maxValue = 0;
		for (int value : charMap.values()) {
			if (value > maxValue) maxValue = value;
		}
		
		List<Character> maxChars = new ArrayList<Character>();
		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			if (entry.getValue() == maxValue) {
				maxChars.add(entry.getKey());
			}
		}
		
		char[] result = new char[maxChars.size()];
		for (int i = 0; i < maxChars.size(); i++) {
            result[i] = maxChars.get(i);
        }
		
		return result;
	}
}
