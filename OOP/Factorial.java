package OOP;

public class Factorial {

	public static void main(String[] args) {
		long fact=1;
		for(int i =1;i<=20;i++)
		{
			fact*=i;
			System.out.println(i+"!  =  "+fact);
		}

	}

}
