package com.java.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortExample {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Charan");
		names.add("Dorababu");
		names.add("Ayushi");
		names.add("Gopichand");
		names.add("Jashwanth");
		names.add("Srija Lalitha");
		names.add("Karthik");
		
		System.out.println("Sorted Data is  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
