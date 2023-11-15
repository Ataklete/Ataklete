package mock2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee("Ati","Haile","teffera","7368232",20000,2000,03,19);
		Position position = new Position("computersciense ", "Worker",emp);
		Department dep =new Department("IT","FairField");
		Company c1 = new Company(emp,dep);
		System.out.println(position);
		System.out.println(dep);
		//System.out.println(c1);

	}

}
