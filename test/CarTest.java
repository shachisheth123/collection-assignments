package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.Car;
import com.capgemini.model.Laptop;

public class CarTest {

	private static Car toyotaCar;
	private static Car hyundayiCar;
	private static Car marutiCar;
	private static Car marutiCars;
	
	@BeforeClass
	public static void setUp()
	{
		toyotaCar=new Car("Toyota" , "top" , 2018 , 80000 );
		hyundayiCar=new Car("hyundayi", "middle-level", 2019, 100000);
		marutiCar=new Car("suzuki" , "top" ,2019 , 50000 );
		marutiCars=new Car("suzuki" , "top" ,2019 , 50000 );
	}

	@Test
	public void testCarWithHashSet()
	{
		
		HashSet<Car> car = new HashSet<>();
		car.add(hyundayiCar);
		car.add(marutiCar);
		car.add(toyotaCar);
		car.add(marutiCars);
		
		assertEquals(3, car.size());
		
		Iterator<Car> it =car.iterator();
		//assertEquals("marutiCar" , it.next());
	}

}
