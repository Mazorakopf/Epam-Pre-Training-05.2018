package by.epampretraining.kleshchenko.task02;

/**
 * The class {@code EvaluatorOfNum} contains methods for evaluate numbers.
 * 
 * @author Vladislav Kleshchenko
 */
public class EvaluatorOfNum {

	/**
	 * The method gets three numbers and compares them. If the numbers are equal, it's
	 * returns - true, else - false. The method uses the transitive relation.
	 * 
	 * @param a		The first number.
	 * @param b		The second number.
	 * @param c		The third number.      
	 * @return 		The boolean value.
	 */
	public static boolean isEqual(int a, int b, int c) {

		return a == b && b == c;
	}

	/**
	 * The method gets four-digit and less numbers and evaluates it. If the digits of number 
	 * increase, it's returns - true, else - false.  Special cases:
     * <ul><li>If the argument is greater than a four-digit number, then 
     * will be evaluate the last three digit with number that ramaines in a head and always 
     * return false.  
	 * 
	 * @param num	The four-digit number.
	 * @return 		The boolean value.
	 */
	public static boolean isIncreaseNum(int num) {

		int thFrth = num % 10;
		int thTrd  = num / 10 % 10;
		int thSnd  = num / 100 % 10;
		int thFst  = num / 1000;

		return thFrth > thTrd && thTrd > thSnd && thSnd > thFst;

	}

	/**
	 * The method gets four-digit and less numbers and evaluates it. If the digits of number 
	 * decrease, it's returns - true, else - false.  Special cases:
     * <ul><li>If the argument is greater than a four-digit number, then 
     * will be evaluate the last three digit with number that ramaines in a head and always 
     * return false.  
	 * 
	 * @param num	The four-digit number.
	 * @return 		The boolean value.
	 */
	public static boolean isDecreaseNum(int num) {

		int thFrth = num % 10;
		int thTrd  = num / 10 % 10;
		int thSnd  = num / 100 % 10;
		int thFst  = num / 1000;		
		
		return thFrth < thTrd && thTrd < thSnd && thSnd < thFst;
		
	}

}
