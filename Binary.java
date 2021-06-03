import java.util.Scanner;
public class Binary {
	static void showArr(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
		static boolean powerOfTwo(int n)
    {
        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) 
            == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
	


	static int[] swapNibbles(int[] arr) {
		// swap nibbles at first and last of the array
		// j is used for saving last 4 index of the array
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) { // loop runs 4 times and swap first four element to last four elements
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}				
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a no : ");
			int[] binary = LogicalUtility.toBinary(scanner.nextInt());
			System.out.println("Binary  representation is :  ");
			showArr(binary);
			swapNibbles(binary);
			System.out.println("after swapping  : ");
			showArr(binary);
			int swapDecimal = LogicalUtility.toDecimal(binary);
			System.out.println("decimal of swapped binary is " + swapDecimal);
			
			if (powerOfTwo(swapDecimal))
				System.out.println("it is power of 2");
			else
				System.out.println("it is not power of 2");
	}	
}