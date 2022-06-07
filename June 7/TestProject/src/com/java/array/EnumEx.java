package com.java.array;

enum Month {
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY,
		AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, 
		DECEMBER
}

public class EnumEx {
	
	public static void main(String[] args) {
		String month="JANUARY";
		Month enum1 = Month.valueOf(month);
		System.out.println(enum1);
	}
}
