package com.bptn.teachback.week2;

public class MultipleExceptionsSingleCatch {
    public static void main(String[] args) {
		try {
			
	    	int[] arr = {1, 2, 3, 3};
	    	int fifthElement = arr[4];
	    	arr[0] = 30 / 0;

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
	    	System.out.println(e.getMessage());
		}
    
        System.out.println("Program continues after handling exceptions.");
    }
}
