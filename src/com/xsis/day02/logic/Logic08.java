package com.xsis.day02.logic;

public class Logic08 {
    public static void main(String[] args) {
        Logic08 lg = new Logic08();

        lg.logic08(7);

}

    public void logic08(int i) {
            int j = 3;
            for (int x = 0; x < i ; x++) {
                System.out.print(j+ " ");
                j = j * 3;
            }
        }
}
