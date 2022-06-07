package com.java.junit;

import java.util.Map;

public class Data {

	public Object searchMap(Map m, Object key) {
		return m.get(key);
	}
	
	public int maxArray(int[] a) {
		int max=a[0];
		for (int i : a) {
			if (max < i) {
				max=i;
			}
		}
		return max;
	}
	public int minArray(int[] a) {
		int min=a[0];
		for (int i : a) {
			if (min > i) {
				min=i;
			}
		}
		return min;
	}
	
	public boolean evenOdd(int n) {
		if (n%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean posNeg(int n) {
		if (n >= 0) {
			return true;
		} else {
			return false;
		}
	}
	public String sayHello() {
		return "Welcome to Junit Testing...";
	}
	
	public int max3(int a, int b, int c) {
		int m=a;
		if (m < b) {
			m=b;
		}
		if (m < c) {
			m=c;
		}
		return m;
	}
	
	public int sum(int a,int b) {
		return a+b;
	}
	
	public int fact(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * fact(n-1);
		}
	}
}
