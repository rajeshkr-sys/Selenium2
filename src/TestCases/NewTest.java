package TestCases;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import DataProvider.TestDataProvider;
import DataProvider.TestDataProvider1;
import DataProvider.TestDataProvider2;

public class NewTest {
	
	  @Test(priority= 1, dataProviderClass= TestDataProvider2.class, dataProvider = "getData")
	  public void loginUser(String browser, String userType, String userId, String password) {
		  
		  System.out.println("Browser " + browser);
		  System.out.println("User Type " + userType);
		  System.out.println("User Id " + userId);
		  System.out.println("Password " + password);
	  }
	  
	  
	  @Test(priority = 2, dataProviderClass= TestDataProvider2.class, dataProvider = "getData")
	  public void deleteUser(String userId, String password) {
		  

		  System.out.println("User Id " + userId);
		  System.out.println("Password " + password);
	  }
	  
 
  
}


