package prog8_4;

import java.util.ArrayList;
import java.util.List;

class Address {
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	public Address(String name, String street, String city, String state, String zip) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public String toUpper(String a) {		
		return a.toUpperCase();
	}
	@Override
	public String toString() {
		return "Address [getName()=" + getName() + ", getStreet()=" + getStreet() + ", getCity()=" + getCity()
				+ ", getState()=" + getState() + ", getZip()=" + getZip() + "]";
	}

	public String getName() {
		return name;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	
	
}