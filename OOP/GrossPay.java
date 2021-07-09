package OOP;

import java.util.Scanner;
public class GrossPay {
	public static void main(String args[])
	{
		int[] emp=new int[3];
		double[] strpay=new double[3];
		double[] hrrate=new double[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<3;i++)
		{
			System.out.println("Enter the time for employee number "+(i+1));
			emp[i]=sc.nextInt();
			System.out.println("Enter the straight pay for employee number "+(i+1));
			strpay[i]=sc.nextDouble();
			System.out.println("Enter the hourly rate for employee number "+(i+1));
			hrrate[i]=sc.nextDouble();
		}
		double[] grpay=new double[3];
		for(int i = 0;i<3;i++)
		{
			if(emp[i]>40)
				grpay[i]=strpay[i]+(((emp[i]-40)/1.5)*hrrate[i]);
			else
				grpay[i]=strpay[i];
		}
		for(int i = 0;i<3;i++)
		{
			System.out.println("Gross pay for employee number "+(i+1)+" is "+grpay[i]);
		}
		
	}

}
