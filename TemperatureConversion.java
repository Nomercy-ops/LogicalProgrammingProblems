import java.util.Scanner;
public class TemperatureConversion {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter temperature in c or f");
			int temperature = scanner.nextInt();
			char t = scanner.next().charAt(0); // here t is used to check whether  temperature is celsius or fahrenhiet..
	
			if (t != 'f' && t != 'F' && t != 'c' && t != 'C') {
				System.out.println("Enter correct input");
				main(args);
				return;
			}
			temperature = LogicalUtility.temperaturConversion(temperature, t);
			System.out.println("coverted temp is " + temperature);
			scanner.close();
		

	}
}
