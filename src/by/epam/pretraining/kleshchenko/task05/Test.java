package by.epam.pretraining.kleshchenko.task05;

import java.util.Arrays;

public class Test {
	public static void execute(int arrSize, int lowLimit, int upperLimit) {

		int[] arr = new int[arrSize];

		System.out.println("========================================");
		
		System.out.printf("For array size: %d\nLow limit - %d, upper limit - %d\n", arrSize, lowLimit, upperLimit);

		try {
			Array.init(arr, lowLimit, upperLimit);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Array " + Arrays.toString(arr));
		
		try {
			System.out.println("Global maximum extreme: " + Array.getMax(arr));
			System.out.println("Global minimum extreme: " + Array.getMin(arr));
			System.out.println("It's increasing sequence? " + Array.isIncreasingSequence(arr));
			System.out.println("It's deceasing sequence? " + Array.isDecreasingSequence(arr));

			System.out.println("Index of local maximum extreme: " + Array.findIndexFstLocalMax(arr));
			System.out.println("Index of local minimum extreme: " + Array.findIndexFstLocalMin(arr));
			
			System.out.println("Arithmetical mean: " + Array.calcAverage(arr));
			System.out.println("Geometrical mean: " + Array.calcGeometricAverage(arr));

			Array.reverse(arr);
			System.out.println("+++REVERSE+++");
			System.out.println("Array " + Arrays.toString(arr));

			System.out.println("Index of local maximum extreme: " + Array.findIndexFstLocalMax(arr));
			System.out.println("Index of local minimum extreme: " + Array.findIndexFstLocalMin(arr));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void execute(int[] arr) {

		System.out.println("========================================");
		
		System.out.println("Array " + Arrays.toString(arr));
		
		try {
			System.out.println("Global maximum extreme: " + Array.getMax(arr));
			System.out.println("Global minimum extreme: " + Array.getMin(arr));
			System.out.println("It's increasing sequence? " + Array.isIncreasingSequence(arr));
			System.out.println("It's deceasing sequence? " + Array.isDecreasingSequence(arr));

			System.out.println("Index of local maximum extreme: " + Array.findIndexFstLocalMax(arr));
			System.out.println("Index of local minimum extreme: " + Array.findIndexFstLocalMin(arr));
			
			System.out.println("Arithmetical mean: " + Array.calcAverage(arr));
			System.out.println("Geometrical mean: " + Array.calcGeometricAverage(arr));

			Array.reverse(arr);
			System.out.println("+++REVERSE+++");
			System.out.println("Array " + Arrays.toString(arr));

			System.out.println("Index of local maximum extreme: " + Array.findIndexFstLocalMax(arr));
			System.out.println("Index of local minimum extreme: " + Array.findIndexFstLocalMin(arr));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
