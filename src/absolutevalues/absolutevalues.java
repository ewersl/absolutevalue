package absolutevalues;

public class absolutevalues {
	public static void main (String[] args) {
		System.out.println(largerAbsVal(-5, 11.2));
		
		double answer = largerAbsVal(-21.3, 12);
		System.out.println(answer);
	}
	
	// larger Absolute value method 
	public static double largerAbsVal (double num1, double num2) {
		double largerNum; 
		 
		if (num1 <0 ) {
			num1 = num1 * -1;
		
		}
		if (num2 < 0) {
			num2 = num2 * -1;
		}
		
		if (num1 > num2) {
			largerNum= num1;
		} else {
			largerNum = num2;
		}
		
		return largerNum;
	}
}
