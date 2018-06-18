package by.epam.pretraining.kleshchenko.task06;

import java.util.Arrays;

public class Test {

	public static void execute(int rowCount, int columnCount, int lowLimit, int upperLimit) {

		double[][] arr = new double[rowCount][columnCount];

		System.out.println("===================================================");
		System.out.printf("Count of row - %d; Count of column - %d\nLow limit - %d; Upper limit - %d\n", rowCount,
				columnCount, lowLimit, upperLimit);
		TwoDimensionalArray.arrayInit(arr, lowLimit, upperLimit);
		System.out.println("Initial matrix");
		System.out.println(TwoDimensionalArray.toString(arr));
		
		try {
			System.out.println("Global maximum extreme: " + TwoDimensionalArray.getMaxValue(arr) + "\n");
			System.out.println("Global minimum extreme: " + TwoDimensionalArray.getMinValue(arr) + "\n");

			System.out.println("Arithmetical mean: " + TwoDimensionalArray.calcAverage(arr) + "\n");
			System.out.println("Geometrical mean: " + TwoDimensionalArray.calcGeometricAverage(arr) + "\n");
			System.out.println("Index local maximum extreme: "
					+ Arrays.toString(TwoDimensionalArray.getIndexFstLocalMax(arr)) + "\n");
			System.out.println("Index local minimum extreme: "
					+ Arrays.toString(TwoDimensionalArray.getIndexFstLocalMax(arr)) + "\n");
			System.out.println("Matrix after transpose");
			System.out.println(TwoDimensionalArray.toString(TwoDimensionalArray.transpose(arr)));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
