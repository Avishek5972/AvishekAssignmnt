package javaIO;

import java.util.Scanner;
import java.util.Formatter;

public class Survey {

   public static void main(String[] args) {

       int num;
       try {
           Formatter fm = new Formatter("numbers.txt");
           Scanner scanner = new Scanner(System.in);

           System.out.println("Enter numbers(0 to stop)");

           while ((num = scanner.nextInt()) > 0) {
               fm.format("%d\n", num);
           }

           fm.close();
       } catch (Exception e) {
           e.printStackTrace();
       }

   } // end main

} // end class