package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Validation {

	@Test
	public void validate() {
		
		SoftAssert softAssert = new SoftAssert();
		
		String expectedResult = "XYZ"; 
		String actualResult = "ABC";
		
		softAssert.assertEquals("ABC", "ABC");
		softAssert.assertEquals("ABC", "XYZ");
		softAssert.assertTrue(5>10, " First Number not greater than 10");
		softAssert.fail("Some 404 Error");
		
		//If you run the test now only the first soft assertion will run. To run all soft assertions write the line below.
		
		softAssert.assertAll();
		
		
	}
}
