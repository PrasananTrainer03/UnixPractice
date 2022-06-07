package com.java.array;

public class Emp {

	private int empno;
	private String name;
	private double basic;
	
	public Emp() {
		this.empno=1;
		this.name="Joshitha";
		this.basic=83234;
	}

	public Emp(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	public static void main(String[] args) {
		Emp emp1 = new Emp();
		System.out.println(emp1);
		
		Emp emp2 = new Emp(73, "Jayanth", 99323);
		System.out.println(emp2);
	}
}
