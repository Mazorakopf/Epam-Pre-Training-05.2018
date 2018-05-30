package by.epampretraining.kleshchenko.task03;

public class Triangle {
	
	public static double calcDistanceBetweenPoints(int x1, int y1, int x2, int y2) {
		
		return Math.sqrt((x1 + x2) * (x1 + x2) + (y1 + y2) * (y1 + y2));
		
	}

	public static boolean isTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
			
		double firstSide  = calcDistanceBetweenPoints(x1, y1, x2, y2);
		double secondSide = calcDistanceBetweenPoints(x1, y1, x3, y3);
		double thirdSide  = calcDistanceBetweenPoints(x2, y2, x3, y3);
		
		return firstSide + secondSide > thirdSide
				&& thirdSide > Math.abs(firstSide - secondSide);
	}
	
	public static boolean isTriangleRect(int x1, int y1, int x2, int y2, int x3, int y3) {
		
		double firstSide  = calcDistanceBetweenPoints(x1, y1, x2, y2);
		double secondSide = calcDistanceBetweenPoints(x1, y1, x3, y3);
		double thirdSide  = calcDistanceBetweenPoints(x2, y2, x3, y3);
		
		return firstSide * firstSide + secondSide * secondSide == thirdSide * thirdSide
				|| thirdSide * thirdSide + secondSide * secondSide == firstSide * firstSide
				|| firstSide * firstSide + thirdSide * thirdSide == secondSide * secondSide;
	}
	
}
