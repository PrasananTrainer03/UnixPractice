package com.java.cols;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList names = new LinkedList();
		names.add("Srija");
		names.add("Kavya");
		names.add("Geeshma");
		names.add("Mounisha");
		names.add("Roshini");
		names.addFirst("Dora Babu");
		names.addLast("Thanusha");
		System.out.println("Linked List Data  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
