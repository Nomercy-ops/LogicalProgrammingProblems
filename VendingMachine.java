package BridgeLabz;

import java.util.Scanner;

public class VendingMachine {

	static int i, totalNotesCount;
	static int[] vendingMachineNotes = { 2000, 500, 100, 50, 10, 5, 2, 1 };

	
	static void returnedChangeMoney(int userAmount) {
		
			// checking if user amount divided by vending machine notes at index 0 not equal to zero..
		if (userAmount / vendingMachineNotes[i] != 0) {
			
			totalNotesCount += (userAmount / vendingMachineNotes[i]); //tracking or storing total notes count..
			System.out.println(vendingMachineNotes[i] + " rs notes :" + userAmount / vendingMachineNotes[i]);
			userAmount = userAmount % vendingMachineNotes[i]; //new amount  will be stored for further money change
		}
		i++; //increamenting vending machine index to select different notes change..
		if (userAmount == 0) {
			System.out.println("total notes : " + totalNotesCount);
			return;
		}

		returnedChangeMoney(userAmount); //this will loop the process for change untill user amount is not equal to zero..

	}

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter a amount for change : ");
			int userAmount = scanner.nextInt();
			returnedChangeMoney(userAmount);
			scanner.close();
		
	}
}

