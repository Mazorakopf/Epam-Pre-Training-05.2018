package by.epampretraining.kleshchenko.task02;

/**
 * The class {@code NumToDigits} that splits four-digit, six-digit, seven-digit 
 * numbers into single digits.
 * 
 * @author Vladislav Kleshchenko
 */

public class NumToDigits {
	
	//Key fields
	public static final byte FOUR_DIGIT = 4;
	public static final short SIX_DIGIT = 4;
	public static final int SEVEN_DIGIT = 4;
	
	//Digits
	private int thSnth;
	private int thSxth;
	private int thFfth;
	private int thFrth;
	private int thTrd;
	private int thSnd;
	private int thFst;
    
	/**
	 * Creates object that consists four fields (four digits).
	 * 
	 * @param num			Number that will convert into digits.
	 * @param FOUR_DIGIT	The key field defines the bit number.
	 */
	public NumToDigits(int num, byte FOUR_DIGIT) {	
		
		thFrth = num % 10;
		thTrd = num / 10 % 10;
		thSnd = num / 100 % 10;
		thFst = num / 1000;
	}
	
	/**
	 * Creates object that consists six fields (six digits).
	 * 
	 * @param num			Number that will convert into digits.
	 * @param SIX_DIGIT		The key field defines the bit number.
	 */
	public NumToDigits(int num, short SIX_DIGIT) {	
		
		thSxth = num % 10;
		thFfth = num / 10 % 10;
		thFrth = num / 100 % 10;
		thTrd = num / 1000 % 10;
		thSnd = num / 10000 % 10;
		thFst = num / 100000;
	}
	
	/**
	 * Creates object that consists seven fields (seven digits).
	 * 
	 * @param num			Number that will convert into digits.
	 * @param SEVEN_DIGIT	The key field defines the bit number.
	 */
	public NumToDigits(int num, int SEVEN_DIGIT) {	
		
		thSnth = num % 10;
		thSxth = num / 10 % 10;
		thFfth = num / 100 % 10;
		thFrth = num / 1000 % 10;
		thTrd = num / 10000 % 10;
		thSnd = num / 100000 % 10;
		thFst = num / 1000000;
	}

	public int getThSnth() {
		return thSnth;
	}

	public int getThSxth() {
		return thSxth;
	}

	public int getThFfth() {
		return thFfth;
	}

	public int getThFrth() {
		return thFrth;
	}

	public int getThTrd() {
		return thTrd;
	}

	public int getThSnd() {
		return thSnd;
	}

	public int getThFst() {
		return thFst;
	}
	
	
}
