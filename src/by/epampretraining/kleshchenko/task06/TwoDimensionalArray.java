package by.epampretraining.kleshchenko.task06;

import java.util.Random;

public class TwoDimensionalArray {

	public static double[][] arrayInit(double[][] arr, double low, double high) {
		
		if (arr == null) {
			throw new IllegalArgumentException("Couldn't initialize null reference.");
		}

		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = random.nextDouble() * (high - low) + low;
			}
		}
		return arr;
	}

	public static String toString(double[][] arr) {
		if (arr == null)
			return "null";

		int iMax = arr.length - 1;
		if (iMax == -1)
			return "[]";

		StringBuilder b = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				b.append(String.valueOf(arr[i][j]));
				b.append("   ");

			}
			b.append('\n');
		}
		return b.toString();
	}

	public static double getMaxValue(double[][] arr) {
		
		checkArray(arr);

		double max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	public static double getMinValue(double[][] arr) {
		
		checkArray(arr);

		double min = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}

	public static double average(double[][] arr) {
		
		checkArray(arr);

		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum / (arr.length * arr[0].length);
	}

	public static double averageGeometric(double[][] arr) {
		
		checkArray(arr);

		double mul = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				mul *= arr[i][j];
			}
		}
		return Math.pow(mul, 1. / (arr.length * arr[0].length));
	}
	
	public static int[] indexFstLocalMax(double[][] arr) {
		
		checkArray(arr);

		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j < arr[i].length - 1; j++) {
				if (arr[i][j] > arr[i - 1][j]  && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i + 1][j]
						&& arr[i][j] > arr[i][j + 1]) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}
	
	public static int[] indexFstLocalMin(double[][] arr) {
		
		checkArray(arr);

		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j < arr[i].length - 1; j++) {
				if (arr[i][j] < arr[i - 1][j]  && arr[i][j] < arr[i][j - 1] && arr[i][j] < arr[i + 1][j]
						&& arr[i][j] < arr[i][j + 1]) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}


	public static double[][] transpose(double[][] arr) {
		
		checkArray(arr);

		if (arr.length == arr[0].length) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i; j < arr[i].length; j++) {
					if (i != j) {
						arr[i][j] = arr[i][j] + arr[j][i] - (arr[j][i] = arr[i][j]);
					}
				}
			}
		} else {
			double[][] newArr = new double[arr[0].length][arr.length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					newArr[j][i] = arr[i][j];
				}
			}
			return newArr;
		}
		return arr;
	}
	
	public static void checkArray(double[][] arr) {
		if (arr == null || arr.length == 0 || arr[0].length == 0) {
			throw new IllegalArgumentException("No elements in the array!");
		}
}
}
