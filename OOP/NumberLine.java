package OOP;

import java.util.Scanner;
public class NumberLine {

	public static void main(String[] args) {

		int[] num= new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<5;i++)
		{
			System.out.println("Enter the number");
			num[i]=sc.nextInt();
		}
		int countneg=0;
		int countpos=0;
		int countzero=0;
		for(int i =0;i<5;i++)
		{
			if(num[i]>0)
				countpos++;
			else if(num[i]<0)
				countneg++;
			else
				countzero++;
		}
		System.out.println("Number of positive integers = "+countpos);
		System.out.println("Number of negative integers = "+countneg);
		System.out.println("Number of zeroes = "+countzero);

	}

}
