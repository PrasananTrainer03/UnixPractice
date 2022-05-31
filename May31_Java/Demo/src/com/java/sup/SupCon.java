package com.java.sup;

public class SupCon {

	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new Ayushi(1, "Ayushi", 93923),
			new Charan(3, "Charan", 99234)
		};
		for (Employ e : arr) {
			System.out.println(e);
		}
	}
}
