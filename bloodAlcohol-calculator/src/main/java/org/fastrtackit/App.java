package org.fastrtackit;

import java.util.Scanner;
// 10  176  0.73  9 - not legal
// 8   176  0.73  9 - legal

public class App {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {

            System.out.print(" Enter A , A is total alcohol consumed, in ounces (oz). ");
            double A = s.nextDouble();
            System.out.print(" Enter W , W is body weight in pounds. ");
            double W = s.nextDouble();
            System.out.print(" Enter r, r is alcohol distrubution ratio : men - 0.73 and women - 0.66. ");
            double r = s.nextDouble();
            System.out.print(" Enter H, H is number of hours since last drink. ");
            double H = s.nextDouble();


            double BAC = Math.round(BAC(A, W, r, H) * 100.0) / 100.0;
            System.out.println(" Your BAC is " + BAC);


            if (BAC >= .08) {
                System.out.println(" It is not legal for you to drive. ");
            } else {
                System.out.println(" It is legal for you to drive. ");
            }
        }
        catch (Exception e){
            System.err.println(" Enter only numeric values! ");
        }




    }

    private static double BAC(double A, double W, double r, double H) {
        return (A * 5.14 / W * r) - .015 * H;

    }



}


