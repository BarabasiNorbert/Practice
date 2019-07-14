package org.fasttrackit;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {
            System.out.println("What is your age? ");
            int age = s.nextInt();
            if (age > 15) {
                System.out.println(" You are old enough to legally drive. ");

            } else {
                System.out.println(" You are not old enough to legally drive. ");
            }

        } catch (Exception e){

        }


    }
}
