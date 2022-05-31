package com.java.intf;

interface IOne {
	void name();
}

interface ITwo {
	void email();
}

class Test implements IOne, ITwo {

	@Override
	public void email() {
		System.out.println("Email is Venkatasai@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("Name is Venkata Sai...");
	}
	
	
}
public class MultiInh {

	public static void main(String[] args) {
		Test obj = new Test();
		obj.name();
		obj.email();
	}
}
