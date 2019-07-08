package org.fasttrackit;

import java.util.Scanner;

    public class CharacterCounter {

        public void countCharacters(){
            Scanner scanner = new Scanner (System.in);

            System.out.print (" Enter a String: ");
            String word =  scanner.next();
            int length = word.length();
            System.out.println(word + " has " + length + " characters.");


        }

        public static void execute(){
            CharacterCounter counter = new CharacterCounter();
            counter.countCharacters();
        }



}