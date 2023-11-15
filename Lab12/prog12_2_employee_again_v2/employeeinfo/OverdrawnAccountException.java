package prog12_2_employee_again_v2.employeeinfo;

@SuppressWarnings("serial")
public class OverdrawnAccountException extends Exception {
	
	public OverdrawnAccountException(String msg) {
		super(msg);
	}

}
