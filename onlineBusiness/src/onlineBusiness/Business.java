package onlineBusiness;

public class Business extends Gift implements Int {
	
	
	private String marchant;
	private String hardPlastic;
	private String holiydaySurprise;
	public Business(String a, String b, String c, double price1, double price2, double price3) {
		super(price1, price2, price3);
		this.marchant = a;
		this.holiydaySurprise = b;
		this.holiydaySurprise = c;
	}
	
	@Override
	public String Box() {
		
		return this.hardPlastic + " " + super.getPrice1();
	}
	
	@Override
	public String Bag() {
		
		return this.marchant + " " + super.getPrice2();
	}
	
	@Override
	public String Wrap() {
		
		return  this.holiydaySurprise + " " + this.getPrice3();
	}

	@Override
	public String toString() {
		return "Business [marchant=" + marchant + ", hardPlastic=" + hardPlastic + ", holiydaySurprise="
				+ holiydaySurprise + ", getPrice1()=" + getPrice1() + ", getPrice2()=" + getPrice2() + ", getPrice3()="
				+ getPrice3() + ", getPerson()=" + getPerson() + ", getType()=" + getType() + "]";
	}

	
	
	
	
	
	
	
	
 
	
	
    
}
