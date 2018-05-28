package by.epampretraining.kleshchenko.task02;

import java.util.ArrayList;
import java.util.List;

public class EditNum {
	
	/**
	 * The method gets seven-digit numbers and reverse it.  Special cases:
     * <ul><li>If the argument is greater than a seven-digit number, then 
     * the result will be the last six digits plus the number that remains in a head. 
     * <ul><li>If the argument is less than a seven-digit number, then 
     * the result will be added with zeros. 
	 * 
	 * @param num	The seven-digit number.
	 * @return 		The reverse seven-digit number.
	 */
	public static int reverseNum(int num) {

		int thSnth = num % 10;
		int thSxth = (num /= 10) % 10;
		int thFfth = (num /= 10) % 10;
		int thFrth = (num /= 10) % 10;
		int thTrd  = (num /= 10) % 10;
		int thSnd  = (num /= 10) % 10;
		int thFst  = (num /= 10);

		return thSnth * 1000000 + thSxth * 100000 + thFfth * 10000 
				+ thFrth * 1000 + thTrd * 100 + thSnd * 10 + thFst;
	}
	
	/**
	 * The method gets two paramaters and swap their value.
	 * 
	 * @param a		The first number.
	 * @param b		The second number.
	 * @return		The List with two numbers.
	 */
	public static List<Integer> swap(int a, int b) {

		List<Integer> nums = new ArrayList<Integer>();

		a = a + b - (b = a);

		nums.add(a);
		nums.add(b);

		return nums;
	}

}
