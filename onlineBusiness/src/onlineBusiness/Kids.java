package onlineBusiness;

public class Kids extends Gift implements Int{
	
	private String micky;
	private String carton;
	private String happyKid;
	public Kids(String a, String b,String c,double price1, double price2, double price3) {
		super(price1, price2, price3);
		this.micky = a;
		this.carton = b;
		this.happyKid = c;
	}
	public Kids(String person, PackageType type) {
		super(person, type);
		
	}
	@Override
	public String Box() {
		return this.carton + " " + super.getPrice1();
	}
	@Override
	public String Bag() {
		return this.micky + " " + super.getPrice2();
	}
	@Override
	public String Wrap() {
		return this.happyKid + " " + super.getPrice3();
	}
	@Override
	public String toString() {
		return "Kids [micky=" + micky + ", carton=" + carton + ", happyKid=" + happyKid + ", getPrice1()=" + getPrice1()
				+ ", getPrice2()=" + getPrice2() + ", getPrice3()=" + getPrice3() + "]";
	}
	
	
	
	
}
