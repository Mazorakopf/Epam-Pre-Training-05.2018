package by.epam.pretraining.kleshchenko.task05;

import java.util.Arrays;

public class Test {
	public static void execute(int arrSize, int lowLimit, int upperLimit) {

		int[] arr = new int[arrSize];

		Array.init(arr, lowLimit, upperLimit);

		System.out.printf("For array size: %d\nLow limit - %d, upper limit - %d\n",
														arrSize, lowLimit, upperLimit);

		System.out.println("Array " + Arrays.toString(arr));

		System.out.println("It's increasing sequence? " + Array.isIncreasingSequence(arr));
		System.out.println("It's deceasing sequence? " + Array.isDecreasingSequence(arr));

		System.out.println("Arithmetical mean: " + Array.average(arr));
		System.out.println("Geometrical mean: " + Array.averageGeometric(arr));

		Array.reverse(arr);
		System.out.println("Reverse array " + Arrays.toString(arr));

		System.out.println("Index of local maximum extreme: " + Array.findIndexFstLocalMax(arr));
		System.out.println("Index of local minimum extreme: " + Array.findIndexFstLocalMin(arr));
		try{
			System.out.println("Global maximum extreme: " + Array.globalMaxElement(arr));
			System.out.println("Global minimum extreme: " + Array.globalMinElement(arr));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
