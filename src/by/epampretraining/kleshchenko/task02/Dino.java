package by.epampretraining.kleshchenko.task02;

/**
 * The class {@code Dino} contains constant field that store the weight of the
 * dinosaurs and method for convert weight.
 * 
 * @author Vladislav Kleshchenko
 */
public class Dino {

	//Weight of dinosaurs in kilograms.
	public static final int VELOCIRAPTOR = 20;
	public static final int MEGALOSAURUS = 1100;
	public static final int DIPLODOCUS = 113000;
	public static final int TYRANNOSAURUS = 13000;
	public static final int TRICERATOPS = 9000;

	/**
	 * @param dino		Constant field that is called a dinosaur species and keeps its
	 *           		weight in kilograms.
	 * @retun 			The weight of dinosaurs in kilograms.
	 */
	public static double showWeight(int dino) {

		return dino;
	}
	
	/**
	 * @param dino		Constant field that is called a dinosaur species and keeps its
	 *           		weight in kilograms.
	 * @retun 			The weight of dinosaurs in grams.
	 */
	public static double сonvertToGram(int dino) {

		return dino * 1E3;
	}
	
	/**
	 * @param dino		Constant field that is called a dinosaur species and keeps its
	 *           		weight in kilograms.
	 * @retun 			The weight of dinosaurs in Miligram.
	 */
	public static double сonvertToMiliGram(int dino) {

		return dino * 1E6;
	}
	
	/**
	 * @param dino		Constant field that is called a dinosaur species and keeps its
	 *           		weight in kilograms.
	 * @return 			The weight of dinosaurs in tone.
	 */
	public static double сonvertToTone(int dino) {

		return dino / 1E3;
	}

}
