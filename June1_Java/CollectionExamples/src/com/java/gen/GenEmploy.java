package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Rasagna", 99323));
		employList.add(new Employ(2, "Likhitha", 89033));
		employList.add(new Employ(3, "Geeshma", 89333));
		employList.add(new Employ(4, "Jahnavi", 70943));
		employList.add(new Employ(5, "Gopichand", 93333));
		employList.add(new Employ(6, "Kavya", 78432));
		for (Employ e : employList) {
			System.out.println(e);
		}
	}
}
