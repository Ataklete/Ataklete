package lab3;
public class Customer {
	private String Fname;
	private String Lname;
	private String SSN;
	private Address billingAddress;
	private Address shipingAddress;
	
	
	public Customer(String fname, String lname, String sSN) {
		super();
		Fname = fname;
		Lname = lname;
		SSN = sSN;
	}
	
	@Override
	public String toString() {
		return "Customer [Fname=" + Fname + ", Lname=" + Lname + ", SSN=" + SSN + ", billingAddress=" + billingAddress
				+ ", shipingAddress=" + shipingAddress + "]";
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShipingAddress() {
		return shipingAddress;
	}

	public void setShipingAddress(Address shipingAddress) {
		this.shipingAddress = shipingAddress;
	}

	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}


	

}
  
 