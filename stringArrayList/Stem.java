package stringArrayList;

import java.util.Scanner;
public class Stem {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of words");
		int lenarr=sc.nextInt();
		String stemword="";
		String refword="";
				String[] arr = new String[lenarr];
		for(int i = 0;i < lenarr; i++)
		{
			System.out.println("Enter the word");
			arr[i]=sc.next();
		}
		refword=arr[0];

		for (int i = 0; i < refword.length(); i++) {
			for (int j = i + 1; j <= refword.length(); j++) 
			{
				String stem = refword.substring(i, j);
				int k = 1;
				for (k = 1; k < lenarr; k++)
					if (!arr[k].contains(stem))
						break;
				if (k == lenarr && stemword.length() < stem.length())
					stemword = stem;
			}
		}
		System.out.println("The stem word is : "+stemword);
	}
}


