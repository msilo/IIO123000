package fi.jamk.iio123000.g8499.ht2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   
   public void testPrintMessage() {	  
      assertEquals(message,messageUtil.printMessage());
   }
}
