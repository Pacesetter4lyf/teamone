package com.bptn.teachback.week2;

public class UncheckedExceptionExample { 
    public static void main(String[] args) { 

        int numerator = 10; 
        int denominator = 0; // This line will cause an ArithmeticException (unchecked exception) 
        int result = numerator / denominator; System.out.println("Result: " + result); 
    }
 }
