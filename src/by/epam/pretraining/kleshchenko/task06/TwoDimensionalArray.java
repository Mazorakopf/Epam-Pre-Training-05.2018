package by.epam.pretraining.kleshchenko.task06;

import java.util.Random;

public class TwoDimensionalArray {
	
	public static final String NULL_REFERENCE = "Couldn't initialize null reference.";
	public static final String EMPTY_ARRAY = "No elements in the array!!!";
	
	public static void arrayInit(double[][] arr, double lowLimit, double upperLimit) {

		isInitialize(arr);

		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = random.nextDouble() * (upperLimit - lowLimit) + lowLimit;
			}
		}
	}

	public static String toString(double[][] arr) {
		
		if (arr == null)
			return "null";

		int iMax = arr.length - 1;
		if (iMax == -1) {
			return "[]";
		}
		
		StringBuilder b = new StringBuilder();
		
		int jMax = arr[0].length - 1;
		if (jMax == -1) {
			b.append("[");
			for (int i = 0; i < arr.length; i++) {
				b = i != arr.length - 1 ? b.append("[],") : b.append("[]");
			}
			b.append("]");
		} else {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					b.append(String.valueOf(arr[i][j]));
					b.append("   ");

				}
				b.append('\n');
			}
		}
		return b.toString();
	}

	public static double getMaxValue(double[][] arr) {

		isInitialize(arr);
		isEmpty(arr);

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

		isInitialize(arr);
		isEmpty(arr);

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

	public static double calcAverage(double[][] arr) {

		isInitialize(arr);
		isEmpty(arr);

		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum / (arr.length * arr[0].length);
	}

	public static double calcGeometricAverage(double[][] arr) {

		isInitialize(arr);
		isEmpty(arr);

		double mul = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (mul < 0) {
					mul = 0;
				}
				mul *= arr[i][j];
			}
		}
		return Math.pow(mul, 1. / (arr.length * arr[0].length));
	}

	public static int[] getIndexFstLocalMax(double[][] arr) {

		isInitialize(arr);
		isEmpty(arr);

		int column = arr.length - 1;
		for (int i = 1; i < column; i++) {
			int row = arr[i].length - 1;
			for (int j = 1; j < row; j++) {

				if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i][j - 1]
						&& arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j + 1]) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	public static int[] getIndexFstLocalMin(double[][] arr) {

		isInitialize(arr);
		isEmpty(arr);

		int column = arr.length - 1;
		for (int i = 1; i < column; i++) {
			int row = arr[i].length - 1;
			for (int j = 1; j < row; j++) {
				
				if (arr[i][j] < arr[i][j + 1] && arr[i][j] < arr[i][j - 1]
						&& arr[i][j] < arr[i + 1][j] && arr[i][j] < arr[i - 1][j]) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	public static double[][] transpose(double[][] arr) {

		isInitialize(arr);
		isEmpty(arr);

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

	private static void isInitialize(double[][] arr) {
		if (arr == null) {
			throw new NullPointerException(NULL_REFERENCE);
		}
	}
	
	private static void isEmpty(double[][] arr) {
		if (arr.length == 0 || arr[0].length == 0) {
			throw new IllegalArgumentException(EMPTY_ARRAY);
		}
	}
}
