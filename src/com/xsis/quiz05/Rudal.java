package com.xsis.quiz05;

public class Rudal {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 12 ; i++) {
            long startTime = System.currentTimeMillis();
            Thread.sleep(60);
            long f = fibo(i);
            long endTime = System.currentTimeMillis();
            float timeElapsed = (endTime - startTime) / 1000f;
            System.out.println("Rudal " + i + " = " + f + ", launch in : " + timeElapsed + " ms");
        }
    }
    static int fibo(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

}
