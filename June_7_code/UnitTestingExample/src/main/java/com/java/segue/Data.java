package com.java.segue;

public class Data {

	public boolean evenOdd(int n) {
		if (n%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int maxArray(int a[]) {
		int max=a[0];
		for (int i : a) {
			if (max < i) {
				max=i;
			}
		}
		return max;
	}
	
	public int minArray(int a[]) {
		int min=a[0];
		for (int i : a) {
			if (min > i) {
				min=i;
			}
		}
		return min;
	}
	
	public int fact(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * fact(n-1);
		}
	}
	
	public int max3(int a,int b, int c) {
		int m=a;
		if (m < b) {
			m=b;
		}
		if (m < c) {
			m=c;
		}
		return m;
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public String sayHello() {
		return "Welcome to Java Programming...";
	}
	
}
