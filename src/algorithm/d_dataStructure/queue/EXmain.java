package algorithm.d_dataStructure.queue;

import java.util.ArrayList;
import java.util.List;

public class EXmain {

	public static void main(String[] args) {
		// 요세푸스 순열 문제
		int[] result = action(7, 3);
		
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < result.length; i++) {
			sb.append(result[i]).append(", ");
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.deleteCharAt(sb.lastIndexOf(" "));
		sb.append("]");
		System.out.println(sb.toString());
	}
	
	public static int[] action(int num, int constant) {
		_Queue<Integer> queue = new _Queue<Integer>();
		for (int i = 1; i <= num; i++) {
			queue.enqueue(i);
		}
		
		List<Integer> order = new ArrayList<Integer>();
		while (queue.size() != 1) {
			_Queue<Integer> temp = new _Queue<Integer>();
			int step = (constant - 1) % queue.size();
			for (int i = 0; i < step; i++) {
				temp.enqueue(queue.dequeue());
			}
			order.add(queue.dequeue());
			int tempSize = temp.size();
			for (int i = 0; i < tempSize; i++) {
				queue.enqueue(temp.dequeue());
			}
		}
		order.add(queue.dequeue());
		
		int[] result = new int[order.size()];
		for (int i = 0; i < order.size(); i++) {
		    result[i] = order.get(i);
		}
		return result;
	}

}
