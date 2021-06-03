package BridgeLabz;

import java.util.Scanner;

public class SimulateStopwatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  Number Of Times To Print Hello : ");
		int userInput = scanner.nextInt();
		long startTime= System.currentTimeMillis();
		printHello(userInput);
		long endTime = System.currentTimeMillis();
		elapsedTime(startTime, endTime);
	}

	private static void elapsedTime(long startTime, long endTime) {
		System.out.println("Elapsed Time Is : " + (endTime-startTime) + " ms");
	}

	private static void printHello(int userInput) {
		for(int i = 0; i < userInput;i++) {
			System.out.println("Hello");
			
		}
	}

}
