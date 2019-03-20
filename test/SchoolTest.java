package com.capgemini.test;


import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.CellPhone;
import com.capgemini.model.School;

public class SchoolTest {

static School school1 ;//= new School("Dav" , "Pune" , "Pune" ,"A");
static School poonaschool;
static School holyschool;


@BeforeClass
public static void  setUp()
{
	school1= new School("Dav" , "Pune" , "Pune" ,"A");
	poonaschool= new School("Dav" , "Pune" , "Pune" ,"A");
	holyschool=new School("millenium" ,"mumbai", "mumbai" ,"A");
}

@Test
public void testHashSetOrder()
{
	 HashSet<School> school=new HashSet<>();
	 school.add(school1);
	 school.add(poonaschool);
	 school.add(holyschool);
	 
	 assertEquals(2,school.size());
}



}
