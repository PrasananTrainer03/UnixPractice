package com.java.segue;

public class CaseDemo1 {

	public void check(int choice) {
		switch(choice) {
		case 1 : 
			System.out.println("Hi I am Ganga Bhavani...");
			break;
		case 2 : 
			System.out.println("Hi I am Sai Sumanth...");
			break;
		case 3 : 
			System.out.println("HI I am Saritha...");
			break;
		case 4 : 
			System.out.println("Hi I am Ramesh...");
			break;
		case 5 : 
			System.out.println("Hi I am Venu...");
			break;
		default : 
			System.out.println("Invalid Choice...");
			break;
			
		}
	}
	public static void main(String[] args) {
		int choice=4;
		CaseDemo1 obj = new CaseDemo1();
		obj.check(choice);
	}
}
