package shipping;

public class main {

	public static void main(String[] args) {
		SheppingFee[] obj = {new Book(4,5,3),
							 new Toy(100,5,"toy"),
							 new Mechine(5,1,"Laptop")};
		
        for (SheppingFee sp: obj) {
        	
        	System.out.println(sp.getClass().getSimpleName() +" "+ sp.sheppingfee());
        }
	}

}
