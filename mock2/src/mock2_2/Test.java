package mock2_2;



public class Test {

	public static void main(String[] args) {
        
        Perm perm1 = new Perm("Tom",1000,2000,3,14);
        Perm perm2 = new Perm("Henry",2400,2001,6,4);
        Perm perm3 = new Perm("Brad",4000,2003,9,20);

        Contractor con1 = new Contractor("Tom",700,2003,9,20);
        Contractor con2 = new Contractor("Alex",900,2004,9,20);
        Contractor con3 = new Contractor("Bob",800,2005,9,20);
        
        Manager man1 = new Manager("Michale",30000,2001,5,21);
        Manager man2 = new Manager("Susan",20000,2002,5,21);
        
        con1.setOvertimeHours(200);
        con2.setOvertimeHours(300);
        con3.setOvertimeHours(450);
        
        
        
       Employee[] emp1 = new Employee[10];
        emp1[0]=perm1;
        emp1[1]=perm2;
        emp1[2]=perm3;
        emp1[3]=con1;
        emp1[4]=con2;
        emp1[5]=con3;
        emp1[6]=man1;
        emp1[7]=man2;
        
        double totalSalary=0;
        for (Employee a : emp1) {
        totalSalary = totalSalary + a.computeSalary();
        System.out.println(totalSalary);
        }
       
        
	}

}
