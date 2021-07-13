package stringArrayList;

import java.util.Scanner;
public class SwappingWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		str=str.trim();
		//Picking the first word
		String fst = "";
		int i=0;
		for ( i = 0; i < str.length();) {
			 
            while (str.charAt(i) != ' ') {
                fst = fst + str.charAt(i);
                i++;
            }
 
            // After getting one Word
            break;
        }
		//Picking the last word by iterating from the back
		String last = "";
		int j = 0;
        for (j = str.length() - 1; j >= i;) {
 
            while (str.charAt(j) != ' ') {
                last = str.charAt(j)+last;
                j--;
            }
 
            break;
        }
        System.out.print(last);
        //printing the middle part in reverse order
        for (int k = j; k >= i; k--) {
        	 
            // Reversing the left characters
            System.out.print(str.charAt(k));
        }
        System.out.print(fst);

	}

}
