import java.util.Scanner;
public class CouponNumbers {
	
	  private static int getRandomNumber(int userInput) {
	        return (int) (Math.random() * userInput);
	    }

	
	    private static int collectDistinctCoupon(int userInput) {
	        boolean[] isCollected = new boolean[userInput];  
	        int count = 0;                           
	        int distinct  = 0;                       

	       
	        while (distinct < userInput) {
	            int value = getRandomNumber(userInput);         
	            count++;                             
	            if (!isCollected[value]) {          
	                distinct++;
	                isCollected[value] = true;
	            }
	        }
	        System.out.println("The Distinct Coupon are : "+distinct);
	        return count;
	    }

	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Numbers to generate coupons: ");
	        int userInput = scanner.nextInt();
	        int count = collectDistinctCoupon(userInput);
	        System.out.println(count);
	    } 
}