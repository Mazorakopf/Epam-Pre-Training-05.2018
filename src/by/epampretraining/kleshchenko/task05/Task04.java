package by.epampretraining.kleshchenko.task05;

import java.util.Arrays;

public class Task04 {

	public static void main(String[] args) {

		int[] arr = new int[15];
		
		Array.init(arr, 1, 20);

		System.out.println("Array " + Arrays.toString(arr));

		System.out.println("It's increasing sequence? " + Array.isIcreasingSequence(arr));
		System.out.println("It's deceasing sequence? " + Array.isDecreasingSequence(arr));

		System.out.println("Global maximum extreme: " + Array.globalMaxElement(arr));
		System.out.println("Global minimum extreme: " + Array.globalMinElement(arr));
		System.out.println("Arithmetical mean: " + Array.average(arr));
		System.out.println("Geometrical mean: " + Array.averageGeometric(arr));

		Array.reverse(arr);
		System.out.println("Reverse array " + Arrays.toString(arr));

		System.out.println("Index of local maximum extreme: " + Array.findIndexFstLocalMax(arr));
		System.out.println("Index of local minimum extreme: " + Array.findIndexFstLocalMin(arr));

	}

}
