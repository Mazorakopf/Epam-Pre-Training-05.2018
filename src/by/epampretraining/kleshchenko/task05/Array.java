package by.epampretraining.kleshchenko.task05;

import java.util.Random;

public class Array {

	public static int[] init(int bound) {

		if (bound <= 0) {
			throw new NegativeArraySizeException("Invalid bound. Couldn't initialize array");
		}

		int[] arr = new int[bound];
		Random random = new Random();

		for (int i = 0; i < bound; i++) {
			arr[i] = random.nextInt(99);
		}
		return arr;
	}

	public static int globalMaxElement(int[] arr) {
		
		if (arr == null) {
			throw new IllegalArgumentException("No elements in array");
		}

		int max = arr[0];

		for (int j = 1; j < arr.length; j++) {
			if (arr[j] > max) {
				max = arr[j];
			}
		}

		return max;
	}

	public static int globalMinElement(int[] arr) {
		
		if (arr == null) {
			throw new IllegalArgumentException("No elements in array");
		}

		int min = arr[0];

		for (int j = 1; j < arr.length; j++) {
			if (arr[j] < min) {
				min = arr[j];
			}
		}

		return min;
	}

	public static double average(int[] arr) {
		
		for (int value : arr) {
			if (arr == null || value < 0) {
				throw new IllegalArgumentException("No elements in array or array consist negative element");
			}
		}
		
		double sum = 0;

		for (int value : arr) {
			sum += value;
		}
		return sum / arr.length;
	}

	public static double averageGeometric(int[] arr) {
		
		for (int value : arr) {
			if (arr == null || value < 0) {
				throw new IllegalArgumentException("No elements in array or array consist negative element");
			}
		}
		
		double mul = 1;

		for (int value : arr) {
			mul *= value;
		}
		return Math.pow(mul, 1. / arr.length);
	}

	public static boolean isIcreasingSequence(int[] arr) {
		
		if (arr == null || arr.length < 2) {
			throw new IllegalArgumentException("No elements in array or not enough elements");
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean isDecreasingSequence(int[] arr) {
		
		if (arr == null || arr.length < 2) {
			throw new IllegalArgumentException("No elements in array or not enough elements");
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i]) {
				return false;
			}
		}
		return true;
	}

	public static int findIndexFstLocalMin(int[] arr) {

		if (arr == null || arr.length < 3) {
			throw new IllegalArgumentException("No elements in array or not enough elements");
		}

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i - 1] > arr[i] && arr[i] < arr[i + 1]) {
				return i;
			}
		}
		return -1;
	}

	public static int findIndexFstLocalMax(int[] arr) {
		
		if (arr == null || arr.length < 3) {
			throw new IllegalArgumentException("No elements in array or not enough elements");
		}

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
				return i;
			}
		}
		return -1;
	}

	public static int[] reverse(int[] arr) {

		for (int j = 0; j < arr.length / 2; j++) {
			arr[j] = arr[j] ^ arr[arr.length - j - 1];
			arr[arr.length - j - 1] = arr[j] ^ arr[arr.length - j - 1];
			arr[j] = arr[j] ^ arr[arr.length - j - 1];
		}
		return arr;
	}
}
