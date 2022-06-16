package com.java.files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputExample {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("d:/files/data.txt");
			DataInputStream din = new DataInputStream(fin);
			int x =din.readInt();
			String str = din.readUTF();
			boolean flag = din.readBoolean();
			double basic = din.readDouble();
			System.out.println("X value is   " +x);
			System.out.println("Name is  " +str);
			System.out.println("Boolean Value  " +flag);
			System.out.println("Basic is  " +basic);
			din.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
