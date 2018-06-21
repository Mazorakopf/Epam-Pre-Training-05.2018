package by.epam.pretraining.kleshchenko.task10;

import java.util.Random;

public class Test {

	public static void executeRecurrent() {

		Random random = new Random();
		
		View.print("+++++ Recurrent Algorithms +++++");
		
		int num = random.nextInt(50000);
		View.printf("The sum of the digits in the number - %d : %d\n", num, RecursiveAlgorithms.calcSumOfDigit(num));

		num = random.nextInt(16);
		int exp = random.nextInt(10);
		View.printf("The number %d to the power of %d = %d\n", num, exp, RecursiveAlgorithms.pow(num, exp));

		View.print("The sum of the digits in the number 1234567 equals 28 ? " + RecursiveAlgorithms.equals(1234567, 28));
		View.print("The sum of the digits in the number 10 equals 7 ? " + RecursiveAlgorithms.equals(10, 7));
		View.print("The sum of the digits in the number 10000 equals 1 ? " + RecursiveAlgorithms.equals(10000, 1));
	
		View.printf("The %dth Fibonacci number: %d\n", num, RecursiveAlgorithms.getFibonacci(num));
	}
	
	public static void executeIterative() {

		Random random = new Random();
		
		View.print("\n+++++ Iterative Algorithms +++++");
		
		int num = random.nextInt(50000);
		View.printf("The sum of the digits in the number - %d : %d\n", num, IterativeAlgorithms.calcSumOfDigit(num));

		num = random.nextInt(16);
		int exp = random.nextInt(10);
		View.printf("The number %d to the power of %d = %d\n", num, exp, IterativeAlgorithms.pow(num, exp));

		View.print("The sum of the digits in the number 1234567 equals 28 ? " + IterativeAlgorithms.equals(1234567, 28));
		View.print("The sum of the digits in the number 10 equals 7 ? " + IterativeAlgorithms.equals(10, 7));
		View.print("The sum of the digits in the number 10000 equals 1 ? " + IterativeAlgorithms.equals(10000, 1));
	
		View.printf("The %dth Fibonacci number: %d\n", num, IterativeAlgorithms.getFibonacci(num));
	}

}
