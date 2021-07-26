package jUnitAssignment;

public class MessageUtil {
	private String message;

	   //Constructor
	   //@param message to be printed
		
	   public MessageUtil(String message){
	      this.message = message;
	   }
	      
	   // prints the message
	   public String printMessage(){
	      System.out.println("initial message = "+message);
	      return message;
	   }   


}
