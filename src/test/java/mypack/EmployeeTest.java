package mypack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {
	Object requiredoutput[] = new Object[4];
	
	@BeforeClass
	public static void beforeClassmethod() {
	System.out.println("Hi welcome in Before Class Method");
	}
	
	@Before
	public void initEmployee()
	{
		requiredoutput[0] = new Employee(1,"aa1",120);
		requiredoutput[1] = new Employee(2,"aa2",126);
		requiredoutput[2] = new Employee(3,"aa3",128);
		requiredoutput[3] = new Employee(4,"aa4",125);
				
	}
			
	@Test
	public void test() {
		Object resultval[] = Employee.records().toArray();
		assertArrayEquals(requiredoutput,resultval);
	}
	
	@After
	public void aftermethod() {
	System.out.println("Hi welcome in After Test Case");
	}
	
	@AfterClass
	public static void afterClassmethod() {
	System.out.println("Hi welcome in After Class");
	}
}
