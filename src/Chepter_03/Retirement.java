package Chepter_03;

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much money do you need to retire");
        double goal = in.nextDouble();
        System.out.println("How much money do you want to contribute");
        double payment = in.nextDouble();
        System.out.println("enter percent in %");
        double interest = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal) {
            balance += payment;
            balance += balance * interest;
            years++;
        }
        System.out.println(years);
    }
}
