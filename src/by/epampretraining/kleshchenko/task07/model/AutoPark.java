package by.epampretraining.kleshchenko.task07.model;

import java.util.Arrays;

import by.epampretraining.kleshchenko.task07.util.CarList;

public class AutoPark {

	private CarList cars;
	
	public AutoPark() {
		
	}
	
	public AutoPark(CarList cars) {
		this.cars = cars;
	}

	public CarList getCars() {
		return cars;
	}

	public void setCars(CarList cars) {
		this.cars = cars;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(cars.toArray());
	}
}
