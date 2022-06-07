package com.java.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testToString() {
		Employ employ3 = new Employ(3, "Dora Babu", Gender.MALE, "Dotnet", "Developer", 99253.23);
		String result = "Employ [empno=" + 3 + ", name=" + "Dora Babu" + ", gender=" + "MALE" + ", dept=" + "Dotnet" + ", desig="
				+ "Developer" + ", basic=" + 99253.23 + "]";
		assertEquals(result, employ3.toString());
	}
	
	@Test 
	public void testGettersAndSetters() {
		Employ employ = new Employ();
		employ.setEmpno(1);
		employ.setName("Gaurav");
		employ.setGender(Gender.MALE); 
		employ.setDept("Java");
		employ.setDesig("Programmer");
		employ.setBasic(92353.32);
		
		assertEquals(1, employ.getEmpno());
		assertEquals("Gaurav", employ.getName());
		assertEquals(Gender.MALE, employ.getGender());
		assertEquals("Java", employ.getDept());
		assertEquals("Programmer", employ.getDesig());
		assertEquals(92353.32, employ.getBasic(), 2);
	}
	
	@Test
	public void testConstructor() {
		Employ employ1 = new Employ();
		assertNotNull(employ1);
		Employ employ2 = null;
		assertNull(employ2);
		Employ employ3 = new Employ(3, "Dora Babu", Gender.MALE, "Dotnet", "Developer", 99253.23);
		assertEquals(3, employ3.getEmpno());
		assertEquals("Dora Babu", employ3.getName());
		assertEquals(Gender.MALE, employ3.getGender());
		assertEquals("Dotnet", employ3.getDept());
		assertEquals("Developer", employ3.getDesig());
		assertEquals(99253.23, employ3.getBasic(), 2);
	}

	
}
