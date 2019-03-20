package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.Television;

public class TelivionCollectionTest {

	private static Television television1;
	private static Television television2;
	private static Television television3;
	private static Television television4;

	@BeforeClass
	public static void setUp() {

		television1 = new Television("philips", "LCD", true, 65000);
		television2 = new Television("sony", "LED", false, 65000);
		television3 = new Television("Samsung", "LCD", true, 75000);
		television4 = new Television("sony", "LED", false, 65000);

	}

	@Test
	public void testTelevisionOrder() {

		HashSet<Television> television = new HashSet<>();
		television.add(television1);
		television.add(television2);
		television.add(television3);
		television.add(television2);

		assertEquals(3, television.size());
	}

}
