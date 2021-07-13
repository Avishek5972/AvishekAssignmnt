package exceptionHandling;

import java.io.*;
public class UseScoreException {
	 public static void main(String[] args)throws IOException {
		 InputStreamReader read = new InputStreamReader(System.in);
		 BufferedReader br = new BufferedReader(read);

	       double score;
	       String choice;
	      
	       while(true)
	       {
	           try {
	        	   System.out.println("Enter a test score (between 0 and 100): ");
	        	   score=Double.parseDouble(br.readLine());
	               if(score < 0 || score > 100)
	                   throw new ScoreException("The score must be >= 0 and < = 100");
	               else
	               {
	            	   System.out.println("That is a valid score");
	               }
	              
	           }
	           catch(ScoreException e)
	           {
	        	   System.out.println(e.getMessage());
	           }
	           catch(NumberFormatException e)
	           {
	        	   System.out.println("You must enter a number for the score!");
	           }
	          
	           finally {
	        	   System.out.println("Do you want to enter another score?");
	        	   choice=br.readLine();
	               if(!(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")))
	                   break;
	           }
	       }
	   }

}
