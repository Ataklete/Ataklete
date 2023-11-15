package lab3;

/**
 * Creates a few Employees, stores them in an array.
 * Then locates all Employees with first name Bill
 * 
 * @author pcorazza
 * @since Jan 2016
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Address add1A = new Address("10 Adams", "chicago", "IL", "52556");
		Address add1B = new Address("110 Burlington", "Fairfield", "IA", "52556");
		Address add2A = new Address("1000 North", "Fairfield", "IA", "52556");
		Address add2B = new Address("2210 Burlington", "Chicago", "IL", "52556");
		
		Address add3A = new Address("Washington", "Chicago", "IL", "52556");
		Address add3B = new Address("Washington", "Chicago", "IL", "52556");
		
		Customer customer = new Customer("Joe", "Smith", "1234342");
		customer.setBillingAddress(add1A);
		customer.setShipingAddress(add1B);
		
		Customer customer1 = new Customer("Bob", "Marly", "1234342");
		customer1.setBillingAddress(add2A);
		customer1.setShipingAddress(add2B);
		
		//Creates an Employee array of length 2
		Customer[] customerArray = new Customer[2];
		customerArray[0] = customer;
		customerArray[1] = customer1;
		
		/*
		 * Searches the array for an Employee having first name "Bill".
		 * If found, prints out the Employee's full name
		 */
		for(int i = 0; i < customerArray.length; ++i) {
				System.out.println("Found the Boss! " + customerArray[i].toString());

		}
		
		
		
		
	}

}
