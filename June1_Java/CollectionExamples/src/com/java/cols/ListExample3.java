package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListExample3 {

	public static void main(String[] args) {
		List employs = new ArrayList();
		employs.add(new Employ(1, "Rasagna", 99323));
		employs.add(new Employ(2, "Likhitha", 89033));
		employs.add(new Employ(3, "Geeshma", 89333));
		employs.add(new Employ(4, "Jahnavi", 70943));
		employs.add(new Employ(5, "Gopichand", 93333));
		employs.add(new Employ(6, "Kavya", 78432));
		for (Object ob : employs) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
	}
}
