package stringArrayList;

import java.util.Scanner;
public class StringToHexa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
        String hex = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int in = (int)ch;
            String part = Integer.toHexString(in);
            hex += part;
        }
       System.out.println(hex);
	}

}
