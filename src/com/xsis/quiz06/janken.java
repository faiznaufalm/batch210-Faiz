package com.xsis.quiz06;

public class janken {

    void janken(String user) {
        int comt = (int) (Math.random() * 3) + 1;
        String comp = "";

        if (comt == 1) {
            comp = "Rock";
        } else if (comt == 2) {
            comp = "Paper";
        } else if (comt == 3) {
            comp = "Scissors";
        }

        if (user.equals("R") || user.equals("r")) {
            System.out.println("You choose: Rock");
            user = "Rock";
        } else if (user.equals("P") || user.equals("p")) {
            System.out.println("You choose: Paper");
            user = "Paper";
        } else if (user.equals("S") || user.equals("s")) {
            System.out.println("You choos: Scissors");
            user = "Scissors";
        } else {
            System.out.println("invalid, defaulting to Rock");
            user = "Rock";
        }

        System.out.println("Computer chooses: " + comp);

        if (user.equals(comp)) {
            System.out.println("A tie!");
        } else if (user.equals("Rock")) {
            if (comp.equals("Scissors"))
                System.out.println("Rock beats scissor - you win!");
            else if (comp.equals("Paper"))
                System.out.println("Paper beats rock - you lose");
        } else if (user.equals("Paper")) {
            if (comp.equals("Scissors"))
                System.out.println("Scissors beats paper - you lose");
            else if (comp.equals("Rock"))
                System.out.println("Paper beats rock - you win");
        } else if (user.equals("Scissors")) {
            if (comp.equals("Paper"))
                System.out.println("Scissors beats paper - you win!");
            else if (comp.equals("Rock"))
                System.out.println("Rock beats scissors - you lose!");
        }
    }

}
