package by.epampretraining.kleshchenko.task04;

import java.util.Random;

public class HeadsOrTails {
	
	public static final String ERROR_MESSAGE = "Invalid input";

	public static int countHeads(int numOfFlips) throws NaturalNumException {

		int head = 0;
		Random flipRes = new Random();
		
		if (numOfFlips < 0) {
			throw new NaturalNumException(ERROR_MESSAGE);
		}

		for (int i = 0; i < numOfFlips; i++) {
			if (flipRes.nextInt(2) == 1) {
				head++;
			} 
		}
		
		return head;
	}
	
	public static int countTails(int numOfFlips) throws NaturalNumException {

		return numOfFlips - countHeads(numOfFlips);
	}
}
