package com.example.javaoop;

public class MyClass {
    public static void main(String[] args) {
        Microphone mic1 = new Microphone("blue yeti", "blue",122 ); //instantiate using constructor
        // constructor creates a spot in the memory
        /*mic1.model = 12254;
        mic1.color = "blue";
        mic1.name = "blue yeti";
        System.out.println(mic1);*/ //only prints the address at which it is created

        Microphone mic2 = new Microphone("black bose", "black", 14258);
        /*mic2.model = 134562;
        mic2.color = "black";
        mic2.name = "black bose";
        System.out.println(mic2);*/
        mic1.turnON();
        mic1.setVolume();
        mic1.turnOFF();
        System.out.println(mic1.showDescription());

        mic1.setColor("red");
        mic1.setName("red yeti");
        mic1.setModel(123);
        System.out.println(mic1.showDescription());

    }
}
