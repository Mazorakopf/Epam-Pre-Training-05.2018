package by.epam.pretraining.kleshchenko.task04;

public class NaturalNum {

	public static final int RANK = 10;
	public static final String ITS_NOT_NATURAL = "It's not natural number";
	public static final int FIRST_PERFECT_NUM = 6;
	public static final int FIRST_NATURAL_DIV = 1;

	public static boolean isPerfect(int num) {

		int sum = FIRST_NATURAL_DIV;
		int count = num / 2;

		checkNum(num);

		if (num < FIRST_PERFECT_NUM) {
			return false;
		}

		if (num % 2 == 0) {
			for (int div = 2; div <= count; div++) {
				sum = num % div == 0 ? sum + div : sum;
			}
		} else {
			for (int div = 3; div <= count; div += 2) {
				sum = num % div == 0 ? sum + div : sum;
			}
		}

		return sum == num;
	}

	public static int maxDigit(int num) {

		int maxDigit = num % RANK;
		int tempNum = num;

		checkNum(num);

		while (tempNum != 0) {
			int nextDigit = (tempNum /= RANK) % RANK;
			if (maxDigit < nextDigit) {
				maxDigit = nextDigit;
			}
		}
		return maxDigit;
	}

	public static int reverseNum(int num) {

		int newNum = 0;
		int tempNum = num;

		checkNum(num);

		while (tempNum != 0) {
			newNum = newNum * RANK + tempNum % RANK;
			tempNum /= RANK;
		}

		return newNum;
	}

	public static boolean isPolindrom(int num) {
		String strNum = Integer.toString(num);
		int count = strNum.length() / 2;

		checkNum(num);

		for (int i = 0; i < count; i++) {
			if (strNum.charAt(i) != strNum.charAt(strNum.length() - i - 1)) {
				return false;
			}
		}

		return true;
	}

	public static boolean isPrime(int num) {

		int count = num / 2;
		boolean res = true;

		checkNum(num);

		if (num < 2) {
			res = false;
		} else if (num == 2) {

		} else if (num % 2 == 0) {
			res = false;
		}

		for (int div = 3; div < count; div += 2) {
			if (num % div == 0) {
				res = false;
			}
		}
		return res;
	}

	public static int numOfDifDigit(int num) {

		int count = 0;

		checkNum(num);

		for (int i = 0; i < RANK; i++) {
			int tempNum = num;
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

		int count = num / 2;

		checkNum(num);

		StringBuilder str = new StringBuilder();

		if (num % 2 == 0) {
			str.append(2).append(" ");
		}

		for (int div = 3; div <= count; div += 2) {
			if (num % div == 0 && isPrime(div)) {
				str.append(div).append(" ");
			}
		}

		if (num % 2 != 0 && isPrime(num)) {
			str.append(num);
		}

		return str.toString();
	}

	public static int gcd(int firstNum, int secondNum) {

		checkNum(firstNum, secondNum);

		while (firstNum != secondNum) {
			if (firstNum > secondNum) {
				firstNum = firstNum - secondNum;
			} else {
				secondNum = secondNum - firstNum;
			}
		}
		return secondNum;
	}

	public static int lcm(int firstNum, int secondnum) {

		checkNum(firstNum, secondnum);

		return firstNum / gcd(firstNum, secondnum) * secondnum;
	}

	public static void checkNum(int num) {
		if (num < 0) {
			throw new IllegalArgumentException(ITS_NOT_NATURAL);
		}
	}

	public static void checkNum(int a, int b){
		if (a < 0 || b < 0) {
			throw new IllegalArgumentException(ITS_NOT_NATURAL);
		}
	}
}
