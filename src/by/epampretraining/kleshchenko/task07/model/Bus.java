package by.epampretraining.kleshchenko.task07.model;

public class Bus extends Car {

	private int numOfSeats;

	public Bus() {

	}

	public Bus(long id, String brand, String model, int yearModel, double cost, int numOfSeats) {
		super(id, brand, model, yearModel, cost);
		this.numOfSeats = numOfSeats;
	}

	public Bus(Bus anotherBus) {
		this.numOfSeats = anotherBus.numOfSeats;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		if (numOfSeats != other.numOfSeats)
			return false;
		return true;
	}

	public String toString() {
		return "[ " + super.toString() + " " + numOfSeats + " ]";
	}
}
