package spring.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	@SuppressWarnings("rawtypes")
	List addressList;
	@SuppressWarnings("rawtypes")
	Set addressSet;
	@SuppressWarnings("rawtypes")
	Map addressMap;
	Properties addressProp;

	// a setter method to set List
	@SuppressWarnings("rawtypes")
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}

	// prints and returns all the elements of the list.
	@SuppressWarnings("rawtypes")
	public List getAddressList() {
		System.out.println("List Elements :" + addressList);
		return addressList;
	}

	// a setter method to set Set
	@SuppressWarnings("rawtypes")
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}

	// prints and returns all the elements of the Set.
	@SuppressWarnings("rawtypes")
	public Set getAddressSet() {
		System.out.println("Set Elements :" + addressSet);
		return addressSet;
	}

	// a setter method to set Map
	@SuppressWarnings("rawtypes")
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

	// prints and returns all the elements of the Map.
	@SuppressWarnings("rawtypes")
	public Map getAddressMap() {
		System.out.println("Map Elements :" + addressMap);
		return addressMap;
	}

	// a setter method to set Property
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}

	// prints and returns all the elements of the Property.
	public Properties getAddressProp() {
		System.out.println("Property Elements :" + addressProp);
		return addressProp;
	}
}
