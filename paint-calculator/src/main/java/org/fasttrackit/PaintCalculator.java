package org.fasttrackit;

import java.util.Scanner;

//20 cu 18

public class PaintCalculator {
    private double length;
    private double width;
    private double gallons;
    private int gallonsRounded;
    private double area;
    private static final int GALLON_COVERAGE_IN_FEET = 350;

    private void askCeilingSize() {
        Scanner s = new Scanner(System.in);
        print("What is the length of your ceiling: ");
        length = s.nextDouble();
        print("What is the width of your ceiling: ");
        width = s.nextDouble();
    }

    private void calculateGallons() {
        area = length * width;
        gallons = area / GALLON_COVERAGE_IN_FEET;
        gallonsRounded = (int) Math.ceil(gallons);
    }

    private void printGallons() {
        print("You will need to purchase " + gallonsRounded + " gallons of paint to cover " +
                area + " square feet");
    }

    public double getGallons() {
        return gallonsRounded;
    }

    private void print(String message) {
        System.out.println(message);
    }

    public static void execute() {
        PaintCalculator calc = new PaintCalculator();
        calc.askCeilingSize();
        calc.calculateGallons();
        calc.printGallons();
    }
}
