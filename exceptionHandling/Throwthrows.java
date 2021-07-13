package exceptionHandling;

import java.io.*;
public class Throwthrows {
	public static void sample(int num)throws IOException, ClassNotFoundException
	{
		if(num==1)
	        throw new IOException("IOException Occurred");
	     else
	        throw new ClassNotFoundException("ClassNotFoundException");
	}
	public static String strRead()throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(read);
		System.out.println("Enter any String");
		String str = br.readLine();
		return str;
	}
	public static void main(String args[])
	{
		try{ 
			String str=strRead();
			System.out.println("Your string is - "+str);
		   }catch(Exception e){
		     System.out.println(e);
		    } 
		try
		{
			sample(1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
