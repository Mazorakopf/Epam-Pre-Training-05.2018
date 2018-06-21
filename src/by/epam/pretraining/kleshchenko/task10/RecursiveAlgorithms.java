package by.epam.pretraining.kleshchenko.task10;

public class RecursiveAlgorithms {

	static final int FIRST_FIB_NUM = 0;
	static final int SECOND_FIB_NUM = 1;
	static final int ERROR_INPUT = -1;
	static final int DECREMENT = 10;

	public static int calcSumOfDigit(int num) {

		if (num < 0) {
			return ERROR_INPUT;
		}

		return calcSumOfDigitR(num);
	}

	public static int calcSumOfDigitR(int num) {

		return num != 0 ? num % 10 + calcSumOfDigitR(num / DECREMENT) : 0;
	}

	public static long pow(int num, int exp) {

		if (num == 0 || exp < 0)
			return ERROR_INPUT;

		return powR(num, exp);
	}

	public static long powR(int num, int exp) {

		return exp != 0 ? num * powR(num, exp - 1) : 1;
	}

	public static boolean equals(int num, int standard) {

		if (num < 0 || standard < 0)
			return false;

		return equalsR(num, standard);
	}

	public static boolean equalsR(int num, int standard) {

		return num != 0 ? equalsR(num / DECREMENT, standard - num % 10) : standard == 0;
	}

	public static long getFibonacci(int index) {

		if (index < 1) {
			return ERROR_INPUT;
		}

		return getFibonacciR(index);
	}

	public static long getFibonacciR(int index) {

		if (index == 2) {
			return SECOND_FIB_NUM;
		}

		return index != 1 ? getFibonacciR(index - 1) + getFibonacciR(index - 2) : FIRST_FIB_NUM;
	}

}
