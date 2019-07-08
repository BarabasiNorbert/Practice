package org.fasttrackit;

import java.util.Scanner;
public class App{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principle = scanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        double time = scanner.nextDouble();

        double worth = simpleIntrest(principle, time, rate);
        System.out.println("After " + time + " years at " + rate + ", the investment will"  +  " be worth " + worth);

    }

    private static double simpleIntrest(double principle, double time, double rate){
        return principle*(1+ ( rate / 100) * time);
    }


}
