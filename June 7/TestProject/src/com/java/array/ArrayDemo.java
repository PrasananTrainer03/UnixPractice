package com.java.array;

public class ArrayDemo {

	public void show() {
		int[] a = new int[] {12,53,88,24,37};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ArrayDemo obj = new ArrayDemo();
		obj.show();
	}
}
