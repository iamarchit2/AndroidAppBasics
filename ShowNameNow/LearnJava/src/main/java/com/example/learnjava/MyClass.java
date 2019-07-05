package com.example.learnjava;

public class MyClass {
    public static void main(String[] args) { //1. main entry point.
        //2. String variables
        String name = "Archit";
        //3. int variables
        int age = 23;
        // 4. long, float variables
        long weightOfPlanet = 369999990;
        float pi = 3.14f; // put f ahead of a float
        double pid = 3.14d; // put d ahead of the double, they are bigger and more precise.
        System.out.println("My name is " + name + " and my age is " + age + "." + " " + pi + " " + pid); // 3. concatenation
        System.out.println("Hey, I am a Programmer.");
    }
}
