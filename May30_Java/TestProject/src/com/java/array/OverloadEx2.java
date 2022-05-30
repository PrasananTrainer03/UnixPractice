package com.java.array;

public class OverloadEx2 {

	public int sum() {
		return 5;
	}
	
	public int sum(int a) {
		return a+5;
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		OverloadEx2 obj = new OverloadEx2();
		System.out.println("Show method w.r.t. Zero Arguments   " +obj.sum());
		System.out.println("Show Method w.r.t. One Argument  " +obj.sum(12));
		System.out.println("Show Method w.r.t. Two Arguments   " +obj.sum(12, 5));
	}
}
