package BridgeLabz;

import java.util.Scanner;

public class PerfectNumber {
	
	static void perfectNumberCheck(int userInput) {
		int sum = 0;
		int i;
		for(i = 1; i < userInput; i++) {
			
			if (userInput % i == 0) {
				 sum = sum + i;
			}
		}
				if (sum == userInput) {
					System.out.println( userInput  + " is a Perfect Number");	
				}
				else
				{
					System.out.println(userInput + " is NOT a Perfect Number");
				}
				 
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number To check Perfect or Not : ");
		int userInput = scanner.nextInt();
		perfectNumberCheck(userInput);
	}

}
