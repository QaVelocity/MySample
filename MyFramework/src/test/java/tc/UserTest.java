package tc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest {

	@Test(dependsOnMethods="register")
	public void login(){
		
		System.out.println("I am in Login Test...");
	}
	
	@Test()
	public void register(){
		System.out.println("Executing UserTest");
		System.out.println("I am in Register User Test...");
		
		String expected = "byee";
		String actual = "Hello";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(dependsOnMethods="login")
	public void password(){
		
		System.out.println("I am in Change Password Test...");
			
	}
	
}
