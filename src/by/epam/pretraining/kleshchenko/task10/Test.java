package by.epam.pretraining.kleshchenko.task10;

import java.util.Random;

public class Test {

	public static void executeRecurrent() {

		Random random = new Random();
		
		System.out.println("+++++ Recurrent Algorithms +++++");
		
		int num = random.nextInt(50000);
		System.out.printf("The sum of the digits in the number - %d : %d\n", num, RecurrentAlgorithms.calcSumOfDigit(num));

		num = random.nextInt(16);
		int exp = random.nextInt(10);
		System.out.printf("The number %d to the power of %d = %d\n", num, exp, RecurrentAlgorithms.pow(num, exp));

		System.out.println("The sum of the digits in the number 1234567 equals 28 ? " + RecurrentAlgorithms.equals(1234567, 28));
		System.out.println("The sum of the digits in the number 10 equals 7 ? " + RecurrentAlgorithms.equals(10, 7));
		System.out.println("The sum of the digits in the number 10000 equals 1 ? " + RecurrentAlgorithms.equals(10000, 1));
	
		System.out.printf("The %dth Fibonacci number: %d\n", num, RecurrentAlgorithms.getFibonacci(num));
	}
	
	public static void executeIterative() {

		Random random = new Random();
		
		System.out.println("\n+++++ Iterative Algorithms +++++");
		
		int num = random.nextInt(50000);
		System.out.printf("The sum of the digits in the number - %d : %d\n", num, IterativeAlgorithms.calcSumOfDigit(num));

		num = random.nextInt(16);
		int exp = random.nextInt(10);
		System.out.printf("The number %d to the power of %d = %d\n", num, exp, IterativeAlgorithms.pow(num, exp));

		System.out.println("The sum of the digits in the number 1234567 equals 28 ? " + IterativeAlgorithms.equals(1234567, 28));
		System.out.println("The sum of the digits in the number 10 equals 7 ? " + IterativeAlgorithms.equals(10, 7));
		System.out.println("The sum of the digits in the number 10000 equals 1 ? " + IterativeAlgorithms.equals(10000, 1));
	
		System.out.printf("The %dth Fibonacci number: %d\n", num, IterativeAlgorithms.getFibonacci(num));
	}

}
