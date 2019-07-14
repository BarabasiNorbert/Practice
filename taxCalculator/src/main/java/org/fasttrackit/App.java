package org.fasttrackit;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class App {

    public static void main(String[] args) {

        Map<String, Double> map;
        map = new HashMap<String, Double>();
        map.put("fl", 6.6);
        map.put("wi", 5.5);
        map.put("tx", 8.1);

        Scanner s = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double amount = s.nextDouble();
        System.out.print("What is the State? ");
        String state = s.next();
        state = state.toLowerCase();

        double tax = (map.get(state) / 100) * amount;
        double total = tax + amount;

        System.out.println("The subtotal is: $" + amount);
        System.out.println("The tax is: $" + tax);
        System.out.println("The total is: $" + total);
    }
}
