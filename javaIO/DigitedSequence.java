package javaIO;

import java.util.*;
import java.lang.*;
import java.io.*;
public class DigitedSequence{

	static Character[][] charSequence;

	private static List<String> getSequence(int[] numbers,
			int len,
			int numIndex,
			String s)
	{
		if(len == numIndex)
		{
			return new ArrayList<>(Collections.singleton(s));
		}

		List<String> stringList = new ArrayList<>();

		for(int i = 0;
				i < charSequence[numbers[numIndex]].length; i++)
		{
			String sCopy =
					String.copyValueOf(s.toCharArray());
			sCopy = sCopy.concat(
					charSequence[numbers[numIndex]][i].toString());
			stringList.addAll(getSequence(numbers, len,
					numIndex + 1,
					sCopy));
		}
		return stringList;
	}

	private static void printSequences(int[] numbers)throws Exception
	
	{
		assignCharValues();
		List<String> stringList =
				getSequence(numbers, numbers.length, 0, "");
		FileOutputStream fout=new FileOutputStream("output.txt");  
		   PrintStream pout=new PrintStream(fout);  
		   pout.println(1900);  
		   pout.println("Hello Java");  
		   for(String str : stringList)
		   {
			   pout.println(str);
		   }
		   pout.close();  
		   fout.close(); 
	}

	private static void assignCharValues()
	{
		charSequence = new Character[10][5];
		charSequence[0] = new Character[]{'\0'};
		charSequence[1] = new Character[]{'\0'};
		charSequence[2] = new Character[]{'a','b','c'};
		charSequence[3] = new Character[]{'d','e','f'};
		charSequence[4] = new Character[]{'g','h','i'};
		charSequence[5] = new Character[]{'j','k','l'};
		charSequence[6] = new Character[]{'m','n','o'};
		charSequence[7] = new Character[]{'p','r','s'};
		charSequence[8] = new Character[]{'t','u','v'};
		charSequence[9] = new Character[]{'w','x','y'};
	}

	public static void main(String[] args)throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int []numbers= new int[4];
		for(int i =0;i<4;i++){
			System.out.println("Enter a number");
			numbers[i]=sc.nextInt();
		}
		printSequences(numbers);
	}
}
