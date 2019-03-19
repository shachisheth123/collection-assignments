package com.capgemini.test;




import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.Laptop;

public class LaptopTest {

	private static Laptop dellLaptops;
	private static Laptop dellLaptop;
	private static Laptop hpLatop;
	private static Laptop appleLaptop;

	@BeforeClass
	public static void setUp() {
		dellLaptop = new Laptop("delllaptop", "inspiron", "Windows", "i5");
		hpLatop = new Laptop("hplaptop", "inspire", "Ubuntu", "i3");
		appleLaptop = new Laptop("applelaptop", "macbook", "ios", "i9");
		dellLaptops = new Laptop("delllaptop", "inspiron", "Windows", "i5");
	}

	@Test
	public void testLaptopToCheckArrayListOrder() {
		// HashSet<String> laptop =new HashSet<>();
		ArrayList<Laptop> laptops = new ArrayList<>();
		laptops.add(dellLaptop);
		laptops.add(hpLatop);
		laptops.add(appleLaptop);

		Iterator<Laptop> it = laptops.iterator();
		assertEquals(dellLaptop, it.next());
		assertEquals(hpLatop, it.next());
		assertEquals(appleLaptop, it.next());

	}

	@Test
	public void testLaptopToCheckHashsetOrder() {
		HashSet<Laptop> laptop = new HashSet<>();
		laptop.add(dellLaptop);
		laptop.add(appleLaptop);
		laptop.add(hpLatop);
		laptop.add(dellLaptops);

		// assertEquals(appleLaptop, it.next());
		// assertEquals(hpLatop, it.next());
		assertEquals(3, laptop.size());
	}
}
