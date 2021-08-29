package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void login() {
		//1. Steps to login
		
		//2. Verification
		
		String expectedResult = "ABC"; //comes from outside the application
		String actualResult = "XYZ"; //comes from the application
		
		Assert.assertEquals(actualResult, expectedResult);
		
		//Assert.assertTrue(5>7, "First Number is Not Greater Than Second Number");
		
		//Assert.fail();
		
		//System.out.println("----------------A------------------------");
		//Assert.fail("Failed Because of a 404 Error");
		//System.out.println("----------------B------------------------");
	}

}


