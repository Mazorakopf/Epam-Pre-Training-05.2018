package by.epampretraining.kleshchenko.task03;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Number of heads: " + Dragon.checkNumOfHeads(325));
		System.out.println("Number of eyes: " + Dragon.checkNumOfEyes(325));
		
		System.out.println("It is " + Triangle.isTriangle(0,0,0,6,8,0));
	
		System.out.println("It's vowel ? " + Vowel.isVowel('u'));
		
		System.out.println("Hm, I think your mood is " + MoodSensor.scanningSoul());
		
		System.out.println("The next day: " + Calendar.nextDay(28, 2, 2009));
	}
}
