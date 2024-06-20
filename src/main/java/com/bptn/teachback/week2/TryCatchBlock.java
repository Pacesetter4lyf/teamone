package com.bptn.teachback.week2;

public class TryCatchBlock {

	public static void main(String[] args) {
        try {
            int data = 50 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finally block executed");
        }
        
        System.out.println("Program continues after handling exceptions.");

	}

}
