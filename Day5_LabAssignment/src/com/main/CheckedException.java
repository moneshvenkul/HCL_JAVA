package com.main;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream("E:\\Naveen.txt");

			while (fileInputStream.available() > 0) {
				int i = fileInputStream.read();

				System.out.print((char) i);
			}

			fileInputStream.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
