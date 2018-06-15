package by.epampretraining.kleshchenko.task07.model;

public class Car {

	private long id;
	private String brand;
	private String model;
	private int yearModel;
	private double cost;

	public Car() {

	}

	public Car(long id, String brand, String model, int yearModel, double cost) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.yearModel = yearModel;
		this.cost = cost;
	}

	public Car(Car anotherCar) {
		this.id = anotherCar.id;
		this.brand = anotherCar.brand;
		this.model = anotherCar.model;
		this.yearModel = anotherCar.yearModel;
		this.cost = anotherCar.cost;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (id != other.id)
			return false;
		if (!brand.equals(other.brand))
			return false;
		if (!model.equals(other.model))
			return false;
		if (yearModel != other.yearModel)
			return false;
		if (cost != other.cost)
			return false;
		return true;
	}

	public String toString() {
		return id + " " + brand + " " + model + " " + yearModel + " " + cost;
	}
}
