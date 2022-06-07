package com.java.ex;

public class ReadOnlyExample {

	private int empno;
	private String name;
	private double basic;
	
	ReadOnlyExample(int empno, String name, double basic) {
		this.empno=empno;
		this.name=name;
		this.basic=basic;
	}
	
	public int getEmpno() {
		return empno;
	}

	public String getName() {
		return name;
	}

	public double getBasic() {
		return basic;
	}

	@Override
	public String toString() {
		return "ReadOnlyExample [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}

	public static void main(String[] args) {
		ReadOnlyExample obj1 = new ReadOnlyExample(1, "Gaurav", 99324);
	//	obj1.
		System.out.println("Employ No   " +obj1.getEmpno());
		System.out.println("Employ Name   " +obj1.getName()); 
		System.out.println("Basic    " +obj1.getBasic());
	}
}
