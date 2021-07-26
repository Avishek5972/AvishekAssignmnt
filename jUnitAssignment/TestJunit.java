package jUnitAssignment;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Before;

public class TestJunit {
	String message;
	
	@Before
	public void Before()
	{
		message="Hello World";
	}
	
    	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
	   System.out.println("check message = "+message);
      assertEquals(message,messageUtil.printMessage());
   }
   @Test
   public void testPrintMsg() {
      message = "New Word";
      System.out.println("check message = "+message);
      assertEquals(message,messageUtil.printMessage());
   }
   @Test
   public void testPrintNeg() {
      message = "First Junit Experience";
      System.out.println("check message = "+message);
      assertFalse(message.equals(messageUtil.printMessage()));
   }
}