package com.java.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateNew {

	public void show(String str) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = sdf.parse(str);
		System.out.println(dt);
	}
	public static void main(String[] args) {
		String str="2022-05-31";
		DateNew obj = new DateNew();
		try {
			obj.show(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
