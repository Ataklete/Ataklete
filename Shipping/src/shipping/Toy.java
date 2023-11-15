package shipping;

public class Toy extends PriceandWeight implements SheppingFee {
	
	private String item;

public Toy(double price, int weight, String item) {
	super(price, weight);
	this.item = item;
}


public double sheppingfee() {
	 
	 return 10/100*(super.getPrice()* super.getWeight());
}
}