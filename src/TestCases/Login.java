package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before the Class Execution");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After the class execution");
	}
	@BeforeTest
	public void init() {
		
		System.out.println("-----------Before Test--------");
		
	}
	
	@AfterTest
	public void afterLogin() {
		
		System.out.println("-----------After Test--------");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("------------Before Method--------------");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("------------After Method------------");
	}
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("....................Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("....................After Suite");
	}
	
	@Test
	public void login() {
		System.out.println("Inside the Test, Logging Into the system");
		
	
	}
	
	@Test
	public void logout() {
		System.out.println("Inside the Test, Logging out");
	}

	
}




