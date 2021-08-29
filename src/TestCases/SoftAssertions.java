package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
	@Test
	public void validate() {
		
	SoftAssert softAssert = new SoftAssert();
	
	String expectedResult = "XYZ";
	String actualResult = "ABC";
	
	softAssert.assertEquals("ABC", "ABC");
	softAssert.assertEquals("ABC", "XYZ");
	softAssert.assertEquals(actualResult, expectedResult);
	softAssert.assertTrue(5>10, "Some Message");
	softAssert.fail("Some Error");
	
	softAssert.assertAll();
	
	}

}
