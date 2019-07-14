package org.fasttrackit;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String Ausername = "Z";
        String Bpassword = "123";


        Scanner s = new Scanner(System.in);

        int count = 0 ;
        while (count != 1){
            System.out.print(" What is the Username? ");
            String username = s.next();
            System.out.print(" What is the Password? ");
            String password = s.next();

            if (username.equals(Ausername) && password.equals(Bpassword)){
                System.out.println(" Wellcome! ");
                count = 1;



            } else System.out.println(" I don t know you. ");

            }


        }

    }
