package by.epampretraining.kleshchenko.task04;

public class Task04 {

	public static void main(String[] args){

		try {
			System.out.println(HeadsOrTails.countHeads(10));
			System.out.println(HeadsOrTails.countTails(10));
			System.out.println(NaturalNum.isPerfect(6));
			System.out.println(NaturalNum.isPrime(5));
			System.out.println(NaturalNum.numOfDifDigit(339634));
			System.out.println(NaturalNum.gcd(15, 30));
			System.out.println(NaturalNum.lcm(15, 30));
			System.out.println(NaturalNum.reverseNum(123445));
			System.out.println(NaturalNum.isPolindrom(1225221));
			System.out.println(NaturalNum.primeDivid(13));
		}catch(NaturalNumException e) {
			System.out.println(e.getMessage());
		}

	}
}
