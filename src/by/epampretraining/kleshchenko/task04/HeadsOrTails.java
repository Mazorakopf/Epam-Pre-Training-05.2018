package by.epampretraining.kleshchenko.task04;

import java.util.Random;

public class HeadsOrTails {

	public static int countHeads(int numOfFlips) {

		int head = 0;
		Random flipRes = new Random();

		for (int i = 0; i < numOfFlips; i++) {
			if (flipRes.nextInt(2) == 1) {
				head++;
			} 
		}
		
		return head;
	}
	
	public static int countTails(int numOfFlips) {

		return numOfFlips - countHeads(numOfFlips);
	}
}
