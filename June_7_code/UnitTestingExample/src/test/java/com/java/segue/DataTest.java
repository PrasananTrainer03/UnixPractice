package com.java.segue;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DataTest {

	@Test
	public void testArrayDemo() {
		int[] a = {5,23,-3,21};
		int[] b = {5,23,-3,21};
		assertArrayEquals(a, b);
	}
	
	@Test
	public void testEvenOdd() {
		Data obj = new Data();
		assertTrue(obj.evenOdd(6));
		assertFalse(obj.evenOdd(5));
	}
	
	@Test
	public void testData() {
		Data obj = new Data();
		assertNotNull(obj);
		Data d1 = null;
		assertNull(d1);
	}
	
	@Test
	public void testMaxArray() {
		Data obj = new Data();
		int[] a = {5,23,-3,21};
		assertEquals(23, obj.maxArray(a));
	}
	
	@Test
	public void testMinArray() {
		Data obj = new Data();
		int[] a = {5,23,-3,21};
		assertEquals(-3, obj.minArray(a));
	}
	
	@Test
	public void testFact() {
		Data obj = new Data();
		assertEquals(120, obj.fact(5));
	}
	@Test 
	public void testMax3() {
		Data obj = new Data();
		assertEquals(5, obj.max3(5, 2, 3));
		assertEquals(5, obj.max3(2, 5, 3));
		assertEquals(5, obj.max3(2, 3, 5));
	}
	@Test
	public void testSum() {
		Data obj = new Data();
		assertEquals(5, obj.sum(2, 3));
	}
	
	@Test
	public void testSayHello() {
		Data obj = new Data();
		assertEquals("Welcome to Java Programming...", obj.sayHello());
	}
}
