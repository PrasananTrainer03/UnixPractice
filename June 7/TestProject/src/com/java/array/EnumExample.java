package com.java.array;

enum WeekDays {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
			SATURDAY
}

public class EnumExample {

	public static void main(String[] args) {
		WeekDays wd = WeekDays.SUNDAY;
		System.out.println(wd);
	}
}
