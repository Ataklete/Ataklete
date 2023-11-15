import java.time.LocalDateTime;

class FileTrace implements Trace {
	    
    public boolean debug;
	@Override
    public void setDebug( boolean debug ) {
          this.debug = debug;
    }
    @Override
    public void debug( String message ) {
          if( debug ) {  // only print if debug is true
                System.out.printf("File---DEBUG @ %s: %s %n", LocalDateTime.now(), message);
               
          }
    }
    public void error( String message ) {
          // write it to a file
    	   System.out.printf("File---DEBUG @ %s: %s %n", LocalDateTime.now(), message);
    }
}