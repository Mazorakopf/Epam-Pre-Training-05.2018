package by.epampretraining.kleshchenko.task02;

import java.util.ArrayList;
import java.util.List;

/**
 * The class {@code Task02} tester.
 * 
 * @author Vladislav Kleshchenko
 */

public class Task02 {

	public static void main(String[] args) {
		
		int first = 0;
		int last = 1;

		List<Integer> listI = new ArrayList<Integer>();
		
		System.out.println("a = b = c ? ---> " + EvaluatorOfNum.isEqual(6, 3, 6));
		
		System.out.println("Weight in kilograms: "+ Dino.showWeight(Dino.VELOCIRAPTOR));
		System.out.println("Weight in grams: "+ Dino.сonvertToGram(Dino.VELOCIRAPTOR));
		System.out.println("Weight in miligrams: "+ Dino.сonvertToMiliGram(Dino.VELOCIRAPTOR));
		System.out.println("Weight in tones: "+ Dino.сonvertToTone(Dino.VELOCIRAPTOR));
		
		System.out.println("Square area of the ring: " + MyMath.sqAreaRing(30, 20));
		
		System.out.println("It's increase num ? " + EvaluatorOfNum.isIncreaseNum(1357));
		
		System.out.println("It's decrease num ? " + EvaluatorOfNum.isDecreaseNum(8421));
		
		System.out.println("Arithmetic Mean: " + MyMath.aMean(146239) + "\n"
				+ "Geometric Mean: " + MyMath.gMean(146239));
		
		System.out.println("Reverse num: " + EditNum.reverseNum(1235623));
		
		listI = EditNum.swap(4,5);
		System.out.printf("Swap number :\nа = %d\nb = %d",
				listI.get(first), listI.get(last));
	}

}
