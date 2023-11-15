package prog2;

@SuppressWarnings("serial")
public class LowBalanceExceptio extends Exception {
	public LowBalanceExceptio() {
		super();
	}
	public LowBalanceExceptio(String msg) {
		super(msg);
	}
	public LowBalanceExceptio(Throwable t) { 
		super(t);
	}
}
