package com.bptn.teachback.week2;

//UNCHECKED class cast exception:
public class ClassCastExceptionExample {
 public static void main(String[] args) {
     try {
         Object i = Integer.valueOf(42); // i is an Integer
         String s = (String) i; // Attempting to cast Integer to String, which will throw ClassCastException
     } catch (ClassCastException e) {
         System.out.println("ClassCastException caught: " + e.getMessage());
     }

     System.out.println("Program continues after handling exceptions.");
 }
}
