package com.capgemini.test;

import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import com.capgemini.model.StudentMap;

class StudentMapTest {

	
	StudentMap student;
	
	@BeforeClass
	public void setUp()
	{
		
		student=new StudentMap();
	}
	
	@Test
	public void testStudentHashMap()
	{
		
		HashMap<String, String> student=new HashMap<>();
		student.put("Shachi", "Orange");
		student.put("Rohan", "Mango");
		student.put("Ravi","Grapes");
		
	}
	
}
