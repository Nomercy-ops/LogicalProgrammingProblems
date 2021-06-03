package BridgeLabz;

import java.util.Scanner;

public class PrimeNumber {
	
	static void primeNumberCheck(int userInput) {
		int divide = (int) Math.sqrt(userInput);
		int i;
		int flag = 0;
		if(userInput == 0 || userInput == 1){  
			   System.out.println(userInput +" is not prime number");      
			  }
		else {  
			   for(i=2; i <= divide; i++){      
			    if(userInput % i == 0){      
			     System.out.println(userInput +" is not prime number");      
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag == 0) {
				   System.out.println(userInput +" is prime number");
				   }  
			  }
			}  
				 
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number To check Prime or Not : ");
		int userInput = scanner.nextInt();
		primeNumberCheck(userInput);
	}

}
