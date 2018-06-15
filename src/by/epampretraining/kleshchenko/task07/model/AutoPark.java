package by.epampretraining.kleshchenko.task07.model;

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
	
	public String toString(Car[] c) {
		if (c == null)
			return "null";
		int iMax = c.length - 1;
		if (iMax == -1)
			return "[]";

		StringBuilder b = new StringBuilder();
		b.append('[');
		for (int i = 0;; i++) {
			b.append(c[i]);
			if (i == iMax)
				return b.append(']').toString();
			b.append(", ");
		}
	}
}
