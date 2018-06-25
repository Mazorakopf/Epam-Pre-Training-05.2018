package by.epam.pretraining.kleshchenko.task07.tests;

import java.util.Arrays;

import by.epam.pretraining.kleshchenko.task07.model.entity.AutoPark;
import by.epam.pretraining.kleshchenko.task07.model.entity.Car;
import by.epam.pretraining.kleshchenko.task07.model.logic.filters.CostFilter;
import by.epam.pretraining.kleshchenko.task07.util.creator.Creator;
import by.epam.pretraining.kleshchenko.task07.util.list.DinamicCarList;
import by.epam.pretraining.kleshchenko.task07.util.list.StaticCarList;
import by.epam.pretraining.kleshchenko.task07.view.View;

public class Test {

	public static void testsStaticList() {

		AutoPark park = new AutoPark("SuperCar", new StaticCarList(10));

		Creator.createAutoPark(park, 8);

		View.print("===============================================================");
		
		View.print("List of park:\n" + park.toString() + "\n");
		View.print("Size of initial car list: " + park.getCars().size() + "\n");
		View.print("Get the first car in the autopark " + park.getCar(0) + "\n");
		park.getCars().remove(0);
		View.print("Get the first car after remove in the autopark " + park.getCar(0) + "\n");
		View.print("Current size of autopark: " + park.getCars().size() + "\n");
		Car car = park.getCar(6);
		View.print("Autopark contain this bus? " + park.getCars().contains(car) + "\n");
		park.setCar(Creator.createPassengerCar());
		park.setCar(Creator.createPassengerCar());
		park.setCar(Creator.createTruck());
		View.print("Show current list of autopark:\n" + park.toString() + "\n");
		park.getCars().clear();
		View.print("Size of the autopark: " + park.getCars().size() + "\n");
		View.print("The autopark is empty? " + park.getCars().isEmpty() + "\n");
		View.print("Autopark contain this bus? " + park.getCars().contains(car) + "\n");
	}
	
	public static void testsDinamicList() {

		DinamicCarList list =  new DinamicCarList();
		AutoPark park = new AutoPark("Star Car", list);

		Creator.createAutoPark(park, 3);

		View.print("===============================================================");
		
		View.print(list.add(Creator.createBus()));
		View.print(Arrays.toString(list.toArray()));
		View.print(list.isEmpty());
		
		View.print("List of park:\n" + park.toString() + "\n");
		View.print("Size of initial car list: " + park.getCars().size() + "\n");
		View.print("Get the first car in the autopark " + park.getCar(0) + "\n");
		park.getCars().remove(0);
		View.print("Get the first car after remove in the autopark " + park.getCar(0) + "\n");
		View.print("Current size of autopark: " + park.getCars().size() + "\n");
		Car car = park.getCar(2);
		View.print("Autopark contain this bus? " + park.getCars().contains(car) + "\n");
		park.setCar(Creator.createPassengerCar());
		park.setCar(Creator.createPassengerCar());
		park.setCar(Creator.createTruck());
		View.print("Show current list of autopark:\n" + park.toString() + "\n");
		park.getCars().clear();
		View.print("Size of the autopark: " + park.getCars().size() + "\n");
		View.print("The autopark is empty? " + park.getCars().isEmpty() + "\n");
		View.print("Autopark contain this bus? " + park.getCars().contains(car) + "\n");
	}

	public static void testsLogic() {
		
		AutoPark park = new AutoPark("Cheapest Car", new StaticCarList(10));

		Creator.createAutoPark(park, 8);
		
		View.print("===============================================================");
		
		View.print("The total cost of the autopark: " + CostFilter.costOfTheAutoPark(park.getCars().toArray()) + "$\n");
		View.print("The cheapest car in the autopark " + CostFilter.theCheapestCar(park.getCars().toArray()) + "\n");
		View.print("The most expensive car in the autopark " + CostFilter.theMostExpensiveCar(park.getCars().toArray())
				+ "\n");
	}
}
