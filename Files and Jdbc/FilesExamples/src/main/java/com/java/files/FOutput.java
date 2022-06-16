package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOutput {

	public static void main(String[] args) {
		try {
			FileInputStream fin = 
					new FileInputStream("D:/Java_Segue15/Day1/EmployProject/src/com/java/test/Employ.java");
			FileOutputStream fout = new 
					FileOutputStream("d:/files/fileoutput.txt");
			int ch;
			while((ch=fin.read()) != -1) {
				fout.write((char)ch);
			}
			fin.close();
			fout.close();
			System.out.println("*** File Copied ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
