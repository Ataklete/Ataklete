package lesson4.empmanager.useinheritance;

public class ManagerSpecialTest {

	public static void main(String[] args) {
		Manager boss = new Manager("Boss Guy", 80000, 
				  1987, 12, 15);
		boss.setBonus(5000);
		Employee[] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("Jimbo", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tommy", 40000, 1990, 3,15);

		Class c0 = staff[0].getClass();
		String cName = c0.getSimpleName();
		Class c1 = staff[1].getClass();
		System.out.println(	"Class name for 0 is " + cName);
		
		System.out.println(	"toString for boss is " + boss);
		System.out.println(	"toString for employee staff[1] is " + staff[1]);
		System.out.println();

		if (staff[0].getClass() == staff[1].getClass())
			System.out.println("Class Test - is same class");
		
		if (staff[0] instanceof Employee)
			System.out.println("instanceOf Test - is same class");

		int i = 0;
		//print class names using for incremental loop
		System.out.println(	"Class name in For loop ");
		for(; i < staff.length; i++) {
			Class cl = staff[i].getClass();
			System.out.println(	"Class name for element at "+ i +" is " + cl.getSimpleName());
		} 

		//print class names using for each loop
		System.out.println();
		System.out.println(	"Class name in For Each loop ");
		i = 0;
		for(Employee e : staff) {
			Class cl = e.getClass();
			System.out.println(	"Class name for element at "+ i++ +" is " + cl.getSimpleName());
		} 
	}
}
