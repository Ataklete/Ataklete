package lab3_1;

public class Q1Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Q1Address(String str, String cit, String st, String z) {
		street = str;
		city = cit;
		state = st;
		zip = z;
}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "["+ street + "," + city + ", "+ state + "," + zip + "]";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	/*
	 * public String toString() { return "Q1Address [street=" + street + ", city=" +
	 * city + ", state=" + state + ", zip=" + zip + "]"; }
	 */

	
}