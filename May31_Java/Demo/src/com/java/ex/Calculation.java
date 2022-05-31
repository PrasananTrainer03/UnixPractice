package com.java.ex;

public class Calculation {

	public void calc(int a, int b) throws NumberZeroException, NegativeException {
		if (a==0 || b==0) {
			throw new NumberZeroException("Zero is Invalid value...");
		} else if (a < 0 || b < 0) {
			throw new NegativeException("Negative Numbers Not Allowed...");
		} else {
			int c=a+b;
			System.out.println("Sum is  " +c);
		}
	}
	
	public static void main(String[] args) {
		int a,b;
		a=5;
		b=7;
		Calculation obj = new Calculation();
		try {
			obj.calc(a, b);
		} catch (NumberZeroException | NegativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
