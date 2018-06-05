package by.epampretraining.kleshchenko.task04;

public class NaturalNum {

	public static final int RANK = 10;
	public static final String ITS_NOT_NATURAL = "It's not natural number";
	public static final int FIRST_PERFECT_NUM = 6;

	public static boolean isPerfect(int num) throws NaturalNumException {

		int sum = 1;

		if (num < 0) {
			throw new NaturalNumException(ITS_NOT_NATURAL);
		}

		if (num >= FIRST_PERFECT_NUM) {
			for (int div = 2; div < num; div++) {
				if (num % div == 0) {
					sum += div;
				}
			}
		}

		return (sum == num) ? true : false;
	}

	public static int maxDigit(int num) throws NaturalNumException {

		int maxDigit = num % RANK;
		int tempNum = num;

		if (num < 0) {
			throw new NaturalNumException(ITS_NOT_NATURAL);
		}

		for (int i = 1; i < getCountsOfDigits(num); i++) {
			int nextDigit = (tempNum /= RANK) % RANK;
			if (maxDigit < nextDigit) {
				maxDigit = nextDigit;
			}
		}
		return maxDigit;
	}

	public static int reverseNum(int num) throws NaturalNumException {

		int lastDigit = num % RANK;
		int newNum = lastDigit;
		int tempNum = num;

		if (num < 0) {
			throw new NaturalNumException(ITS_NOT_NATURAL);
		}

		for (int i = 1; i < getCountsOfDigits(num); i++) {
			int nextDigit = (tempNum /= RANK) % RANK;
			newNum = newNum * RANK + nextDigit;
		}

		return newNum;
	}

	public static boolean isPolindrom(int num) throws NaturalNumException {

		if (num < 0) {
			throw new NaturalNumException(ITS_NOT_NATURAL);
		}

		return num == reverseNum(num);
	}

	public static boolean isPrime(int num) throws NaturalNumException {

		if (num < 0) {
			throw new NaturalNumException(ITS_NOT_NATURAL);
		}

		for (int div = 2; div < num; div++) {
			if (num % div == 0) {
				return false;
			}
		}
		return true;
	}

	public static int numOfDifDigit(int num) throws NaturalNumException {
		
		if (num < 0) {
			throw new NaturalNumException(ITS_NOT_NATURAL);
		}

		int count = 0;
		for (int i = 0; i < RANK; i++) {
			int tempNum = num;
			while (tempNum != 0) {
				if (tempNum % RANK == i) {
					count++;
					break;
				}
				tempNum /= RANK;
			}
		}
		return count;
	}

	public static String primeDivid(int num) throws NaturalNumException {
		
		if (num < 0) {
			throw new NaturalNumException(ITS_NOT_NATURAL);
		}

		StringBuilder str = new StringBuilder();

		for (int div = 2; div <= num; div++) {
			if (num % div == 0 && isPrime(div)) {
				str.append(div).append(" ");
			}
		}
		return str.toString();
	}

	public static int gcd(int a, int b) throws NaturalNumException {
		
		if (a < 0 || b < 0) {
			throw new NaturalNumException(ITS_NOT_NATURAL);
		}

		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return b;
	}

	public static int lcm(int a, int b) throws NaturalNumException {
		
		if (a < 0 || b < 0) {
			throw new NaturalNumException(ITS_NOT_NATURAL);
		}
		
		
		return a / gcd(a, b) * b;
	}

	public static int getCountsOfDigits(int num) throws NaturalNumException {
		
		if (num < 0) {
			throw new NaturalNumException(ITS_NOT_NATURAL);
		}
		
		return (num == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(num) + 0.5));
	}
}
