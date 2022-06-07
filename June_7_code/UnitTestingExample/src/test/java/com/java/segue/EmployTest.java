package com.java.segue;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testConstructor() {
		Employ employ = new Employ();
		assertNotNull(employ);
		Employ emp1 = new Employ(1,"Niharika",Gender.FEMALE,"Java","Programmer",93243.23);
		assertEquals(1, emp1.getEmpno());
		assertEquals("Niharika", emp1.getName());
		assertEquals(Gender.FEMALE, emp1.getGender());
		assertEquals("Java", emp1.getDept());
		assertEquals("Programmer", emp1.getDesig());
		assertEquals(93243.23, emp1.getBasic(), 2);
	}
	
	@Test
	public void testToString() {
		Employ emp1 = new Employ(1,"Niharika",Gender.FEMALE,"Java","Programmer",93243.23);		
		String result = "Employ [empno=" + 1 + ", name=" + "Niharika" + ", gender=" + "FEMALE" + ", dept=" + "Java" + ", desig=" +
				 "Programmer" + ", basic=" + 93243.23 + "]";
		assertEquals(result, emp1.toString());
	}
	@Test
	public void testGettersAndSetters() {
		Employ employ = new Employ();
		employ.setEmpno(1);
		employ.setName("Niharika");
		employ.setGender(Gender.FEMALE);
		employ.setDept("Java");
		employ.setDesig("Programmer");
		employ.setBasic(93243.23);
		
		assertEquals(1, employ.getEmpno());
		assertEquals("Niharika", employ.getName());
		assertEquals(Gender.FEMALE, employ.getGender());
		assertEquals("Java", employ.getDept());
		assertEquals("Programmer", employ.getDesig());
		assertEquals(93243.23, employ.getBasic(), 2);
	}
}
