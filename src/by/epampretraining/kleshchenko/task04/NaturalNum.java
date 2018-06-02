package by.epampretraining.kleshchenko.task04;

public class NaturalNum {
	
	public static final int RANK = 10;

	public static boolean isPerfect(int num) {

		int sum = 1;
		boolean b = false;

		if (num != 1) {
			for (int div = 2; div < num; div++) {
				if (num % div == 0) {
					sum += div;
				}
			}
			if (sum == num) {
				b = true;
			}
		}
		return b;
	}

	public static int maxDigit(int num) {

		int maxDigit = num % RANK;
		int countOfDigits = getCountsOfDigits(num);

		for (int i = 1; i < countOfDigits; i++) {
			int nextDigit = (num /= RANK) % RANK;
			if (maxDigit < nextDigit) {
				maxDigit = nextDigit;
			}
		}
		return maxDigit;
	}

	public static int reverseNum(int num) {

		int countOfDigits = getCountsOfDigits(num);
		int newNum = num % RANK;

		for (int i = 1; i < countOfDigits; i++) {
			int nextDigit = (num /= RANK) % RANK;
			newNum = newNum * RANK + nextDigit;
		}
		return newNum;
	}

	public static boolean isPolindrom(int num) {

		return num == reverseNum(num);
	}

	public static boolean isPrime(int num) {

		boolean res = true;

		for (int div = 2; div < num; div++) {
			if (num % div == 0) {
				res = false;
			}
		}
		return res;
	}

	public static int numOfDifDigit(int num) {

		int count = 0;
		int tempNum;
		for (int i = 0; i < RANK; i++) {
			tempNum = num;
			while (tempNum > 0) {
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

		for (int div = 2; div < num; div++) {
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
