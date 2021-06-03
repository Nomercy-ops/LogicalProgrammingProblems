import java.util.Scanner;
public class DayOfWeek {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int d, m, y;
		System.out.println("Enter date in day month year : ");
		d = scanner.nextInt();
		m = scanner.nextInt();
		y = scanner.nextInt();
		System.out.println("day is "+LogicalUtility.dayOfWeek(d, m, y));
		scanner.close();

	}


}