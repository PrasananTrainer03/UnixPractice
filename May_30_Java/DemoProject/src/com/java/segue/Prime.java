package com.java.segue;

public class Prime {

	public void check(int n) {
		boolean flag=true;
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				flag=false;
				break;
			}
		}
		if (flag==true) {
			System.out.println("Prime Number...");
		} else {
			System.out.println("Not Prime Number...");
		}
	}
	public static void main(String[] args) {
		int n=11;
		Prime obj = new Prime();
		obj.check(n);
	}
}
