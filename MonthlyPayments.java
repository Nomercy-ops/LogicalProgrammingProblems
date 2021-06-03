import java.util.Scanner;
public class MonthlyPayments {
	
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Principal Year and Rate");
		double P = scanner.nextDouble();
		double Y = scanner.nextDouble();
		double R = scanner.nextDouble();
		scanner.close();
		System.out.println("Mothly Payment is " + LogicalUtility.monthlyPayment(P, Y, R));
	}
		
	}

