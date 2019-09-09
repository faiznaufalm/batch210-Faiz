package com.xsis.quiz;

public class Logic09 {
    public static void main(String[] args) {
        Logic09 lg = new Logic09();
        int[] scores = {10, 9, 7, 10};

        lg.addScores(scores);

    }

    int addScores(int [] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++)
            sum += scores[i];
        System.out.println("Total skor = "+ sum);
        return sum;
    }
}
