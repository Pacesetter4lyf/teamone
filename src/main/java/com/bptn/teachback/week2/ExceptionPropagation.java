package com.bptn.teachback.week2;

import java.io.FileNotFoundException;

//by propagation of exception
public class ExceptionPropagation{
	public void readFile(String filename) throws FileNotFoundException {
	 // Simulate reading a file
	}
	public static void main(String[] args)  throws FileNotFoundException {
		ExceptionPropagation obj = new ExceptionPropagation();
		obj.readFile("data.txt");  // Compile time error!
	}
}

