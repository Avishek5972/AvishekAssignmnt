package OOP;

import java.util.Scanner;

public class Q1Larger {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first integer");
		int numone = sc.nextInt();
		System.out.println("Enter the second integer");
		int numtwo = sc.nextInt();
		if (numone > numtwo)
			System.out.println(numone + " is larger");
		else if (numtwo > numone)
			System.out.println(numtwo + " is larger");
		else
			System.out.println("These numbers are equal");
	}

}