package org.fasttrackit;
import java.util.Scanner;

public class QuotePrinter {

        public void printQuote() {
            Scanner s = new Scanner(System.in);
            System.out.print("What is the quote? ");
            String quote = s.nextLine();
            System.out.print("Who said it?: ");
            String author = s.nextLine();
            System.out.println( author + " says, " + "\"" + quote + "." +  "\"" );
        }
        public static void execute(){
            QuotePrinter q = new QuotePrinter();
            q.printQuote();
        }





}