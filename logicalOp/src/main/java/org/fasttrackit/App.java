package org.fasttrackit;

import java.util.Scanner;

public class App {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {


        int a;
        int b = 100;
        System.out.print("(Exercise 1.Count to 100). Count from: ");
        a = s.nextInt();

        System.out.print("Counted to 100: ");
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
//
        int c;
        int d = -100;
        System.out.print("(Exercise 2.Count to -100). Count from: ");
        c = s.nextInt();

        System.out.print("Counted to -100: ");
        for (int i = c; i >= d; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
//

        int x, y;
        System.out.print("(Exercise 3/4. From x to y, from y to x ascending ). Enter x :");
        x = s.nextInt();

        System.out.print("Enter y: ");
        y = s.nextInt();
        if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i + "");
            }
        } else {
            for (int i = y; i <= x; i++) {
                System.out.println(i + "");
            }
        }
        System.out.println("");
//

        int limit = 100;
        System.out.print("(Exercise 5.) Show even numbers up to " + limit + " : ");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
//

        int anotherLimit = 100;
        System.out.print("(Exercise 6,) Show odd numbers up to " + anotherLimit + " : ");
        for (int i = 1; i <= anotherLimit; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
//

        int t;
        int p = 100;
        int total = 0;
        System.out.print("(Exercise 7.) Enter a number smaller than 100 : ");
        t = s.nextInt();

        System.out.print("Count to 100: ");
        for (int i = t; i <= p; i++) {
            System.out.println(i + " ");
            total += i;
        }
        System.out.println("");
        System.out.println("The sum is: " + total);
//
        double u;
        double average = 0;
        double q = 100;
        double sum = 0;
        System.out.print("(Exercise 8.) Enter a number smaller than 100 : ");
        u = s.nextInt();

        System.out.print("Count to 100: ");
        for (double i = u; i <= q; i++) {
            System.out.println(i + " ");
            sum += i;

        average = sum / ( 101 - u );
        }
        System.out.println("");
        System.out.println("The sum is: " + sum);
        System.out.println("the average is: " + average);
        System.out.println("");
//

        System.out.println("(Exercise 9. Print: ******* )");

        for (int i = 0; i < 80; i++) {
            if (i % 16 == 0)

                System.out.print(" *******                 \r");
            else if (i % 16 == 1)
                System.out.print(" ******                  \r");
            else if (i % 16 == 2)
                System.out.print(" *****                   \r");
            else if (i % 16 == 3)
                System.out.print(" ****                    \r");
            else if (i % 16 == 4)
                System.out.print(" ***                     \r");
            else if (i % 16 == 5)
                System.out.print(" **                      \r");
            else if (i % 16 == 6)
                System.out.print(" *                       \r");


            Thread.sleep(500);
        }

    }
}





