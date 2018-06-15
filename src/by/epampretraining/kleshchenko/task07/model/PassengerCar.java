package by.epampretraining.kleshchenko.task07.model;

public class PassengerCar extends Car {

	private String bodyType;

	public PassengerCar() {

	}

	public PassengerCar(long id, String brand, String model, int yearModel, double cost, String bodyType) {
		super(id, brand, model, yearModel, cost);
		this.bodyType = bodyType;
	}
	
	public PassengerCar(PassengerCar anotherCar) {
		this.bodyType = anotherCar.bodyType;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	
	public String toString() {
		return "[ " + super.toString() + " " + bodyType + " ]";
	}
}
