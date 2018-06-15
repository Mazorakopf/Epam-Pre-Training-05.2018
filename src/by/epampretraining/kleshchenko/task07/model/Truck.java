package by.epampretraining.kleshchenko.task07.model;

public class Truck extends Car{

	private double volume;
	
	public Truck() {

	}

	public Truck(long id, String brand, String model, int yearModel, double cost, double tonnage) {
		super(id, brand, model, yearModel, cost);
		this.volume = tonnage;
	}
	
	public Truck(Truck anotherCar) {
		this.volume = anotherCar.volume;
	}

	public double getTonnage() {
		return volume;
	}

	public void setTonnage(double tonnage) {
		this.volume = tonnage;
	}

	public String toString() {
		return "[ " + super.toString() + " " + volume + " ]";
	}
	
}
