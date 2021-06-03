package BridgeLabz;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number To Reverse : ");
		int userInput = scanner.nextInt();
		System.out.println("Number Before Reverse is : " +userInput);
		NumberReverse(userInput);
		
	}

	private static void NumberReverse(int userInput) {
		int remainder; int reverseNumber = 0;
		
		while (userInput != 0) {
			
			remainder = userInput % 10;
			reverseNumber = reverseNumber*10 + remainder;
			userInput = userInput/10;
		}
		
		System.out.println("Number After Reverse is : " +reverseNumber);	
	}
}
