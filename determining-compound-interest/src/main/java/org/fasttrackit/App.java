package org.fasttrackit;

import java.util.Scanner;

// double rate = s.nextDouble () / 100;

public class App {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        double principal = s.nextDouble();
        System.out.print("What is the interest rate? ");
        double rate = s.nextDouble () / 100;
        System.out.print("What is the number of years ? ");
        double years = s.nextDouble();
        System.out.print("What is the number of times the interest is compounded per year? ");
        double numberOfCompoundingsPerYears = s.nextDouble();
        double amount = simpleIntrest(principal, rate, years, numberOfCompoundingsPerYears);

        System.out.println(+ principal + " invested at " + rate+  " percent for " + years + " years compounded " + numberOfCompoundingsPerYears + " times per year is " + amount);

    }

    public static double simpleIntrest(double principle, double rate, double years, double numberOfCompoundPerYears) {
        double amount = 0;
        for (int i = 0; i < numberOfCompoundPerYears; i++) {
            amount =  (principle * Math.pow((1 + rate / numberOfCompoundPerYears), numberOfCompoundPerYears * years));

        }
        return amount;
    }
}





