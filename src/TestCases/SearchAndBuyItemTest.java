package TestCases;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SearchAndBuyItemTest {
	


	boolean flag = false;
	
	@Test(priority=1)
	public void searchItem(ITestContext context) {
		if (flag) {
				throw new SkipException("Skipping Test"); }
		System.out.println("Searching for a Pet");
		context.setAttribute("product", "Fish");
	}
	
	@Test(priority=2, dependsOnMethods = {"searchItem"})
	public void selectItem(ITestContext context) {
		
		String productName = (String)context.getAttribute("product");
		
		System.out.println("Selecting for a Pet " + productName);
		//Assert.fail();
	}
	
	@Test(priority=3, dependsOnMethods = {"searchItem", "selectItem"})
	public void checkoutItem() {
		System.out.println("Checking out a Pet");
	}
	
	
}




	