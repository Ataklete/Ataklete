
public class CountInstance {
	private static int count;
	CountInstance(){
		++count;
	}

	public static int getCount() {
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for ( int i=0; i<10; i++) {
    	  new CountInstance();
     
	}
	 System.out.println( CountInstance.count);
}
}