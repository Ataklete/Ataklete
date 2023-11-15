package recurtion;

//fun1 printing in number n divide by 2 till n become 1,
//fun2 printing in "*" by decrement n number by one 

public class OneSub {
	public int fun1(int n){     //avoid the same method name 
		if(n == 1)      
			return 0;   
		else    
			return 1 + fun1(n/2); 
		}   
	 
	public void fun2(int n) {    
		int i = 0;       
		if (n > 1)      
			fun1(n-1);     
		for (i = 0; i < n; i++)    
			System.out.println(" * ");  //printf is for string format eg (printf("%-3s", "*"))
		} 





	public static void main(String[] args) {
		OneSub test =new OneSub();
		System.out.println(test.fun1(16));
		test.fun2(10);
		
		
	}	
}
