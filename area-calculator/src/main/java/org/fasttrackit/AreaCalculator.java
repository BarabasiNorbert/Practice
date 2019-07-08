package org.fasttrackit;

import java.util.Scanner;

public class AreaCalculator {

    public double length;
    public double width;
    public double area;
    public double areaInMeters;
    public static final double FEET_TO_METERS = .09290304;

    private AreaCalculator(){
        area = 0;
        areaInMeters = 0;
        prompt();
    }

    public AreaCalculator(double length, double width){
            this.length = length;
            this.width = width;
            area = 0;
            areaInMeters = 0;
    }

        public void prompt() {
            Scanner s = new Scanner(System.in);

            System.out.println("What is the length of the room in feet: ");
            length = s.nextDouble();
            System.out.println("What is the width of the room in feet: ");
            width = s.nextDouble();
            System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
    }

          public void convert() {
          area = length * width;
          areaInMeters = area * FEET_TO_METERS;
          System.out.println("The area is:");
          System.out.printf("%.3f square feet %n", area);
          System.out.printf("%.3f square meters %n", areaInMeters);

    }


            public void print(String message){
                System.out.println(message);
            }

            public String getArea(){
                return String.format("%.3f square feet", area);
            }

            public String getAreaInMeters(){
                return String.format("%.3f square meters",areaInMeters);
            }

            public static void execute() {
                AreaCalculator calc = new AreaCalculator();
                calc.convert();
    }



}

