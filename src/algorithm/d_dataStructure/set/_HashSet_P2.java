package algorithm.d_dataStructure.set;

import java.util.Arrays;
import java.util.Iterator;

import algorithm.d_dataStructure.list.Node;

@SuppressWarnings("unchecked")
public class _HashSet_P2<E> implements Iterable<E>{

	private Object[] table;
	private int arraySize = 2;
	private int size;
	
	public _HashSet_P2() {
		this.table = new Object[arraySize];
	}
	
	public _HashSet_P2(int initialCapacity) {
		this.arraySize = initialCapacity;
		this.table = new Object[arraySize];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return this.size;
	}
	
	private int hash(Object e) {
		int hashCode = Math.abs(e.hashCode());
		return hashCode % arraySize;
	}
	
	public boolean add(E e) {		
		if (size == arraySize - 1) {
			resize();
		}
		
		if (!addNode(e)) return false;
		size++;
		
		return true;
	}

	private boolean addNode(E e) {
		int index = hash(e);
		Node<E> node = new Node<E>(e);
		Node<E> head = (Node<E>)table[index];
		if (head == null) {
			table[index] = node;
			return true;
		}
		
		Node<E> link = head;
		while (link.next() != null) {
			if (link.data().equals(e)) return false;
			link = link.next();
		}
		if (link.data().equals(e)) return false;
		link.next(node);
		return true;
	}
	
	public boolean remove(E e) {
		int index = hash(e);
		Node<E> head = (Node<E>)table[index];
		
		if (head == null) return false;
		if (head.data().equals(e)) {
			table[index] = head.next();
			size--;
			return true;
		}
		
		Node<E> link = head.next();
		Node<E> prev = head;
		while (link != null) {
			if (link.data().equals(e)) {
				prev.next(link.next());
				size--;
				return true;
			}
			
			prev = link;
			link = link.next();
			
		}
		
		return false;
	}

	private void resize() {
		Object[] temp = Arrays.copyOf(table, arraySize);
		arraySize *= 2;
		table = new Object[arraySize];
		
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == null) continue;
			Node<E> link = (Node<E>)temp[i];
			
			while (link != null) {
				addNode(link.data());
				link = link.next();
			}
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i <table.length; i++) {
			if (table[i] == null) continue;
			Node<E> link = (Node<E>)table[i];
			while (link != null) {
				sb.append(link.data()).append(", ");
				link = link.next();
			}
		}
		
		sb.deleteCharAt(sb.lastIndexOf(", "));
		sb.append("]");
		
		return sb.toString();
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			private int pointer = -1;
			Node<E> head = null;
			Node<E> next = null;

			@Override
			public boolean hasNext() {
				return pointer <= size;
			}

			@Override
			public E next() {
				if (next == null) {
					do {
						pointer++;
						head = (Node<E>)table[pointer];
					} while (head == null);
					next = head.next();
				}
				else {
					head = next;
					next = head.next();
				}
				return head.data();
			}
		};
	}
	
}
