package OOP;

import java.util.Scanner;
public class Palindrome {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int num=0;
	while((num<10000)||(num>99999))
	{
		System.out.println("Please enter the number");
		num=sc.nextInt();
		if((num<10000)||(num>99999))
			System.out.println("Wrong number, please try again");
	}
	if((num/10000)==(num%10))
	{
		num=num%10000;
		num=num/10;
		if(((num/100)==(num%10)))
			System.out.println("It is a palindrome number");
		else
			System.out.println("It is not a palindrome number");
	}
	else
		System.out.println("It is not a palindrome number");
	
}

}
