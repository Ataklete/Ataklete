package onlineBusiness;

public  class Gift {
	

	private String person;
	private PackageType type;
	private double price1;
	private double price2;
	private double price3;
	
	public Gift(String person, PackageType type) {
		super();
		this.person = person;
		this.type = type;
		
	}
     
	public Gift(double price1, double price2, double price3) {
		super();
		this.price1 = price1;
		this.price2 = price2;
		this.price3 = price3;
	}

	public double getPrice1() {
		return price1;
	}

	public void setPrice1(double price1) {
		this.price1 = price1;
	}

	public double getPrice2() {
		return price2;
	}

	public void setPrice2(double price2) {
		this.price2 = price2;
	}

	public double getPrice3() {
		return price3;
	}

	public void setPrice3(double price3) {
		this.price3 = price3;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public PackageType getType() {
		return type;
	}

	public void setType(PackageType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "[Person Name =  " + person + ", Type of Gift =  " + type + "]";
	}
	
	

	
	
	

}
