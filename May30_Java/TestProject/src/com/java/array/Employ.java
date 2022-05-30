package com.java.array;

public class Employ {

	int empno;
	String name;
	double basic;
	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}

	public static void main(String[] args) {
		Employ e1 = new Employ();
		e1.empno=1;
		e1.name="Gopichand";
		e1.basic=83823;
		
		Employ e2 = new Employ();
		e2.empno=3;
		e2.name="Geeshma";
		e2.basic=99323;
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
