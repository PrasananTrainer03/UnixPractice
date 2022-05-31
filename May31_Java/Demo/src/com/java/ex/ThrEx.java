package com.java.ex;

public class ThrEx {

	public void show(int x) {
		if (x==0) {
			throw new NumberFormatException("Zero is Invalid Value...");
		} else if (x < 0) {
			throw new ArithmeticException("Negative Numbers not Allowed...");
		} else {
			System.out.println("X value is   " +x);
		}
	}
	
	public static void main(String[] args) {
		ThrEx obj = new ThrEx();
		try {
			obj.show(0);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
