package com.input.output.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataExample {
	public static void main(String[] args) throws IOException {

		/*
		 * int a;  //declaration
		 * a=50; //initialization
		 */
		FileInputStream fis = null;
		Scanner scanner = null;
		try {
			// Step-1- Create object of FileInputStream and pass filepath
			fis = new FileInputStream("C:\\Users\\SHILPA\\OneDrive\\Desktop");
			// Step-2- create the object of Scanner class and pass fis object
			scanner = new Scanner(fis); // I am software engineer pune
			// Step-3- while loop
			while (scanner.hasNextLine()) {
				// hasNextLine() method return boolean value- true
				// String s = scanner.nextLine();
				// System.out.println(s);
				// Step-4- print data
				System.out.println(scanner.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//we always close connection resource in finally block 
			//we can close in try block but that is bad coding practice.
			fis.close();
			scanner.close();
		}

	}
}



