package org.fastrackit;

import java.util.Scanner;

public class App {

    public static void main(String[] arg) {

        Scanner s = new Scanner(System.in);

        System.out.println(" What is your weight in pounds ? ");
        double weight = s.nextDouble();
        System.out.println("What is your height in inches ? ");
        double height = s.nextDouble();


        double BMI = BMI(weight, height);
        System.out.println("Your BMI is " + BMI);


        if (BMI < 18.5) {
            System.out.println("Underweight. you should see a doctor! ");
        } else if (BMI >= 18.5 && BMI <= 25) {
            System.out.println("You are within the ideal weight range.");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println(" Overweight. You should see a doctor !");
        } else {
            System.out.println(" Obesity. You should see a doctor! ");
    }

}

    static double BMI (double weight, double height){
        return (weight/(height*height))*703;
    }


}
