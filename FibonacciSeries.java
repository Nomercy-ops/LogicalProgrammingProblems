import java.util.Scanner;
public class FibonacciSeries {
        static int previousTerm1 = 0;
		static int previousTerm2 = 1;
		
	
		static void fibonacciSeries(int userInput){
			
			for (int i = 1; i <= userInput; i++ ){
				System.out.print(previousTerm1);
				int nextTerm = previousTerm1 + previousTerm2;
				previousTerm1 = previousTerm2;
				previousTerm2 = nextTerm;
				System.out.print(" ");
			}
			
		}
	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number of Term to Print Fibonacci Series : ");
		int userInput = scanner.nextInt();
		fibonacciSeries(userInput);

}
}