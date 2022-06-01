package com.java.cols;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("Charan");
		s.add("Dorababu");
		s.add("Ayushi");
		s.add("Gopichand");
		s.add("Jashwanth");
		s.add("Srija Lalitha");
		s.add("Karthik");
		s.add("Charan");
		s.add("Dorababu");
		s.add("Ayushi");
		s.add("Gopichand");
		s.add("Jashwanth");
		s.add("Charan");
		s.add("Dorababu");
		s.add("Ayushi");
		s.add("Gopichand");
		s.add("Jashwanth");
		System.out.println("HashSet Data is  ");
		for (Object ob : s) {
			System.out.println(ob);
		}
	}
}
