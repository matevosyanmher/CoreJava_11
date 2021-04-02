package Chepter_03;

import java.util.Scanner;

public class Retirement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much money do you need to retire");
        double goal = in.nextDouble();
        System.out.println("How much money do you want to contribute");
        double payment = in.nextDouble();
        System.out.println("enter percent in %");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;
        String answer;
        do {
            balance += payment;
            double interest = balance * interestRate;
            balance += interest;
            years++;
            System.out.printf("After year %d your balance is %,2.0f, do you want to retire (Y/N)", years, balance);
            answer = in.next();
        } while (answer.equals("N"));

    }
}
