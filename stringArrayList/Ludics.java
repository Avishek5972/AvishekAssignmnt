package stringArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ludics {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of the number");
		int num = sc.nextInt();
		List<Integer> ludiclist = new ArrayList<Integer>(num);
        for (int i = 1; i <= num; i++)
            ludiclist.add(i);
        for (int i = 1; i < ludiclist.size(); i++) {

            int first_ludic = ludiclist.get(i);

            int remove_index = i + first_ludic;
            while (remove_index < ludiclist.size()) {

                ludiclist.remove(remove_index);

                remove_index = remove_index + first_ludic - 1;
            }
        }
		System.out.println(ludiclist);

	}

}
