package algorithm.d_dataStructure.map;

import java.util.Objects;

public class Entry<K, V> {

	private K Key;
	private V value;
	
	public Entry(K key, V value) {
		Key = key;
		this.value = value;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return Key;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Key);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entry other = (Entry) obj;
		return Objects.equals(Key, other.Key);
	}

	@Override
	public String toString() {
		return "Entry [Key=" + Key + ", value=" + value + "]";
	}
	
}
