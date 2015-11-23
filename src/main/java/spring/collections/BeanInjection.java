package spring.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeanInjection {
	List<address1> address1;
	List<address2> address2;

	Set<address1> address1Set;
	Set<address2> address2Set;

	Map<String, String> map;

	public List<address1> getAddress1() {
		return address1;
	}

	public void setAddress1(List<address1> address1) {
		this.address1 = address1;
	}

	public List<address2> getAddress2() {
		return address2;
	}

	public void setAddress2(List<address2> address2) {
		this.address2 = address2;
	}

	public Set<address1> getAddress1Set() {
		return address1Set;
	}

	public void setAddress1Set(Set<address1> address1Set) {
		this.address1Set = address1Set;
	}

	public Set<address2> getAddress2Set() {
		return address2Set;
	}

	public void setAddress2Set(Set<address2> address2Set) {
		this.address2Set = address2Set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
}