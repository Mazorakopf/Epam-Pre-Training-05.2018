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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		PassengerCar other = (PassengerCar) obj;
		if (bodyType != other.bodyType)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bodyType == null) ? 0 : bodyType.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "[ " + super.toString() + " " + bodyType + " ]";
	}
}
