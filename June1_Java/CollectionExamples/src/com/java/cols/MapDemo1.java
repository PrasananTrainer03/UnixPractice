package com.java.cols;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo1 {

	public static void main(String[] args) {
		Map data = new HashMap();
		data.put("Kamal", "Java");
		data.put("Srija", "Lalitha");
		data.put("Karthik", "Aluru");
		data.put("Charan", "Naga");
		data.put("Dora", "Babu");
		String key,value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key and Value  ");
		key=sc.next();
		value=sc.next();
		
		String result =(String)  data.getOrDefault(key, "Not Found");
		if (result.equals(value)) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
