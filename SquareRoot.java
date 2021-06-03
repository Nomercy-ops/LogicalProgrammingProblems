import java.util.Scanner;
public class SquareRoot {
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter A Number To Find Square Root");
			double c = scanner.nextDouble();
			System.out.println("Square Root Is :  " + LogicalUtility.sqrt(c));
			scanner.close();
		

	}
}
