package by.epampretraining.kleshchenko.task02;

/**
 * The class {@code MyMath} contains some mathematical methods for determining the area of
 * a ring {@link #sqAreaRing(int, int)}, the arithmetic mean  <code>{@link #aMean(int)}<code> 
 * and the geometric mean  <code>{@link #gMean(int)}<code>.
 * 
 * @author Vladislav Kleshchenko
 */
public class MyMath {
	
	/**
	 * Special case:
     * <ul><li>If the argument r1 smaller than argument r2, then the result
     * is negative.
	 * 
	 * @param r1	The radius of the biggest ring.
	 * @param r2	The radius of the smaller ring.
	 * @return		The square area of a ring;
	 */
	public static double sqAreaRing(int r1, int r2) {

		return Math.PI * r1 * r1 - Math.PI * r2 * r2;

	}
	
	/**
	 * The method gets a six-digit number, splits it into digit 
	 * and calculates their arithmetic mean.	Special cases:
     * <ul><li>If the argument is greater than a six-digit number, then 
     * the result will be the last five numbers and the number that remains in a head.
     * <ul><li>If the argument is less than a six-digit number, then 
     * the result will be wrong. 
     *  
	 * @param num	The six-digit number. 
	 * @return		The arithmetic mean.
	 */
	public static double aMean(int num) {

		NumToDigits digit = new NumToDigits(num, NumToDigits.SIX_DIGIT);
		int numOfdigit = 6;

		return (digit.getThFst() + digit.getThSnd() + digit.getThTrd()
				+ digit.getThFrth() + digit.getThFfth() + digit.getThSxth()) / numOfdigit;

	}
	
	/**
	 * The method gets a six-digit number, splits it into digit 
	 * and calculates their geometric mean.	Special cases:
     * <ul><li>If the argument is greater than a six-digit number, then 
     * the result will be the last five numbers and the number that remains in a head. 
     * <ul><li>If the argument is less than a six-digit number, then 
     * the result will be zero. 
     *  
	 * @param num	The six-digit number. 
	 * @return		The geometric mean.
	 */
	public static double gMean(int num) {
		
		NumToDigits digit = new NumToDigits(num, NumToDigits.SIX_DIGIT);
		int numOfdigit = 6;
		
		return Math.pow(digit.getThFst() * digit.getThSnd() * digit.getThTrd()
						* digit.getThFrth() * digit.getThFfth() * digit.getThSxth(),
																		1. / numOfdigit);
	}

}
