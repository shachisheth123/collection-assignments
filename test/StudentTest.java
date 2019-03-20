package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.Student;

public class StudentTest {

	static Student studentJava;
	static Student studentSql;
	static Student studentCore;
	
	@BeforeClass
	public static void setUp()
	{
		studentJava=new Student("shachi", 1);
		studentSql=new Student("Rasika", 2);
		studentCore=new Student("Rohan", 3);
		
	}
	
	@Test
	public void testInsertionOrder()
	{
		ArrayList<Student> student=new ArrayList<>();
		student.add(studentCore);
		student.add(studentJava);
		student.add(studentSql);
		
		
		Iterator<Student> students = student.iterator();
		assertEquals(studentCore, students.next());
		assertEquals(studentJava, students.next());
		assertEquals(studentSql, students.next());
		
		assertEquals(studentCore, students.next());
		
		
	}
	
	
}
