package org.fasttrackit;

import java.util.Scanner;

//32-32

public class TemperatureConvertor {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(" Enter your values to convert: ");


        double tempCelsius = s.nextDouble();
            System.out.printf("The temperature of celsius in Fahrenheit is %f.1\n", toFahrenheit(tempCelsius));
        double tempFahrenheit = s.nextDouble();
            System.out.printf("The temperature of fahrenheit in Celsius is %f.1\n", toCelsius(tempFahrenheit));



    }


    public static double toFahrenheit(double tempCelsius) {
        return (tempCelsius * (9.0 / 5.0) + 32);

    }

    public static double toCelsius(double tempFahrenheit) {
        return (tempFahrenheit - 32 ) * (5.0/9.0);
    }
}