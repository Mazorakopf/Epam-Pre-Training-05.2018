package by.epam.pretraining.kleshchenko.task04;

import java.util.Random;

public class HeadsOrTails {
	
	public static final String ERROR_MESSAGE = "Invalid input";

	public static String countHeads(int numOfFlips) {

		int head = 0;
		Random flipRes = new Random();
		
		if (numOfFlips < 0) {
			throw new IllegalArgumentException(ERROR_MESSAGE);
		}

		for (int i = 0; i < numOfFlips; i++) {
			if (flipRes.nextBoolean() == true) {
				head++;
			} 
		}
		
		return "" + head + " " + (numOfFlips - head);
	}
}
