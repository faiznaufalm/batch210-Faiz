package com.xsis.quiz06;

import java.util.*;

public class compareNumbers {

    void compareNumbers(Scanner sc){
        System.out.println("Enter a numbers, (-99 to quit): ");
        List<Integer> number = new ArrayList<>();
        int n;
        while ((n = sc.nextInt()) != -99) { //loop until -99 is entered
            number.add(n);
        }
        System.out.println("Largest number : " + Collections.max(number));
        System.out.println("Smallest number : " + Collections.min(number));
        sc.close();
    }

}
