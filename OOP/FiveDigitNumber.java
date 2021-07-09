package OOP;
import java.util.Scanner;

public class FiveDigitNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a five digit number");
		int num= sc.nextInt();
		if((num>=10000)&&(num<=99999))
		{
			for(int i =4;i>=0;i--)
			{ 
				System.out.print(((int)(num/(Math.pow(10.0,i))))+"   ");
				num=((int)(num%(Math.pow(10.0,i))));
			}
				
		}
		else
			System.out.println("The number is not a five digit number");		

	}

}
