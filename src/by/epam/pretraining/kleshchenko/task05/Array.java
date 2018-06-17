package by.epam.pretraining.kleshchenko.task05;

import java.util.Random;

public class Array {

	public static final int DIDNT_FIND = -1;
	public static final String NULL_REFERENCE = "Couldn't initialize null reference";
	public static final String EMPTY_ARRAY = "No elements in array!!!";

	public static void init(int[] arr, int lowLimit, int upperLimit) {

		isInitialize(arr, NULL_REFERENCE);

		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(upperLimit - lowLimit) + lowLimit;
		}

	}

	public static int globalMaxElement(int[] arr) {

		isInitialize(arr, NULL_REFERENCE);
		isEmpty(arr);

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static int globalMinElement(int[] arr) {

		isInitialize(arr, NULL_REFERENCE);
		isEmpty(arr);

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}

	public static double average(int[] arr) {

		isInitialize(arr, NULL_REFERENCE);

		double sum = 0;

		for (int value : arr) {
			sum += value;
		}
		return sum / arr.length;
	}

	public static double averageGeometric(int[] arr) {

		isInitialize(arr, NULL_REFERENCE);

		double mul = 1;

		for (int value : arr) {
			if (value < 0){
				return 0;
			}
			mul *= value;
		}

		return Math.pow(mul, 1. / arr.length);
	}

	public static boolean isIncreasingSequence(int[] arr) {

		boolean res = true;
		
		isInitialize(arr, NULL_REFERENCE);

		if (arr.length < 2) {
			res = false;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				res = false;
			}
		}
		return res;
	}

	public static boolean isDecreasingSequence(int[] arr) {

		boolean res = true;
		
		isInitialize(arr, NULL_REFERENCE);

		if (arr.length < 2) {
			res = false;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i]) {
				res = false;
			}
		}
		return res;
	}

	public static int findIndexFstLocalMin(int[] arr) {

		isInitialize(arr, NULL_REFERENCE);

		int preLast = arr.length - 1;
		for (int i = 1; i < preLast; i++) {
			if (arr[i - 1] > arr[i] && arr[i] < arr[i + 1]) {
				return i;
			}
		}
		return DIDNT_FIND;
	}

	public static int findIndexFstLocalMax(int[] arr) {

		isInitialize(arr, NULL_REFERENCE);

		int preLast = arr.length - 1;
		for (int i = 1; i < preLast; i++) {
			if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
				return i;
			}
		}
		return DIDNT_FIND;
	}

	public static void reverse(int[] arr) {

		isInitialize(arr, NULL_REFERENCE);

		int center = arr.length / 2;
		for (int i = 0; i < center; i++) {
			arr[i] = arr[i] ^ arr[arr.length - i - 1];
			arr[arr.length - i - 1] = arr[i] ^ arr[arr.length - i - 1];
			arr[i] = arr[i] ^ arr[arr.length - i - 1];
		}
	}

	public static void isInitialize(int[] arr, String error) {

		if (arr == null) {
			throw new IllegalArgumentException(error);
		}
	}

	public static void isEmpty(int[] arr) {

		if (arr.length == 0) {
			throw new IllegalArgumentException(EMPTY_ARRAY);
		}
	}
}
