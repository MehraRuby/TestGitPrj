package mypack;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test  // Test interface
	public void testIsEven()
	{
		App obj = new App();
		assertTrue(obj.isEven(10));			
	}
	
	@Test 
	public void testString()
	{
		App obj = new App();	
		 assertEquals("Strings are equals",obj.check("Java","Java"));		
	}
	
	@Test
	public void testArrays()
	{
	String expectedoutput[] = {"aaaa","bbbb","cccc"};
	
	String resultoutput[] = {"aaaa","bbbb","cccc"};
	
	assertArrayEquals(expectedoutput,resultoutput);
	
	}
}
