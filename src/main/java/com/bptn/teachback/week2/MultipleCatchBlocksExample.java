package com.bptn.teachback.week2;

public class MultipleCatchBlocksExample {
    public static void main(String[] args) {
        try {
            // Code that may throw different exceptions
            int data = 50 / 0; // This will throw an ArithmeticException
            
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
            
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
        
        System.out.println("Program continues after handling exceptions.");
    }
}