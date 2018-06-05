package by.epampretraining.kleshchenko.task04;

public class NaturalNum {

	public static final int RANK = 10;
	public static final int ITS_NOT_NATURAL = -1;
	public static final int FIRST_PERFECT_NUM = 6;

	public static boolean isPerfect(int num) {

		if (num >= FIRST_PERFECT_NUM) {
			int sum = 1;
			for (int div = 2; div < num; div++) {
				if (num % div == 0) {
					sum += div;
				}
			}
			if (sum == num) {
				return true;
			}
		}

		return false;
	}

	public static int maxDigit(int num) {

		int maxDigit = num % RANK;

		if (num > 0) {
			int tempNum = num;
			for (int i = 1; i < getCountsOfDigits(num); i++) {
				int nextDigit = (tempNum /= RANK) % RANK;
				if (maxDigit < nextDigit) {
					maxDigit = nextDigit;
				}
			}
			return maxDigit;
		}
		return ITS_NOT_NATURAL;
	}

	public static int reverseNum(int num) {

		int lastDigit= num % RANK;
		int newNum = lastDigit;
		int tempNum = num;

		for (int i = 1; i < getCountsOfDigits(num); i++) {
			int nextDigit = (tempNum /= RANK) % RANK;
			newNum = newNum * RANK + nextDigit;
		}

		return newNum;
	}

	public static boolean isPolindrom(int num) {

		return num == reverseNum(num);
	}

	public static boolean isPrime(int num) {

		for (int div = 2; div < num; div++) {
			if (num % div == 0) {
				return false;
			}
		}

		return true;
	}

	public static int numOfDifDigit(int num) {

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

	public static String primeDivid(int num) {

		StringBuilder str = new StringBuilder();

		for (int div = 2; div <= num; div++) {
			if (num % div == 0 && isPrime(div)) {
				str.append(div).append(" ");
			}
		}
		return str.toString();
	}

	public static int gcd(int a, int b) {
		return b == 0 ? Math.abs(a) : gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return a / gcd(a, b) * b;
	}

	public static int getCountsOfDigits(int num) {
		return (num == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(num) + 0.5));
	}
}
