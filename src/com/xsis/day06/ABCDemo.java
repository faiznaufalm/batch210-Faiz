package com.xsis.day06;

class A {
    String a = null;
    void doA() {
        System.out.println("A says " + a);
    }
}
class B extends A {
    String b = null;
    void doB() {
        System.out.println("B Says " + b);
        System.out.println("B Said " + a);

    }
}
class C extends B {
    String c = null;
    void doA() {
        System.out.println("Who cares what A says");
    }
    void doB() {
        System.out.println("Who cares what B says");
    }
    void doC() {
        System.out.println("C says " + a + " " + b + " " + c);
    }
}
public class ABCDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.a = "AAA";
        b.a = "B's A";
        b.b = "BBB";
        c.a = "Who cares";
        c.b = "Whatever";
        c.c = "CCC";

        a.doA();
        b.doB();
        c.doA();
        c.doB();
        c.doC();
    }
}
