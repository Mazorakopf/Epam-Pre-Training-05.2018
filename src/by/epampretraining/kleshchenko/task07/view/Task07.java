package by.epampretraining.kleshchenko.task07.view;


import by.epampretraining.kleshchenko.task07.controller.filters.CostFilter;
import by.epampretraining.kleshchenko.task07.model.*;
import by.epampretraining.kleshchenko.task07.util.CarList;

public class Task07 {

	public static void main(String[] args) {
		
		CarList list = new CarList();

		list.add(new PassengerCar(1, "Volkswagen", "b6", 2008, 8400.0, "Passat"));
		list.add(new Truck(2, "Mercedes-Benz", "Actros 2541", 2009, 74540.0, 15000.0));
		list.add(new Bus(3, "МАЗ", "104с", 2002, 9900.0, 40));
		list.add(new PassengerCar(4, "Volkswagen", "CC", 2014, 23500.0, "Passat"));
		list.add(new PassengerCar(5, "Audi", "A6 C6 Avant", 2010, 12350.0, "Universal"));
		list.add(new PassengerCar(6, "Aston Martin", "DB9", 2005, 45000.0, "Coupe"));
		list.add(new Bus(7, "Mercedes-Benz", "Sprinter 515", 2009, 12900.0, 19));
		list.add(new Truck(8, "HOWO", "6x4", 2005, 35450.0, 25000.0));
		list.add(new Truck(9, "MAN", "19322", 2000, 9900.0, 1000.0));
		list.add(new Bus(10, "Volkswagen", "Crafter 35", 2010, 23900, 15));
		list.add(new PassengerCar(11, "Ford", "Kuga II", 2013, 16400.0, "Suv"));
		
		AutoPark park = new AutoPark();
		park.setCars(list);
		
		Bus bus = new Bus(3, "МАЗ", "104с", 2002, 9900.0, 40);

		System.out.println("Size of initial car list: " + park.getCars().number() + "\n");
		System.out.println("Get the first car in the autopark " + park.getCars().get(0) + "\n");
		list.remove(0);
		System.out.println("Get the first car after remove in the autopark " + park.getCars().get(0) + "\n");
		System.out.println("Current size of autopark: " + park.getCars().number() + "\n");
		System.out.println("Autopark contain this bus? " + park.getCars().contains(bus) + "\n");
		System.out.println("Show current list of autopark:\n" + park.getCars().toString() + "\n");
		
		System.out.println("The total cost of the autopark: " + CostFilter.costOfTheAutoPark(park.getCars().toArray()) + "$\n");
		System.out.println("The cheapest car in the autopark " + CostFilter.theCheapestCar(park.getCars().toArray()) + "\n");
		System.out.println("The most expensive car in the autopark " + CostFilter.theMostExpensiveCar(park.getCars().toArray()) + "\n");
		
		System.out.println("This bus equals the second car in the autopark? " + bus.equals(park.getCars().get(1)) + "\n");
		
		list.clear();
		System.out.println("Size of the autopark: " + park.getCars().number() + "\n");
		System.out.println("The autopark is empty? " + park.getCars().isEmpty() + "\n");
		System.out.println("Autopark contain this bus? " + park.getCars().contains(bus) + "\n");
		
	}

}
