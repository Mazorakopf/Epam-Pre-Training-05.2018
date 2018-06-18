package by.epam.pretraining.kleshchenko.task05;

public class Task05 {

	public static void main(String[] args) {

		Test.execute(15, 1, 25);
		Test.execute(15, -25, 25);
		int[] arr = new int[] {1,2,3,4,5,6,7,8,8,10};
		Test.execute(arr);
		Test.execute(5, 0, 0);
		Test.execute(0, 0, 0);
	}
}
