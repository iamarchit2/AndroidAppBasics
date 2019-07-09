package com.example.javaoop;

public class Microphone { //modifier(public)
    // 28. instance variables, properties
    String name;
    String color;
    int model;

    public Microphone(String name, String color, int model) { // overrides the default constructor
        this.name = name; // why use this keyword?
        this.color = color;
        this.model = model;
    }

    // 29. methods, actions
    public void turnOFF() {
        System.out.println(this.name + " turned off"); // this keyword
    }
    public void  turnON() {
        System.out.println(this.name + " turned on");
    }
    public void setVolume() {
        System.out.println(this.name + " volume set");
    }
    public String showDescription() {
        return "Microphone name: " + this.name + " Microphone model: " + this.model + " having colour: " + this.color;
    }
}
