package by.epampretraining.kleshchenko.task03;

public class EvaluatorOfPoints {

	public static final String NOT_TRINGLE = "not triangle";
	public static final String TRINGLE = "just triangle";
	public static final String TRINGLE_RECTANGULAR = "triangle rectangular";

	public static double calcDistanceBetweenPoints(int x1, int y1, int x2, int y2) {

		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

	}

	public static String checkPoint(int x1, int y1, int x2, int y2, int x3, int y3) {

		String res;

		if (isTriangle(x1, y1, x2, y2, x3, y3)) {
			if (isTriangleRect(x1, y1, x2, y2, x3, y3)) {
				res = TRINGLE_RECTANGULAR;
			} else {
				res = TRINGLE;
			}
		} else {
			res = NOT_TRINGLE;
		}
		return res;
	}

	public static boolean isTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {

		double firstSide = calcDistanceBetweenPoints(x1, y1, x2, y2);
		double secondSide = calcDistanceBetweenPoints(x1, y1, x3, y3);
		double thirdSide = calcDistanceBetweenPoints(x2, y2, x3, y3);

		return firstSide + secondSide > thirdSide && thirdSide > Math.abs(firstSide - secondSide);
	}
	
	public static boolean isTriangleRect(int x1, int y1, int x2, int y2, int x3, int y3) {

		double firstSide = calcDistanceBetweenPoints(x1, y1, x2, y2);
		double secondSide = calcDistanceBetweenPoints(x1, y1, x3, y3);
		double thirdSide = calcDistanceBetweenPoints(x2, y2, x3, y3);

		return firstSide * firstSide + secondSide * secondSide == thirdSide * thirdSide
				|| thirdSide * thirdSide + secondSide * secondSide == firstSide * firstSide
				|| firstSide * firstSide + thirdSide * thirdSide == secondSide * secondSide;
	}
}
