package algorithm.d_dataStructure.dto;

import java.util.Objects;

public class School implements Comparable<School> {
	
	private String name;
	private String address;
	private String level;
	
	public School(String name, String address, String level) {
		super();
		this.name = name;
		this.address = address;
		this.level = level;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getLevel() {
		return level;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", address=" + address + ", level=" + level + "]";
	}

	@Override
	public int compareTo(School o) {
		// 1순위 : level 기준 오름차순 비교
		int result = -1 * this.level.compareTo(o.level);
		if (result != 0) return result;
		
		// 2순위 : name 기준 내림차순 비교
		return this.name.compareTo(o.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, level, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(address, other.address) && Objects.equals(level, other.level)
				&& Objects.equals(name, other.name);
	}
	
}
