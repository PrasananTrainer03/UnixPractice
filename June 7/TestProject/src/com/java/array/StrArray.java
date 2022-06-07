package com.java.array;

public class StrArray {

	public void show() {
		String[] arr = new String[] {"Charan","Gaurav",
					"Geeshma","Jahnavi","Jayanth"
				};
		for (String s : arr) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		StrArray obj = new StrArray();
		obj.show();
	}
}
