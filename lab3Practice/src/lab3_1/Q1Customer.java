/**
 * 
 */
package lab3_1;

public class Q1Customer {
	private String Fname;
	private String Lname;
	private String SSN;
	private Q1Address billingAddress;
	private Q1Address shipingAddress;
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
	public Q1Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Q1Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Q1Address getShipingAddress() {
		return shipingAddress;
	}
	public void setShipingAddress(Q1Address shipingAddress) {
		this.shipingAddress = shipingAddress;
	}
	public Q1Customer(String fname, String lname, String sSN, Q1Address billingAddress, Q1Address shipingAddress) {
		super();
		Fname = fname;
		Lname = lname;
		SSN = sSN;
		this.billingAddress = billingAddress;
		this.shipingAddress = shipingAddress;
	}
	@Override
	public String toString() {
		return "Q1Customer [Fname=" + Fname + ", Lname=" + Lname + ", SSN=" + SSN + ", billingAddress=" + billingAddress
				+ ", shipingAddress=" + shipingAddress + "]";
	}
	
		/*public Q1Customer(String Fname, String Lname, String ssn, Q1Address b, Q1Address S ) {
			
			this.Fname= Fname;
			this.Lname = Lname;
			this.SSN= ssn;
			this.billingAddress = b;
			this.shipingAddress = S;
			*/
			
			
			
			
		}
	}

