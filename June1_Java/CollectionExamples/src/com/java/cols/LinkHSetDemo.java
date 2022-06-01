package com.java.cols;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHSetDemo {

	public static void main(String[] args) {
		Set s = new LinkedHashSet();
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
		
		System.out.println("Linked Hashset Data  ");
		for (Object ob : s) {
			System.out.println(ob);
		}
	}
}
