package by.epam.pretraining.kleshchenko.task03;

import java.util.Random;

public class MoodSensor {
	
	public static final String SMILE = ":)";
	public static final String SAD = ":(";
	public static final String SURPRISED = "o_0";
	public static final String PLAYFUL = ";)";
	public static final String FUNNY = ":D";
	
	public static final int NUMBER_FOR_FUNNY = 0;
    public static final int NUMBER_FOR_SMILE = 1;
    public static final int NUMBER_FOR_SAD = 2;
    public static final int NUMBER_FOR_SURPRISED = 3;
    public static final int NUMBER_FOR_PLAYFUL = 4;
 
	public static String scanningSoul() {
		
		String mood = null;
		int rundomNum = new Random().nextInt(5);
		
		if  (rundomNum == NUMBER_FOR_SMILE) {
			mood = SMILE;
		} else if (rundomNum == NUMBER_FOR_SAD) {
			mood = SAD;
		}else if (rundomNum == NUMBER_FOR_SURPRISED) {
			mood = SURPRISED;
		}else if (rundomNum == NUMBER_FOR_PLAYFUL) {
			mood = PLAYFUL;
		} else if (rundomNum == NUMBER_FOR_FUNNY) {
			mood = FUNNY;
		}
		
		return mood;
	}
}
