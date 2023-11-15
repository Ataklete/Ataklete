package recurtion;

public class Two {
	
	public void minusFive(int num) {
		int y = num;
		if (num >-5 && num<=y) {
			 System.out.println(num);
				  minusFive(num-5);
				  if (num>-0)
			 System.out.println(num);
					
			}		
	
	}
	public static void main(String[] args) {
		
            Two n = new Two();
            n.minusFive(16);
	}

}
