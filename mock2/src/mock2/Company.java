package mock2;

public class Company {
	//private String compName;
	private Employee emp;
	private Department dep; 
	
	public Company( Employee emp, Department dep) {
		
		//this.compName = name;
		this.emp = emp;
		this.dep =dep;
	}

	
	/*
	 * public String getName() { return compName; }
	 * 
	 * public void setName(String name) { this.compName = name; }
	 */
	@Override
	public String toString() {
		return "Company [name=" +"emp=" + emp + ", dep=" + dep + "]";
	}
	

}
