package com.capgemini.test;


import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.CellPhone;

public class CellPhoneTest {

 static CellPhone nokia ;
 static CellPhone samsung; 
 static CellPhone nokias ;
 
 @BeforeClass
 public static void setUp()
 {
	 nokia=new CellPhone("nokia", "620", "nokia phone", "windows", 45000);
	 samsung=new CellPhone("samsung", "s10", "samsung phone", "android", 55000);
	 nokias=new CellPhone("nokia", "620", "nokia phone", "windows", 45000);
 }
 
 @Test
 public void testTreeSetOrder()
 {
	 HashSet<CellPhone> cellphone=new HashSet<CellPhone>();
	 cellphone.add(nokia);
	 cellphone.add(samsung);
	 cellphone.add(nokias);
	 
	 assertEquals(3,cellphone.size());
	 
 }
 
 
 
 
}
