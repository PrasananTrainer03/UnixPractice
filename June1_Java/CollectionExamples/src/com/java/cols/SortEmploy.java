package com.java.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
	//	Comparator c = new NameComparator(); 
		Comparator c = new BasicComparator();
		SortedSet employs = new TreeSet(c);
		employs.add(new Employ(1, "Rasagna", 99323));
		employs.add(new Employ(2, "Likhitha", 89033));
		employs.add(new Employ(3, "Geeshma", 89333));
		employs.add(new Employ(4, "Jahnavi", 70943));
		employs.add(new Employ(5, "Gopichand", 93333));
		employs.add(new Employ(6, "Kavya", 78432));
		System.out.println("Sorted Data is  ");
		for (Object ob : employs) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
	}
}
