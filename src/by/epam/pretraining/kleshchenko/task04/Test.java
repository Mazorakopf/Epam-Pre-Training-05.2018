package by.epam.pretraining.kleshchenko.task04;

class Test {
	public static void execute(int n) {
		System.out.println("For " + n + " :");
		System.out.println("Heads and Tail: " + HeadsOrTails.countHeads(n));
		System.out.println("Is perfect number? " + NaturalNum.isPerfect(n));
		System.out.println("Largest digit - " + NaturalNum.maxDigit(n));
		System.out.println("Reverse number - " + NaturalNum.reverseNum(n));
		System.out.println("Is palindrome number? - " + NaturalNum.isPolindrom(n));
		System.out.println("Is prime? - " + NaturalNum.isPrime(n));
		System.out.println("Prime dividers are " + NaturalNum.primeDivid(n));
		System.out.println("Number of different digits " + NaturalNum.numOfDifDigit(n));
	}
	public static void execute(int a, int b) {
		System.out.println("For " + a + " and " + b + " :");
		System.out.println("GCD - " + NaturalNum.gcd(a, b));
		System.out.println("LCM - " + NaturalNum.lcm(a, b));
	}
}
