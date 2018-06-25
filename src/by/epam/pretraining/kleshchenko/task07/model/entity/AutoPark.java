package by.epam.pretraining.kleshchenko.task07.model.entity;

import java.util.Arrays;

import by.epam.pretraining.kleshchenko.task07.util.list.List;

public class AutoPark {

	private String name;
	private List<Car> cars;

	public AutoPark() {
	}

	public AutoPark(String name) {
		this.name = name;
	}
	
	public AutoPark(List<Car> cars) {
		this.cars = cars;
	}
	
	public AutoPark(String name, List<Car> cars) {
		this.name = name;
		this.cars = cars;
	}

	public AutoPark(AutoPark park) {
		this.name = park.getName();
		this.cars = park.getCars();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Car> getCars() {
		return cars;
	}
	
	public Car getCar(int id) {
		return cars.get(id);
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	public void setCar(Car car) {
		cars.add(car);
	}

	@Override
	public String toString() {
		return name + Arrays.toString(cars.toArray());
	}
}
