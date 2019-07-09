package com.example.javaoop;

public class MyClass {
    public static void main(String[] args) {
        Microphone mic1 = new Microphone(); //instantiate using constructor
        mic1.model = 12254;
        mic1.color = "blue";
        mic1.name = "blue yeti";
        System.out.println(mic1); //only prints the address at which it is created

        Microphone mic2 = new Microphone();
        mic2.model = 134562;
        mic2.color = "black";
        mic2.name = "black bose";
        System.out.println(mic2);
    }
}
