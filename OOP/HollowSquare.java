package OOP;

import java.util.Scanner;
public class HollowSquare {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int side=0;
		while((side<1)||(side>20))
		{
			System.out.println("Enter the value for the side");
			side=sc.nextInt();
			if((side<1)||(side>20))
				System.out.println("wrong value for side, please try again");
		}
		for(int i = 1;i<=side;i++)
		{
			if((i==1)||(i==side))
			{
				for(int j = 1;j<=side;j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(int j = 1;j<=side;j++)
				{
					if((j==1)||(j==side))
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
