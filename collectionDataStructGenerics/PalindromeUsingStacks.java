package collectionDataStructGenerics;

import java.util.Scanner;
public class PalindromeUsingStacks {
	static char []stack;
	static int upMostEle = -1;
	 
	static void push(char ele)
	{
	    stack[++upMostEle] = ele;
	}
	 
	static char pop()
	{
	    return stack[upMostEle--];
	}
	 
	static int isPalindrome(char str[])
	{
	    int len = str.length;
	 
	    stack = new char[len * 4];
	 
	    int i, mid = len / 2;
	 
	    for (i = 0; i < mid; i++)
	    {
	        push(str[i]);
	    }
	 
	    if (len % 2 != 0)
	    {
	        i++;
	    }
	 
	    while (i < len)
	    {
	        char ele = pop();
	 
	        if (ele != str[i])
	            return 0;
	        i++;
	    }
	 
	    return 1;
	}
	 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String that you wish to check ");
		String input = sc.next();
	    char str[] = input.toCharArray();
	 
	    if (isPalindrome(str) == 1)
	    {
	        System.out.println("Yes");
	    }
	    else
	    {
	        System.out.println("No");
	    }
	}

}
