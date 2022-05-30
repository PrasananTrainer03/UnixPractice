package com.java.segue;

public class Factorial {

	public void calc(int n) {
		int f=1;
		int i=1;
		while(i <= n) {
			f=f*i;
			i++;
		}
		System.out.println("Factorial Value is  " +f);
	}
	public static void main(String[] args) {
		int n=7;
		Factorial obj = new Factorial();
		obj.calc(n);
	}
}
