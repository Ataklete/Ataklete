package shipping;

public class PriceandWeight {
	private double price;
	private int weight;
	
	public PriceandWeight(double price, int weight) {
		super();
		this.price = price;
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "PriceandWeight [price=" + price + ", weight=" + weight + "]";
	}

}
