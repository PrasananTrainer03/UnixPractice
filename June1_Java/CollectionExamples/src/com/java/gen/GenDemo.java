package com.java.gen;

class Data<T> {
	public void swap(T a, T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value is  " +a+ " B value is  " +b);
	}
}

public class GenDemo {

	public static void main(String[] args) {
		Data obj = new Data();
		int a,b;
		a=5;
		b=7;
		obj.swap(a, b);
		String s1="Geeshma", s2="Dora Babu";
		obj.swap(s1, s2);
		boolean b1=true, b2=false;
		obj.swap(b1, b2);
	}
}
