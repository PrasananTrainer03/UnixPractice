package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenIntDemo {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(new Integer(24));
		numbers.add(new Integer(11));
		numbers.add(new Integer(89));
		numbers.add(new Integer(13));
		numbers.add(new Integer(56));
		
		int sum=0;
		for (Integer i : numbers) {
			sum+=i;
		}
		System.out.println("Sum is   " +sum);
	}
}
