package org.fasttrackit;

import java.util.Scanner;
public class SimpleMath {
    public double number1;
    public double number2;

    private SimpleMath(){
        number1 = 0;
        number2 = 0;
    }

    public void convert(){
        Scanner s = new Scanner(System.in);
        System.out.print("What is the first number? ");
        number1 = Double.parseDouble(s.next());
        System.out.print("What is the second number? ");
        number2 = Double.parseDouble(s.next());
    }

    public void calculate(){
        double sum = number1 + number2;
        double subtr = number1 - number2;
        double mult = number1 * number2;
        double div = number1 / number2;
        print(sum,subtr,mult,div);
    }

    public void print(double sum, double subtr, double mult, double div){
        String template = number1 + " %s " + number2 + " = " + "%.2f";
        System.out.print(String.format(template,"+", sum ) + "\n" + String.format(template, "-", subtr) +
                "\n" + String.format(template, "*", mult) + "\n" + String.format(template, "/", div));
    }

    public static void execute(){
        SimpleMath calc = new SimpleMath();
        calc.convert();
        calc.calculate();
    }
}