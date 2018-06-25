package by.epam.pretraining.kleshchenko.task07.util.creator;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import by.epam.pretraining.kleshchenko.task07.model.entity.Car;
import by.epam.pretraining.kleshchenko.task07.model.entity.PassengerCar;
import by.epam.pretraining.kleshchenko.task07.model.entity.AutoPark;
import by.epam.pretraining.kleshchenko.task07.model.entity.Bus;
import by.epam.pretraining.kleshchenko.task07.model.entity.Truck;

public class Creator {

	public static final String[] BRAND = { "Volkswagen", "Audi", "Aston Martin", "Ford", "Mercedes-Benz", "МАЗ", "HOWO",
			"MAN" };
	public static final String MODELC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String MODELN = "123456789";
	public static final String[] BODY_TYPE = {"PASSAT", "UNIVERSAL", "Sedan", "Minivan", "Сabriolet"};
	private static long id = 1;

	public static final int MIN_COST_FOR_PASS_CAR = 4000;
	public static final int MAX_COST_FOR_PASS_CAR = 15000;
	public static final int MIN_COST_FOR_MINIBUS = 6000;
	public static final int MAX_COST_FOR_MINIBUS = 20000;
	public static final int MIN_NUM_OF_SEATS = 6000;
	public static final int MAX_NUM_OF_SEATS = 20000;

	public static void createAutoPark(AutoPark park, int num) {
		Random random = new Random();
		
		for (int i = 0; i < num; i++) {
			switch(random.nextInt(3)) {
			case 0: park.setCar(createBus()); break;
			case 1: park.setCar(createTruck()); break;
			default: park.setCar(createPassengerCar()); break;
			}
		}
	}
	
	private static Car createCar() {

		Random random = new Random();

		GregorianCalendar calendar = new GregorianCalendar();

		String brand = BRAND[random.nextInt(BRAND.length - 1)];
		String model = "";
		for (int i = 0; i < random.nextInt(3) + 1; i++) {
			model += MODELC.charAt(random.nextInt(MODELC.length() - 1));
		}
		for (int i = 0; i < random.nextInt(2) + 1; i++) {
			model += MODELN.charAt(random.nextInt(MODELN.length() - 1));
		}
		int yearModel = random.nextInt(calendar.get(Calendar.YEAR) - 1990) + 1990;
		double cost = random.nextInt(MAX_COST_FOR_MINIBUS - MIN_COST_FOR_PASS_CAR) + MIN_COST_FOR_PASS_CAR;

		return new Car(id++, brand, model, yearModel, cost);
	}
	
	public static PassengerCar createPassengerCar() {

		Random random = new Random();
		
		Car car = new Car();
		car = createCar();	
		String body = BODY_TYPE[random.nextInt(BODY_TYPE.length - 1)];	
		
		return new PassengerCar(car, body);
	}
	
	public static Bus createBus() {

		Random random = new Random();
		
		Car car = new Car();
		car = createCar();
		int numOfSeats = random.nextInt(MAX_NUM_OF_SEATS - MIN_NUM_OF_SEATS) + MIN_NUM_OF_SEATS;	
		
		return new Bus(car, numOfSeats);
	}
	
	public static Truck createTruck() {

		Random random = new Random();
		
		Car car = new Car();
		car = createCar();
		double tonnage = random.nextDouble() * 20 + 15;	
		
		return new Truck(car, tonnage);
	}
	
}
