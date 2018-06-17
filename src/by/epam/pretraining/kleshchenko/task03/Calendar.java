package by.epam.pretraining.kleshchenko.task03;

public class Calendar {

	public static final int JANUARY = 1;
	public static final int FEBRUARY = 2;
	public static final int JULY = 7;
	public static final int DECEMBER = 12;

	public static final int FIRST_DAY_OF_MONTH = 1;

	public static final String DATE_ERROR = "Invalid value";

	public static String nextDay(int day, int month, int year) {

		String date;

		if (isDateCorrect(day, month, year)) {
			if (isLastMonth(month) && isLastDay(day, month, year)) {
				day = FIRST_DAY_OF_MONTH;
				month = JANUARY;
				year++;
			} else if (isLastDay(day, month, year)) {
				day = FIRST_DAY_OF_MONTH;
				month++;
			} else {
				day++;
			}
			date = day + " " + month + " " + year;
		} else {
			date = DATE_ERROR;
		}

		return date;
	}

	public static boolean isDateCorrect(int day, int month, int year) {

		boolean correct = true;
		boolean evenMonth = month % 2 == 0;

		if (year < 0 || day < 1 || day > 31 || month < 1 || month > 12) {
			correct = false;
		} else if ( evenMonth && month <= JULY && day > 30) {
			correct = false;
		} else if ( !evenMonth && month > JULY && day > 30) {
			correct = false;
		} else if ((!isLeapYear(year) && month == FEBRUARY && day > 28)
				|| (isLeapYear(year) && month == FEBRUARY && day > 29)) {
			correct = false;
		}

		return correct;
	}

	public static boolean isLastDay(int day, int month, int year) {

		boolean lastDay = false;
		boolean evenMonth = month % 2 == 0;

		if (isLeapYear(year) && month == FEBRUARY && day == 29) {
			lastDay = true;
		} else if (!isLeapYear(year) && month == FEBRUARY && day == 28) {
			lastDay = true;
		} else if (!evenMonth && month <= JULY && day == 31) {
			lastDay = true;
		} else if (evenMonth && month > JULY && day == 31) {
			lastDay = true;
		} else if (evenMonth && month <= JULY && day == 30) {
			lastDay = true;
		} else if (!evenMonth && month > JULY && day == 30) {
			lastDay = true;
		}

		return lastDay;
	}

	public static boolean isLastMonth(int month) {

		return month == DECEMBER;
	}

	public static boolean isLeapYear(int year) {

		return year % 4 == 0 || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0);
	}

}
