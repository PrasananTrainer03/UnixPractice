package com.java.files;

import java.io.File;

public class FileExample1 {

	public static void main(String[] args) {
		File f1 = new File("D:/Java_Segue15/Day1/EmployProject/src/com/java/test/Employ.java");
		System.out.println("File Name   " +f1.getName());
		System.out.println("Path   " +f1.getPath());
		System.out.println("Parent Directory   " +f1.getParent());
	}
}
