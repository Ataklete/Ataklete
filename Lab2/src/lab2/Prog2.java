package lab2;
import java.util.Random;
import java.lang.Math.*; 

public class Prog2 {

	

	public static void main(String[] args) {
		// int pi = 3;
		
		int x = getRandomInt(2, 9);
		   
		System.out.println(x);
				System.out.println(Math.pow(Math.PI, x)); 
				
		int y = getRandomInt(3,14);
		
		        System.out.println(Math.pow(y,Math.PI));
		        
		      }
		      	  
		   
	
	 public static int getRandomInt(int min, int max)
	 {
		 Random rand = new Random();
		 if ( min > max)
			 return 0;
			    return  rand.nextInt((max-min)+1)+min ;

	      
	 }



       
    }
    



