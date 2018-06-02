package by.epampretraining.kleshchenko.task04;

import java.util.Random;

public class HeadsOrTails {

	public static String flipTheCoin(int numOfFlips) {

		int head = 0;
		int tail = 0;
		Random flipRes = new Random();

		for (int i = 0; i < numOfFlips; i++) {
			if (flipRes.nextInt(2) == 1) {
				head++;
			} else {
				tail++;
			}
		}
		return "" + head + " " + tail;
	}
}
