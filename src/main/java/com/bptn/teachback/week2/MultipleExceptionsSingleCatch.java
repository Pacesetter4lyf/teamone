package com.bptn.teachback.week2;

public class MultipleExceptionsSingleCatch {
    public static void main(String[] args) {
		try {
	    	int array[] = new int[5];
	    	array[10] = 30 / 0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
	    	System.out.println(e.getMessage());
		}
    
        System.out.println("Program continues after handling exceptions.");
    }
}
