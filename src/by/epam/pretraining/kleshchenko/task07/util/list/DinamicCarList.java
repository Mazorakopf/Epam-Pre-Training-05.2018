package by.epam.pretraining.kleshchenko.task07.util.list;

import java.util.Arrays;

import by.epam.pretraining.kleshchenko.task07.model.entity.Car;

public class DinamicCarList extends StaticCarList {

	private static final Car[] DEFAULTCAPACITY_EMPTY_CARARRAY = {};

	private Car[] carArray;
	private int size;

	public DinamicCarList() {
		this.carArray = DEFAULTCAPACITY_EMPTY_CARARRAY;
		size = 0;
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
		if (size == carArray.length)
			resize((size + 1) * 2);
		carArray[size++] = e;
		return true;
	}

	@Override
	public boolean addAll(Car[] e) {
		// TODO Auto-generated method stub
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

	private void resize(int newLength) {
		Car[] newArray = new Car[newLength];
		System.arraycopy(carArray, 0, newArray, 0, size);
		carArray = newArray;
	}
}
