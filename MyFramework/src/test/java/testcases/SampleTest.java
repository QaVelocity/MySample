package testcases;

import org.testng.annotations.Test;

public class SampleTest {

	
	@Test(priority=1)
	public void testCase_C(){
		
		System.out.println("I m in testcase C");
	}
	
	
	@Test(priority=2)
	public void testCase_B(){
		
		System.out.println("I m in testcase B");
	}
	
	@Test(priority=3)
	public void testCase_A(){
		
		System.out.println("I m in testcase A");
	}
	
	
}
