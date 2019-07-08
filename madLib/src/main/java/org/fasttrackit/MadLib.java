package org.fasttrackit;

import java.util.Scanner;

public class MadLib {
    private void writeMadLib(){
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a noun: ");
        String noun = s.next();
        System.out.print("Enter a verb: ");
        String verb = s.next();
        System.out.print("Enter an adjective: ");
        String adjective = s.next();
        System.out.print("Enter an adverb: ");
        String adverb = s.next();
        String storyTemplate = "Do you %s your %s %s %s? That's hilarious!";
        System.out.print(String.format(storyTemplate, verb, adjective,noun, adverb));
    }

    public static void execute(){
        MadLib ml = new MadLib();
        ml.writeMadLib();
    }


}