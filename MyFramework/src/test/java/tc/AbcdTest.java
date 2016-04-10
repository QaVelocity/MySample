package tc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AbcdTest {

	@Test(priority=2)
	public void login(){
		
		System.out.println("I am in Login Test...");
	}
	
	@Test(priority=1)
	public void register(){
		
		System.out.println("I am in Register User Test...");
		String expected = "byee";
		String actual = "Hello";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority=3)
	public void password(){
		
		System.out.println("I am in Change Password Test...");
	}
	
}
