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
        boolean istrue = false;

        //14. add, sub, mul, div
        int p = 12;
        double q = 14;
        int add = (int) (p + q);
        int sub = (int) (p - q);
        int mul = (int) (p * q);
        int div = (int) (p / q); //explicit casting

        //15. Why use variables

        //16. % operator, remainder
        double remainder = (q % p);

        //17. ==, != operator(relation operators)
        //17. !(logical negation operator)

        //18. <, >, <=, >=(relational operators)

        //19. &&, ||(logical operators)

        //20. for loops(initialisation, condition, increment)
        /*for(int i = 0; i < 20; i++) {
            if(i % 3 == 0) {
                System.out.println("Hello " + i);
            }
        }*/

        //21. methods(return value, arguments, body) and strings parameters
        showName();
        anotherMethod("Hello", 23);

        // 22. function parameters - passing more than 1 parameters.
        addNumbers(12, 15);
        multiplyNumbers(12, 15);

        //23. return value
        System.out.println(addNumbers(12, 15));

        /*System.out.println(remainder);
        System.out.println("Hey, I am a Programmer." + "\nMy age is " + 23 + "."); // 10. concatenation*/
    }
    public static int addNumbers(int a, int b) {
        int result = a + b;
        return result;
    }
    public static void multiplyNumbers(int a, int b) {
        System.out.println("Product is " + (a * b));
    }
    public static void anotherMethod(String something, int age) {
        System.out.println(something + " " + age);
    }
    public static void showName() { // Modifiers(public, static)
        System.out.println("From showName");
    }
}
