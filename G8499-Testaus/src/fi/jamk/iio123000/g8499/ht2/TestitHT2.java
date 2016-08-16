package fi.jamk.iio123000.g8499.ht2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestitHT2 {
		
	   String msg = "Testaus on kivaa!";
	   int maxValue = 2023;
	   int minValue = 0;
	   
	   // Create new instance of class HelloHT2 and run tests on it
	   HelloHT2 hello = new HelloHT2();

	   // Test return value of a member function
	   @Test
	   public void testStringvalue() {	  
	      assertEquals(msg,hello.print());
	   }
	   
	   // Test variables for correct ranges
	   @Test
	   public void testRanges() {
		   assertTrue(hello.korkeus1 >= minValue && hello.korkeus1 <= maxValue);
		   assertTrue(hello.korkeus2 >= minValue && hello.korkeus2 <= maxValue);
	   }
	   
	   // Test Object for null value
	   @Test
	   public void testNullTrue() {
		   assertNull(hello.getHello2());
	   }
	   
	   // Test that instances reference into same object
	   @Test
	   public void testReference() {
		   assertSame(hello.getHello(), hello.getHello3());
	   }
	   
	   // Test variables for correct type. E.g. input is integer or string
	   @Test
	   public void testIsString() throws Exception {
		   if(hello.getTestaus().getClass().equals(String.class) == false){
			   throw new Exception();
		   }
	   }
}
