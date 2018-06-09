package by.epampretraining.kleshchenko.task06;

import java.util.Arrays;

public class Task06 {

	public static void main(String[] args) {
		
		double[][] arr = new double[4][4];
		
		TwoDimensionalArray.arrayInit(arr, 1.2, 10.8);
		System.out.println(TwoDimensionalArray.toString(arr));
		System.out.println(TwoDimensionalArray.getMaxValue(arr));
		System.out.println(TwoDimensionalArray.getMinValue(arr));
		System.out.println(TwoDimensionalArray.average(arr));
		System.out.println(TwoDimensionalArray.averageGeometric(arr));
		System.out.println(Arrays.toString(TwoDimensionalArray.indexFstLocalMax(arr)));
		System.out.println(Arrays.toString(TwoDimensionalArray.indexFstLocalMin(arr)));
		System.out.println();
		System.out.println(TwoDimensionalArray.toString(TwoDimensionalArray.transpose(arr)));
	}

}
