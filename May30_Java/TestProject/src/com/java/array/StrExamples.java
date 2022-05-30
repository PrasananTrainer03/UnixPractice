package com.java.array;

public class StrExamples {

	public void show() {
		String str = "Welcome to Java Programming...Trainer Prasanna";
		System.out.println("Length of String is   " +str.length());
		System.out.println("Char at 5th position  " +str.charAt(5));
		System.out.println("First Occurrence of Char 'o'  " +str.indexOf("o"));
		System.out.println("Last Occurrene of Char 'o' is  " +str.lastIndexOf("o"));
		System.out.println("Lower Case String is  " +str.toLowerCase());
		System.out.println("Upper Case String is  " +str.toUpperCase());
		String s1="Prasanna",s2="Gaurav",s3="Prasanna";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(str.replace("Java", "J2EE"));
	}
	public static void main(String[] args) {
		StrExamples obj = new StrExamples();
		obj.show();
	}
}
