package by.epampretraining.kleshchenko.task02;

/**
 * The class {@code Dino} contains constant field that store the weight of the
 * dinosaurs and method <code>{@link #weightConvert(int dino)}<code>.
 * 
 * @author Vladislav Kleshchenko
 */
public class Dino {

	public static final int VELOCIRAPTOR = 20;
	public static final int MEGALOSAURUS = 1100;
	public static final int DIPLODOCUS = 113000;
	public static final int TYRANNOSAURUS = 13000;
	public static final int TRICERATOPS = 9000;

	/**
	 * Prints the weight of dinosaurs in kilograms, grams, milligrams and tons.
	 * 
	 * @param dino		Constant field that is called a dinosaur species and keeps its
	 *           		weight in kilograms.
	 */
	public static void weightConvert(int dino) {

		System.out.printf("Dinasours weight:\nKg = %d\ng = %f\nmg = %f\nt = %f\n",
											dino, dino * 1E3, dino * 1E6, dino / 1E3);

	}

}
