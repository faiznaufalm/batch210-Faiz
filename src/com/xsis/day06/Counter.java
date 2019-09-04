package com.xsis.day06;

public class Counter {
    static int counter = 0;
    public static void main(String[] args) {
        increment();
        System.out.println("Counter : " + counter);
        decrement();
        System.out.println("Counter : " + counter);
    }

    static void increment() {
        counter = counter + 5;
    }

    static void decrement() {
        counter = counter - 1;
    }
}
