package by.epam.pretraining.kleshchenko.task07.model.logic.filters;

import by.epam.pretraining.kleshchenko.task07.model.entity.Car;

public class CostFilter {

	public static double costOfTheAutoPark(Car[] car) {
		
		double cost = 0;
		
		for(int i = 0; i < car.length; i++) {
			cost += car[i].getCost();
		}
		
		return cost;
	}
	
	public static Car theCheapestCar(Car[] car) {
		
		double cheapest = car[0].getCost();
		Car cheapestCar = car[0];
		
		for(int i = 1; i < car.length; i++) {
			if(car[i].getCost() < cheapest) {
				cheapest = car[i].getCost();
				cheapestCar = car[i];
			}
		}
		return cheapestCar;	
	}
	
	public static Car theMostExpensiveCar(Car[] car) {
		
		double expensive = car[0].getCost();
		Car mostExpensiveCar = car[0];
		
		for(int i = 1; i < car.length; i++) {
			if(car[i].getCost() > expensive) {
				expensive = car[i].getCost();
				mostExpensiveCar = car[i];
			}
		}
		return mostExpensiveCar;	
	}
}
