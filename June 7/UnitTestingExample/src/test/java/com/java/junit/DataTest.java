package com.java.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Hashtable;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DataTest {

	static Data obj;
	
	@BeforeClass
	public static void init() {
		obj = new Data();
	}
	@Test
	public void testSearchMap() {
		Map data = new Hashtable();
		data.put("Jayanth", "varma");
		data.put("Kavya", "Sri");
		data.put("Lakshmi", "Rasagna");
		data.put("Gaurav", "Gawhane");
		assertNotNull(obj.searchMap(data, "Jayanth"));
		assertNull(obj.searchMap(data, "Ayushi"));
	}
	@Test
	public void testData() {
		Data data = null;
		assertNull(data);
		assertNotNull(obj);
	}
	
	@Test
	public void testMaxArray() {
		int[] a = {1,2,3,4};
		assertEquals(4, obj.maxArray(a));
	}
	
	@Test
	public void testMinArray() {
		int[] a = {1,2,-3,4};
		assertEquals(-3, obj.minArray(a));
	}
	
	@Test
	public void testEvenOdd() {
		assertTrue(obj.evenOdd(6));
		assertFalse(obj.evenOdd(5));
	}
	
	@Test
	public void testPosNeg() {
		assertTrue(obj.posNeg(5));
		assertFalse(obj.posNeg(-5));
	}
	
	@Test
	public void testMax3() {
		assertEquals(5, obj.max3(5, 3, 2));
		assertEquals(5, obj.max3(3, 5, 2));
		assertEquals(5, obj.max3(3, 2, 5));
	}
	
	@Test
	public void testFact() {
		assertEquals(120, obj.fact(5));
	}
	@Test
	public void testSayHello() {
		assertEquals("Welcome to Junit Testing...", obj.sayHello());
	}
	
	@Test 
	public void testSum() {
		assertEquals(5, obj.sum(2, 3));
	}
	
	@AfterClass
	public static void cleanUp() {
		obj = null;
	}

}
