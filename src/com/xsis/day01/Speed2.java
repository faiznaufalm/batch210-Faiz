package com.xsis.day01;

public class Speed2 {
    public static  void main (String[] args) {
        Speed2 Speed = new Speed2();
        int s = Speed.getSpeed(2,50);
        System.out.println(s);

    }
    public int getSpeed(int t, int v){
        return t*v;
    }


}