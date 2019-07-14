package org.fasttrackit;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class App{

    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, " January.");
        map.put(2, " February.");
        map.put(3, " March.");
        map.put(4, " April.");
        map.put(5, " May.");
        map.put(6, " June.");
        map.put(7, " July.");
        map.put(8, " August.");
        map.put(9, " September.");
        map.put(10, " October.");
        map.put(11, " November.");
        map.put(12, " December.");

        System.out.println(" Please enter the number of the month: ");
        int num = s.nextInt();

        System.out.println(" The name of the next month is " + map.get(num));

    }





}
