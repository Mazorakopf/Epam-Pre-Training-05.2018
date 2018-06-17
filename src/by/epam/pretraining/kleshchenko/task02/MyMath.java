package by.epam.pretraining.kleshchenko.task02;

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

		return  sqCircle(r1) - sqCircle(r2);

	}
	
	public static double sqCircle(int r) {
		
		return Math.PI * r * r;
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

		int thSxth = num % 10;
		int thFfth = num / 10 % 10;
		int thFrth = num / 100 % 10;
		int thTrd  = num / 1000 % 10;
		int thSnd  = num / 10000 % 10;
		int thFst  = num / 100000;
		int numOfdigit = 6;

		return (thFst + thSnd + thTrd + thFrth + thFfth + thSxth) / numOfdigit;

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
		
		int thSxth = num % 10;
		int thFfth = num / 10 % 10;
		int thFrth = num / 100 % 10;
		int thTrd  = num / 1000 % 10;
		int thSnd  = num / 10000 % 10;
		int thFst  = num / 100000;
		int numOfdigit = 6;
		
		return Math.pow(thFst * thSnd * thTrd * thFrth * thFfth * thSxth, 1. / numOfdigit);
	}

}
