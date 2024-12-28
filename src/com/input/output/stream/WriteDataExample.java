package com.input.output.stream;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataExample {
	public static void main(String[] args) throws IOException {

		// FileOutputStream fos = null;
		// Step-1- Create object of FileWriter
		FileWriter fWriter = new FileWriter("C:\\Users\\SHILPA\\OneDrive\\Desktop");
		// Step-2- use write() method
		//scanner-> nextLine() method-String s
		fWriter.write("This is online java classes...");
		//fWriter.close();
		// Step-3- meaningful message
		System.out.println("File written successfully..");

	}
}

