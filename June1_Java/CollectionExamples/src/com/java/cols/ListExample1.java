package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Ayushi");
		names.add("Thanusha");
		names.add("Charishma");
		names.add("Ameesha");
		names.add("Saniya");
		names.add("Vara Prasad");
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.add(2, "Pooja");
		System.out.println("Names after adding new Item");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove("Saniya");
		System.out.println("List after removing...");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
