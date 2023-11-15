package mock2;

public class Department {
	private String depName;
	private String location;
//	private Company name;
	public Department( String depName, String location) {
	
		this.depName = depName;
		this.location = location;
	//	this.name = name;
	}
	
	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getLocation() {
		return location;
	}
	
	
	public String getDepName() {
		return depName;
	}

	@Override
	public String toString() {
		return "Department [depName=" + depName + ", location=" + location + "]";
	}

}
