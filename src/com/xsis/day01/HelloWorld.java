package com.xsis.day01;

public class HelloWorld {

    private static int counter=10;
    private String hello = "Hello Java";

    public static void main(String[] args){
        String x= "I'm Java Developer";
        System.out.println(x);

        //call static variable
        System.out.println("Static counter : " +counter);

        //call instance variable hello
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.hello);

        //System.out.println("Hello World");
        //System.out.println("Hello Java Xsis Programmer");
    }
}
