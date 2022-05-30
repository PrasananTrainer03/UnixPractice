package com.java.array;

public class BoxingTest {

	public void show(Object ob) {
		String type = ob.getClass().getSimpleName();
	//	System.out.println(type);
		if (type.equals("Integer")) {
			int a = (Integer)ob;
			System.out.println("Integer Casting  " +a);
		}
		if (type.equals("Double")) {
			double a = (Double)ob;
			System.out.println("Double Casting   " +a);
		}
		
		if (type.equals("String")) {
			String a = (String)ob;
			System.out.println("String Casting   " +a);
		}
	}
	
	public static void main(String[] args) {
		int a=12;
		double b=12.5;
		String str="Welcome";
		BoxingTest obj = new BoxingTest();
		obj.show(a);
		obj.show(b);
		obj.show(str);
	}
}
