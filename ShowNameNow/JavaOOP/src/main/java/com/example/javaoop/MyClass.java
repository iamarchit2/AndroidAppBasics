package com.example.javaoop;

import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        /*Microphone mic1 = new Microphone("blue yeti", "blue",122 ); //instantiate using constructor
        // constructor creates a spot in the memory
        *//*mic1.model = 12254;
        mic1.color = "blue";
        mic1.name = "blue yeti";
        System.out.println(mic1);*//* //only prints the address at which it is created

        Microphone mic2 = new Microphone("black bose", "black", 14258);
        *//*mic2.model = 134562;
        mic2.color = "black";
        mic2.name = "black bose";
        System.out.println(mic2);*//*
        mic1.turnON();
        mic1.setVolume();
        mic1.turnOFF();
        System.out.println(mic1.showDescription());

        mic1.setColor("red");
        mic1.setName("red yeti");
        mic1.setModel(123);
        System.out.println(mic1.showDescription());

        Microphone mic3 = new Microphone();*/


        /*// 36. inheritance structure
        Person james = new Person("james", "bond", 23);

        Employee jimmy = new Employee();
        jimmy.setFirstname("jimmy");
        jimmy.setLastname("kane");
        jimmy.setAge(22);
        jimmy.setId(12);
        System.out.println(jimmy);

        Manager manager = new Manager();
        manager.setFirstname("joy");
        manager.setLastname("bishu");
        manager.setAge(22);
        manager.setId(1);
        manager.setAnnualSalary(100000);
        // 37. overriding parent class method
        System.out.println(manager.getId());
        // 38. overriding super class method
        System.out.println(manager);*/


        // 39. string is an object, not a primitive
        /*String myString = "Hell There";
        boolean contains = myString.contains("her");
        if(contains) {
            System.out.println("Yes, the string contains her");
        }
        else {
            System.out.println("No, it does not contain her");
        }*/


        /*// 41. array
        String[] myArray = {"Hey", "I", "am", "Archit", "."};

        // 42. for loop
        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        // 43. pre-setting an array
        int[] newArray = new int[4];
        newArray[0] = 1;
        newArray[1] = 10;
        newArray[2] = 100;
        newArray[3] = 1000;
        for(int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }*/

        // 44. arrayList
        //ArrayList<String> name  = new ArrayList<>();
        ArrayList name = new ArrayList();
        name.add("Bond");
        name.add("James");
        name.add("Virat");
        for(int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }
        // smart loop
        for(Object names : name) {
            System.out.println("Names: " + names);
        }
    }
}
