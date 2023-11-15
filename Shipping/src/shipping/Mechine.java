package shipping;

public class Mechine  extends PriceandWeight implements SheppingFee{
		
		private String item;



	public Mechine(double price, int weight, String item) {
			super(price, weight);
			this.item = item;
		}



	public double sheppingfee() {
		 
		 return 0.5*(super.getPrice()* super.getWeight());
	}
	}