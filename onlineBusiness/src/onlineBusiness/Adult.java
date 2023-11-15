package onlineBusiness;

public class Adult extends Gift implements Int {
	
	private String reusableShopper;
	private String planePaper;
	private String everydayValue;
		
	public Adult(String a,String b,String c,double price1, double price2, double price3) {
		super(price1, price2, price3);
		this.reusableShopper = a;
		this.planePaper = b;
		this.everydayValue = c;
	}
	@Override
	public String Box() {
		return this.reusableShopper + " " + super.getPrice1();
	}
	@Override
	public String Bag() {
		return this.planePaper + " " + super.getPrice2();
	}
	@Override
	public String Wrap() {
		return this.everydayValue + " " + super.getPrice3();
	}
	@Override
	public String toString() {
		return "Adult [reusableShopper=" + reusableShopper + ", planePaper=" + planePaper + ", everydayValue="
				+ everydayValue + ", getPrice1()=" + getPrice1() + ", getPrice2()=" + getPrice2() + ", getPrice3()="
				+ getPrice3() + "]";
	}
	
	
	

}
