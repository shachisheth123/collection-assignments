package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.Car;

public class CarTest {

	private static Car toyotaCar;
	private static Car hyundayiCar;
	private static Car marutiCar;
	private static Car marutiCars;

	@BeforeClass
	public static void setUp() {
		toyotaCar = new Car("Toyota", "top", 2018, 80000);
		hyundayiCar = new Car("hyundayi", "middle-level", 2019, 100000);
		marutiCar = new Car("suzuki", "top", 2019, 50000);
		marutiCars = new Car("suzuki", "top", 2019, 50000);
	}

	@Test
	public void testCarWithTreeSet() {

		TreeSet<Car> car = new TreeSet<>();
		car.add(toyotaCar);
		car.add(hyundayiCar);
		car.add(marutiCar);

		car.add(marutiCars);

		assertEquals(0, marutiCar.getMake().compareTo(marutiCars.getMake()));
		assertEquals(-20, toyotaCar.getMake().compareTo(hyundayiCar.getMake()));
		assertEquals(11, marutiCar.getMake().compareTo(hyundayiCar.getMake()));
		
		assertEquals(3, car.size());

	}

}
