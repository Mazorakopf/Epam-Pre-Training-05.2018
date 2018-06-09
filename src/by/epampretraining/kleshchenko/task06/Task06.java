package by.epampretraining.kleshchenko.task06;

import java.util.Arrays;

public class Task06 {

	public static void main(String[] args) {
		
		double[][] arr = new double[3][4];
		
		TwoDimensionalArray.arrayInit(arr, 1.2, 10.8);
		System.out.println("Initial matrix");
		System.out.println(TwoDimensionalArray.toString(arr));
		System.out.println("Global maximum extreme: " + TwoDimensionalArray.getMaxValue(arr) + "\n");
		System.out.println("Global minimum extreme: " + TwoDimensionalArray.getMinValue(arr)+ "\n");
		System.out.println("Arithmetical mean: " + TwoDimensionalArray.average(arr)+ "\n");
		System.out.println("Geometrical mean: " + TwoDimensionalArray.averageGeometric(arr)+ "\n");
		System.out.println("Index local maximum extreme: " + Arrays.toString(TwoDimensionalArray.indexFstLocalMax(arr))+ "\n");
		System.out.println("Index local minimum extreme: " + Arrays.toString(TwoDimensionalArray.indexFstLocalMin(arr))+ "\n");
		System.out.println("Matrix after transpose");
		System.out.println(TwoDimensionalArray.toString(TwoDimensionalArray.transpose(arr)));
	}

}
