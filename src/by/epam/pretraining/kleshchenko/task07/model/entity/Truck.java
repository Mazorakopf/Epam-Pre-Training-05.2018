package by.epam.pretraining.kleshchenko.task07.model.entity;

public class Truck extends Car {

	private double tonnage;

	public Truck() {

	}

	public Truck(long id, String brand, String model, int yearModel, double cost, double tonnage) {
		super(id, brand, model, yearModel, cost);
		this.tonnage = tonnage;
	}
	
	public Truck(Car anotherCar, double tonnage) {
		super(anotherCar);
		this.tonnage = tonnage;
	}

	public Truck(Truck anotherCar) {
		this.tonnage = anotherCar.tonnage;
	}

	public double getTonnage() {
		return tonnage;
	}

	public void setTonnage(double tonnage) {
		this.tonnage = tonnage;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Truck other = (Truck) obj;
		if (tonnage != other.tonnage)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) tonnage;
		return result;
	}

	@Override
	public String toString() {
		return "[ " + super.toString() + " " + tonnage + " ]";
	}

}
