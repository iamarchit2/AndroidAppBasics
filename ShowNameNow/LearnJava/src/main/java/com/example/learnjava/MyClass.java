package com.example.learnjava;

public class MyClass {
    public static void main(String[] args) { //8. main entry point.
        //9. String variables
        String name = "Archit";

        //10. int variables
        int age = 23;

        // 11. long, float, double variables
        long weightOfPlanet = 369999990;
        float pi = 3.14f; // put f ahead of a float
        double pid = 3.14d; // put d ahead of the double, they are bigger and more precise

        // 12. byte, short, char variable
        byte b = 1; //can hold up to 127
        short s = 156; //can hold up to 256
        char c = '4';

        // 13. boolean variables
        boolean istrue = true;

        System.out.println(istrue);
        System.out.println("Hey, I am a Programmer." + "\nMy age is " + 23 + "."); // 10. concatenation
    }
}
