package tc;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(dataProvider="myFunction")
	public void testCaseLogin(String uName, String pwd, String brw){
		System.out.println("Executing Sampe Test... ::testCaseLogin");
	}
	
	@DataProvider
	Object[][] myFunction(){
		Object[][] dt = new Object[2][3];
		// 1st Row
		dt[0][0] = "User1";
		dt[0][1] = "Password1";
		dt[0][2] = "Mozilla";
		
		// 2nd Row
		dt[1][0] = "User2";
		dt[1][1] = "Password2";
		dt[1][2] = "Chrome";
		
		return dt;		
	}
	
}
