package by.epam.pretraining.kleshchenko.task10;

public class RecurrentAlgorithms {
	
	static final int FIRST_FIB_NUM = 0;
	static final int SECOND_FIB_NUM = 1;
	static final int ERROR_INPUT = -1;
	static final int DECREMENT = 10;

	public static int calcSumOfDigit(int num) {
		
		if (num < 0)
			return ERROR_INPUT;
		
		return num != 0 ? num % 10 + calcSumOfDigit(num / DECREMENT) : 0;
	}
	
	public static long pow(int num, int exp) {
		
		if (num == 0 || exp < 0)
			return ERROR_INPUT;
		
		return exp != 0 ? num * pow(num, exp - 1) : 1;
	}
	
	public static boolean equals(int num, int standard) {
		
		if (num < 0 || standard < 0)
			return false;
		
		return num != 0 ? equals(num / DECREMENT, standard - num % 10) : standard == 0;
	}
	
	public static int getFibonacci(int index) {
		
		if (index < 1) {
			return ERROR_INPUT;
		} else if (index == 2) {
			return SECOND_FIB_NUM;
		}
		
		return index != 1 ? getFibonacci(index - 1) + getFibonacci(index - 2) : FIRST_FIB_NUM;
	}
	
}
