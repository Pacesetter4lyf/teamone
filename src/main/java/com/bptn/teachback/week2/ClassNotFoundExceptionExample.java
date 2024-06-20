package com.bptn.teachback.week2;

//checked: loading unknown class
public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to load a class that does not exist
            Class<?> clazz = Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }

        System.out.println("Program continues after handling exceptions.");
    }
}
