package com.java.ex;

public class WriteOnlyExample {

	private int empno;
	private String name;
	private double basic;
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "WriteOnlyExample [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	public static void main(String[] args) {
		WriteOnlyExample obj = new WriteOnlyExample();
		obj.setEmpno(1);
		obj.setName("Kamal");
		obj.setBasic(99423);
		System.out.println(obj);
	}
}
