package com.xsis.day07.abstrak;

public class EmployeeAbstrakDemo {
    public static void main(String[] args) {
        Staff st = new Staff("Sabo", "1334", "sabo@revarmy.com",1995,700.00);
        System.out.println(st.toString());
        System.out.println(st.getTotalGaji());
    }
}
