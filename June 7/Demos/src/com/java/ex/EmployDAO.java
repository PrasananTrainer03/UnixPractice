package com.java.ex;

public class EmployDAO {

	public static void main(String[] args) {
		Employ emp1 = new Employ();
		emp1.setEmpno(1);
		emp1.setName("Kavyasri");
		emp1.setBasic(84234);
		
		Employ emp2 = new Employ();
		emp2.setEmpno(3);
		emp2.setName("Kamal");
		emp2.setBasic(99323);
		
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
