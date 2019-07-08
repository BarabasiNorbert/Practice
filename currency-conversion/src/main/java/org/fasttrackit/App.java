package org.fasttrackit;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How may euros are you exchanging: ");
        double numberA = scanner.nextDouble();
        System.out.print("What s the exchange rate: ");
        double exchange = scanner.nextDouble();

        double numberB = numberA * exchange;

        System.out.println(numberA + " euros at an exchange rate of " + numberA + " is");
        System.out.println(numberB + " U.S. dollars.");


    }
}
