package by.epampretraining.kleshchenko.task05;

import java.util.Random;

public class Array {

	public static final int DIDNT_FIND = -1;

	public static void init(int[] arr, int low, int high) {
		
		if (arr == null) {
			throw new IllegalArgumentException("Couldn't initialize null reference.");
		}

		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(high - low) + low;
		}

	}

	public static int globalMaxElement(int[] arr) {

		if (arr == null) {
			throw new IllegalArgumentException("No elements in array");
		}

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static int globalMinElement(int[] arr) {

		if (arr == null) {
			throw new IllegalArgumentException("No elements in array");
		}

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
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

		int preLast = arr.length - 1;
		for (int i = 1; i < preLast; i++) {
			if (arr[i - 1] > arr[i] && arr[i] < arr[i + 1]) {
				return i;
			}
		}
		return DIDNT_FIND;
	}

	public static int findIndexFstLocalMax(int[] arr) {

		if (arr == null || arr.length < 3) {
			throw new IllegalArgumentException("No elements in array or not enough elements");
		}

		int preLast = arr.length - 1;
		for (int i = 1; i < preLast; i++) {
			if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
				return i;
			}
		}
		return DIDNT_FIND;
	}

	public static void reverse(int[] arr) {

		int center = arr.length / 2;
		for (int i = 0; i < center; i++) {
			arr[i] = arr[i] ^ arr[arr.length - i - 1];
			arr[arr.length - i - 1] = arr[i] ^ arr[arr.length - i - 1];
			arr[i] = arr[i] ^ arr[arr.length - i - 1];
		}
	}
}
