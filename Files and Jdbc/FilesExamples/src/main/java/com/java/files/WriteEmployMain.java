package com.java.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmployMain {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("d:/files/data.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			Employ employ = new Employ(1, "Jyoshna", 88235);
			objout.writeObject(employ);
			objout.close();
			fout.close();
			System.out.println("*** Object Stored ***");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
