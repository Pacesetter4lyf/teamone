package com.bptn.teachback.week2;

import java.io.FileNotFoundException;

public class CheckedExceptionExample {
	public void readFile(String filename) throws FileNotFoundException {
		    // Simulate reading a file
	}

	public static void main(String[] args) throws FileNotFoundException{
		CheckedExceptionExample obj = new CheckedExceptionExample();
		obj.readFile("data.txt");  // Compile time error!
		System.out.println("Finished");
	}
}
