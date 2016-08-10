package fi.jamk.iio123000.g8499.rt6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestitRT6 {
	   String msg = "Testaus on kivaa!";
	   int maxValue = 2023;
	   int minValue = 0;
	   
	   HelloRT6 hello = new HelloRT6();

	   @Test
	   public void testStringvalue() {	  
	      assertEquals(msg,hello.print());
	   }
	   
	   @Test
	   public void testRanges() {
		   assertTrue(hello.arvo2 >= minValue && hello.arvo2 <= maxValue);
		   assertTrue(hello.arvo1 >= minValue && hello.arvo1 <= maxValue);
	   }
}
