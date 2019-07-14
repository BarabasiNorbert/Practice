package org.fasttrackit;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Is your car silent when you turn the key (y or n)?");
        String input1 = s.next();

        if (input1.equals("n")) {
            System.out.println("Does the car make a clicking noise? ");
            String input3 = s.next();

            if (input3.equals("y")) {
                System.out.println("Replace the battery.");
            }
            if (input3.equals("n")) {
                System.out.println("Does the car crank up but fail to start?");
                String input4 = s.next();

                if (input4.equals("y")) {
                    System.out.println("Check spark plug connections.");
                }
                if (input4.equals("n")){
                    System.out.println("Does the engine start and then die? ");
                    String input5 = s.next();

                    if (input5.equals("y")){
                        System.out.println("Does your car have fuel injection?");
                        String input6 = s.next();

                        if (input6.equals("y")){
                            System.out.println("Get in for service.");
                        }
                        else if (input6.equals(("n"))){
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }


                    }


                }


            }


            }

            if (input1.equals("y")) {
                System.out.println("Are your battery terminals corroded? ");
                String input2 = s.next();

                if (input2.equals("y")) {
                    System.out.println("Clean terminals and try starting again.");

                } else if (input2.equals("n")) {
                    System.out.println("Replace cables and try  again.");

                }

            }

    }
}