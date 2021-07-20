package javaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Formatter;

public class StudentPoll {

   public static void main(String[] args) {

       File file = new File("numbers.txt");
       int[] freq = new int[6];
       int[] responses = new int[100000];
       int i = 0;

       try {
           Formatter output = new Formatter("output.txt");

           Scanner sc = new Scanner(file);
           while (sc.hasNextLine()) {
               String nextIntString = sc.nextLine();
               int n = Integer.parseInt(nextIntString);
               responses[i] = n;
               i++;
           }

           for (int answer = 0; answer < responses.length; answer++) {
               try {
                   ++freq[responses[answer]];
               } catch (ArrayIndexOutOfBoundsException e) {

                   System.out.println(e);
                   System.out.println("responses["+answer+"] = "+responses[answer]);
               }
           }

           output.format("%s%10s%n", "Rating", "freq");

           for (int rating = 1; rating < freq.length; rating++)
               output.format("%6d%10d%n", rating, freq[rating]);

           sc.close();
           output.close();

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
   }
}