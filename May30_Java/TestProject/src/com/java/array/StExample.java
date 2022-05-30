package com.java.array;

public class StExample {

	static {
		System.out.println("Static Constructor...");
	}
	
	public StExample() {
		System.out.println("General Constructor...");
	}
	
	public static void main(String[] args) {
		StExample obj = new StExample();
	}
}
