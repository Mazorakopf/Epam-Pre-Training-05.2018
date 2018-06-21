package by.epam.pretraining.kleshchenko.task10;

public class IterativeAlgorithms {

	static final int FIRST_FIB_NUM = 0;
	static final int SECOND_FIB_NUM = 1;
	static final int ERROR_INPUT = -1;
	static final int DECREMENT = 10;


	public static int calcSumOfDigit(int num) {
		int result = 0;
		while (num > 0) {
			result += num % 10;
			num /= DECREMENT;
		}
		return result;
	}

	public static long pow(int num, int exp) {

		if (num == 0 || exp < 0)
			return ERROR_INPUT;

		long result = 1;
		for (int i = exp; i > 0; i--) {
			result *= num;
		}
		return result;
	}

	public static boolean equals(int num, int standard) {

		if (num < 0 || standard < 0)
			return false;

		while (num > 0) {
			standard -= num % 10;
			num /= DECREMENT;
		}

		return standard == 0;
	}

	public static int getFibonacci(int index) {

		if (index < 1) {
			return ERROR_INPUT;
		} else if (index == 2) {
			return SECOND_FIB_NUM;
		}

		int fib1 = FIRST_FIB_NUM;
		int fib2 = SECOND_FIB_NUM;

		for (int i = 2; i < index; i++) {

			int temp = fib2;
			fib2 += fib1;
			fib1 = temp;

		}

		return fib2;
	}
}
