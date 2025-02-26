package prog10_1;

public class EmployeeDriver {

	public static void main(String[] args) {
		new EmployeeDriver();

	}

	public EmployeeDriver() {
		System.out.println("--------------according their name -------------------");

		NameComparator nameComp = new NameComparator();

		EmployeeBST bst = new EmployeeBST(nameComp);
		bst.insert(new Employee("George", 40000, 1996, 11, 5));
		bst.insert(new Employee("Dave", 50000, 2000, 1, 3));
		bst.insert(new Employee("Sally", 45000, 2001, 2, 7));
		bst.insert(new Employee("Richard", 80000, 1986, 3, 23));
		bst.printTree();

		System.out.println("\n\n--------------according their hiredate -------------------");

		HireDateComparator HireDateCompare = new HireDateComparator();
		EmployeeBST bstH = new EmployeeBST(HireDateCompare);

		bstH.insert(new Employee("George", 40000, 1996, 11, 5));
		bstH.insert(new Employee("Dave", 50000, 2000, 1, 3));
		bstH.insert(new Employee("Sally", 45000, 2001, 2, 7));
		bstH.insert(new Employee("Richard", 80000, 1986, 3, 23));
		bstH.printTree();

	}
}
