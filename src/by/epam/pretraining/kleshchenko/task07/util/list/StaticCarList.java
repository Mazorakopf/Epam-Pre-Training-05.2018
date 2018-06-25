package by.epam.pretraining.kleshchenko.task07.util.list;

import java.util.Arrays;

import by.epam.pretraining.kleshchenko.task07.model.entity.Car;

public class StaticCarList implements List<Car>{

	private static final Car[] DEFAULTCAPACITY_EMPTY_CARARRAY = {};

	private Car[] carArray;
	private int maxSize;
	private int size;

	public StaticCarList() {
		this.carArray = DEFAULTCAPACITY_EMPTY_CARARRAY;
		size = 0;
	}

	public StaticCarList(int maxSize) {
		this.carArray = new Car[maxSize];
		this.maxSize = maxSize;
		this.size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(Car car) {
		return indexOf(car) >= 0;
	}

	@Override
	public int indexOf(Car car) {
		if (car == null) {
			for (int i = 0; i < size; i++)
				if (carArray[i] == null)
					return i;
		} else {
			for (int i = 0; i < size; i++)
				if (car.equals(carArray[i]))
					return i;
		}
		return -1;
	}

	public Car[] toArray() {
		return Arrays.copyOf(carArray, size);
	}

	public Car get(int index) {
		rangeCheck(index);

		return carArray[index];
	}

	@Override
	public boolean add(Car e) {
		if (size < maxSize) {
			carArray[size++] = e;
			return true;
		}
		return false;
	}

	@Override
	public boolean addAll(Car[] e) {
		if (maxSize - size >= e.length) {
			for (int i = 0; i < e.length; i++) {
				carArray[size++] = e[i];
			}
			return true;
		}
		return false;
	}

	@Override
	public Car remove(int index) {
		rangeCheck(index);

		Car oldValue = carArray[index];

		int numMoved = size - index - 1;
		if (numMoved > 0)
			System.arraycopy(carArray, index + 1, carArray, index, numMoved);
		carArray[--size] = null;

		return oldValue;
	}

	@Override
	public void clear() {

		for (int i = 0; i < size; i++)
			carArray[i] = null;

		size = 0;
	}

	protected String outOfBoundsMsg(int index) {
		return "Index: " + index + ", Size: " + size;
	}

	protected void rangeCheck(int index) {
		if (index >= size)
			throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
	}
}
