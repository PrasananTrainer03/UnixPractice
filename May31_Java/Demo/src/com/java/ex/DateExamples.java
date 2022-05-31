package com.java.ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExamples {

	public void show() {
		Date obj = new Date();
		System.out.println(obj);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(obj));
	}
	public static void main(String[] args) {
		DateExamples obj = new DateExamples();
		obj.show();
	}
}
