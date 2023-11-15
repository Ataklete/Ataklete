package prog2;

public class Test {

	public static void main(String[] args) {
		Person p = new Person("Joe");
		PersonWithJob withJob = new PersonWithJob(p,10000);
	
		System.out.println(p.equals(withJob)); 

		System.out.println(withJob.equals(p)); 
		
		System.out.println(p); 

		System.out.println(withJob); 

	}
}
