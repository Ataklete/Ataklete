package shipping;

public class Book extends PriceandWeight implements SheppingFee {
	
	private int book;
	
public Book(double price, int book, int weight) {
	super(price,weight);
	
	this.book = book;
	
}

public double sheppingfee() {
	 double s =enjoy(book);
	 double m = super.getPrice()*book;
	 return 2*(m * super.getWeight())+s;
}

public double enjoy(double a) {
	if (a>4)
		return book+1; 
	else 
		return 0;
}
}