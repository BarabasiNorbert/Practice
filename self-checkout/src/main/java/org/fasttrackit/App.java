package org.fasttrackit;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of items you want to buy: ");
        int items = scanner.nextInt();
        double subTotal = 0;
        double taxAmount = 0;

        for (int i = 0; i < items; i++) {
            System.out.print("Enter the price: ");
            double number1 = scanner.nextDouble();
            System.out.print("Enter the quantity: ");
            double number2 = scanner.nextDouble();

            subTotal += number1 * number2;
        }
        double TAX_RATE = 5.5;
        taxAmount = subTotal * (TAX_RATE / 100);

        double total = taxAmount + subTotal;


        System.out.println("Subtotal:$ " + subTotal);
        System.out.println("TaxAmount:$ " + taxAmount);
        System.out.println("Total:$ " + total);
        System.err.println("Have a great day!");
        //add a second sale :)


    }
}