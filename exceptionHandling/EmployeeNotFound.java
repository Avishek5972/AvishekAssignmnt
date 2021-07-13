package exceptionHandling;

import java.util.Scanner;
public class EmployeeNotFound extends Exception{
	public EmployeeNotFound()
	   {
	       super();
	   }
	  
	   public EmployeeNotFound(String message)
	   {
	       super(message);
	   }
	   public static void main(String args[])
	   {
		   int count = 0;
		   String[] employees = {"Ramesh","Suresh","John","Elena","Marco","Pierre"};
		   Scanner sc = new Scanner (System.in);
		   System.out.println("Enter the name of the employee you want to find");
		   String searchstr=sc.nextLine();
		   try
		   {
			   for(int i =0;i<employees.length;i++)
			   {
				   if (employees[i].equals(searchstr));
				   		count++;
			   }
			   if(count==0)
				   throw new EmployeeNotFound();
		   }
		   catch(EmployeeNotFound emp)
		   {
			   System.out.println("Exception Employee not found error that is handled");
		   }
		   finally
		   {
			   if(count == 0)
			   {
				   System.out.println("Employee is not found");
			   }
			   else
			   {
				   System.out.println("Employee was found in the list");
			   }
		   }
	   }
}
