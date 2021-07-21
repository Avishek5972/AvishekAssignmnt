package collectionDataStructGenerics;

import java.util.*;
import java.io.*;
import java.math.*;
public class TowerOfHanoi
{
	static void twrOfHanoi(int n, char present_tower,
			char would_be_tower, char another_tower)
	{
		if (n == 1)
		{
			System.out.println("Move disk 1 from rod "+
					present_tower+" to rod "+would_be_tower);
			return;
		}
		twrOfHanoi(n - 1, present_tower, another_tower, would_be_tower);
		System.out.println("Move disk "+ n + " from rod " +
				present_tower +" to rod " + would_be_tower );
		twrOfHanoi(n - 1, another_tower, would_be_tower, present_tower);
	}

	public static void  main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		twrOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
	}
}