import java.time.LocalDateTime;

public class ConsoleTrace implements Trace {

	public boolean debug;

	@Override
	public void setDebug(boolean debug) {
	
		this.debug = debug;;
		
	}

	@Override
	public void debug(String message) {
	
		   System.out.printf("File---DEBUG @ %s: %s %n", LocalDateTime.now(), message);
	}

	@Override
	public void error(String message) {
		
		   System.out.printf("File---DEBUG @ %s: %s %n", LocalDateTime.now(), message);
	}

}
