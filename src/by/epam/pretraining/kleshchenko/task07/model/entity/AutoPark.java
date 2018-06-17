package by.epam.pretraining.kleshchenko.task07.model.entity;

import java.util.Arrays;

import by.epam.pretraining.kleshchenko.task07.util.CarList;

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
