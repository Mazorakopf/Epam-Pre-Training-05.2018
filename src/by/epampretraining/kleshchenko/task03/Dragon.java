package by.epampretraining.kleshchenko.task03;

public class Dragon {

	public static final int YOUTH_BORDER = 300;
	public static final int CHILD_BORDER = 200;
	public static final int HEADS_IN_CHILD = 3;
	public static final int HEADS_IN_YOUTH = 2;
	public static final int HEADS_IN_OLD = 1;
	public static final int INIT_HEADS = 1;

	public static final int INPUT_ERROR = -1;

	public static int checkNumOfHeads(int age) {

		int numOfHead = INIT_HEADS;

		if (age < 0) {
			numOfHead = INPUT_ERROR;
		} else if (age > YOUTH_BORDER) {
			numOfHead += (age - YOUTH_BORDER) * HEADS_IN_OLD
						+ (YOUTH_BORDER - CHILD_BORDER) * HEADS_IN_YOUTH
											+ CHILD_BORDER * HEADS_IN_CHILD;
		} else if (age > CHILD_BORDER) {
			numOfHead += (age - CHILD_BORDER) * HEADS_IN_YOUTH
								+ CHILD_BORDER * HEADS_IN_CHILD;
		} else {
			numOfHead += age * HEADS_IN_CHILD;
		}

		return numOfHead;
	}

	public static int checkNumOfEyes(int age) {

		int numOfEyes;

		if (age < 0) {
			numOfEyes = INPUT_ERROR;
		} else {
			numOfEyes = checkNumOfHeads(age) * 2;
		}

		return numOfEyes;
	}

}
