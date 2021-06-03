public class LogicalUtility {
	
	/* Function to check the day of the week of given date */
	
	static String dayOfWeek(int d, int m, int y) {
		String day = null;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		switch (d0) {
		case 0 :
		day = "Sunday";
			break;
		case 1 :
		day = "Monday";
			break;
		case 2 :
		day = "Tuesday";
			break;
		case 3 :
		day = "Wednesday";
			break;
		case 4 :
		day = "Thrusday";
			break;
		case 5 :
		day = "Friday";
			break;
		case 6 :
		day = "Saturday";
			break;
		}
		
		return day;
}



/* Function to convert fahrenheit to celcius and vice-versa */

static int temperaturConversion(int temperature, char t) {
		int conversion;
		if (t == 'c' || t == 'C') {
			conversion = (temperature * 9 / 5) + 32;
		} else if (t == 'f' || t == 'F') {
			conversion = (temperature - 32) * 5 / 9;
		} 
		else {
			System.out.println("Enter correct input");
			return 0;
		}
		return conversion;
	}

/*  Functions to calculate monthly payment for R interest and P principal for Y years   */

static double monthlyPayment(double P, double Y, double R) {
		double n = 12 * Y;
		double r = R / (12 * 100);
		double payment = P * r / (1 - Math.pow((1 + r), -n));
		return payment;
	}
	
/*   Function to find the square root of given number     */
	
	
static double sqrt(double c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2;
		}

		return t;
	}

/*  Function to convert decimal to binary String  */

static int[] toBinary(int decimal) {

		String bin = "";
		while (decimal != 0) {
			bin = (decimal % 2) + bin;
			decimal /= 2;
		}
		while (bin.length() % 4 != 0) {
			bin = 0 + bin;
		}
		return stringToIntArray(bin);
	}

	/*  Function to convert  binary String to binary int array  */
	
	
	static int[] stringToIntArray(String bin) {
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}
	
/*  Function to convert binary into decimal */	
 static int toDecimal(int[] binary) {
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) {
			if (binary[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;

}
}

