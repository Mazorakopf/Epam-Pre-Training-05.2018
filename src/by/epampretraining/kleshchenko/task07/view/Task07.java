package by.epampretraining.kleshchenko.task07.view;


import by.epampretraining.kleshchenko.task07.controller.filters.CostFilter;
import by.epampretraining.kleshchenko.task07.model.*;
import by.epampretraining.kleshchenko.task07.util.CarList;

public class Task07 {

	public static void main(String[] args) {
		
	
		CarList list = new CarList();
		System.out.println(list.size());

		Bus bus = new Bus(3, "МАЗ", "104с", 2002, 9900.0, 40);
		
		list.add(new PassengerCar(1, "Volkswagen", "b6", 2008, 8400.0, "Passat"));
		list.add(new Truck(2, "Mercedes-Benz", "Actros 2541", 2009, 74540.0, 15000.0));
		list.add(new Bus(3, "МАЗ", "104с", 2002, 9900.0, 40));
		list.add(new PassengerCar(4, "Volkswagen", "CC", 2014, 23500.0, "Passat"));
		list.add(new PassengerCar(5, "Audi", "A6 C6 Avant", 2010, 12350.0,"Universal"));
		list.add(new PassengerCar(6,"Aston Martin", "DB9", 2005, 45000.0, "Coupe"));
		list.add(new Bus(7, "Mercedes-Benz", "Sprinter 515", 2009, 12900.0, 19));
		list.add(new Truck(8, "HOWO", "6x4", 2005, 35450.0, 25000.0));
		list.add(new Truck(9, "MAN", "19322", 2000, 9900.0, 1000.0));
		list.add(new Bus(10, "Volkswagen", "Crafter 35", 2010, 23900, 15));
		list.add(new PassengerCar(11, "Ford", "Kuga II", 2013, 16400.0, "Suv"));
		System.out.println(list.size());
		System.out.println(list.get(0));
		list.remove(0);
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.contains(bus));
		AutoPark park = new AutoPark(list);
		System.out.println(park.toString(list.toArray()));
		
		System.out.println(CostFilter.costOfTheAutoPark(list.toArray()));
		System.out.println(CostFilter.theCheapestCar(list.toArray()));
		System.out.println(CostFilter.theMostExpensiveCar(list.toArray()));
		
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.contains(bus));
	}

}
