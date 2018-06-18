package by.epam.pretraining.kleshchenko.task05;

import java.util.Random;

public class Array {

	public static final int DIDNT_FIND = -1;
	public static final String NULL_REFERENCE = "Couldn't initialize null reference";
	public static final String EMPTY_ARRAY = "No elements in array!!!";

	public static void init(int[] arr, int lowLimit, int upperLimit) {

		isInitialize(arr);

		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(upperLimit - lowLimit) + lowLimit;
		}

	}

	public static int getMax(int[] arr) {

		isInitialize(arr);
		isEmpty(arr);

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static int getMin(int[] arr) {

		isInitialize(arr);
		isEmpty(arr);

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}

	public static double calcAverage(int[] arr) {

		isInitialize(arr);
		isEmpty(arr);

		double sum = 0;

		for (int value : arr) {
			sum += value;
		}
		return sum / arr.length;
	}

	public static double calcGeometricAverage(int[] arr) {

		isInitialize(arr);
		isEmpty(arr);

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
		
		isInitialize(arr);
		isEmpty(arr);

		if (arr.length < 2 || isElemEqual(arr)) {
			res = false;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				res = false;
				break;
			}
		}
		return res;
	}

	public static boolean isDecreasingSequence(int[] arr) {

		boolean res = true;
		
		isInitialize(arr);
		isEmpty(arr);

		if (arr.length < 2 || isElemEqual(arr)) {
			res = false;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i]) {
				res = false;
				break;
			}
		}
		return res;
	}

	public static int findIndexFstLocalMin(int[] arr) {

		isInitialize(arr);
		isEmpty(arr);

		int preLast = arr.length - 1;
		for (int i = 1; i < preLast; i++) {
			if (arr[i - 1] > arr[i] && arr[i] < arr[i + 1]) {
				return i;
			}
		}
		return DIDNT_FIND;
	}

	public static int findIndexFstLocalMax(int[] arr) {

		isInitialize(arr);
		isEmpty(arr);

		int preLast = arr.length - 1;
		for (int i = 1; i < preLast; i++) {
			if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
				return i;
			}
		}
		return DIDNT_FIND;
	}

	public static void reverse(int[] arr) {

		isInitialize(arr);
		isEmpty(arr);

		int center = arr.length / 2;
		for (int i = 0; i < center; i++) {
			arr[i] = arr[i] ^ arr[arr.length - i - 1];
			arr[arr.length - i - 1] = arr[i] ^ arr[arr.length - i - 1];
			arr[i] = arr[i] ^ arr[arr.length - i - 1];
		}
	}

	public static boolean isElemEqual(int[] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i - 1] != arr[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void isInitialize(int[] arr) {

		if (arr == null) {
			throw new IllegalArgumentException(NULL_REFERENCE);
		}
	}

	public static void isEmpty(int[] arr) {

		if (arr.length == 0) {
			throw new IllegalArgumentException(EMPTY_ARRAY);
		}
	}
}
