package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login2 {
	
	@Test
	public void login() {
		
		String expectedResult = "XYZ"; //this usually comes from external file
		String actualResult = "ABC"; //comes from the application
		
		//1.
		//Assert.assertEquals(actualResult, expectedResult);
		
		//2
		//Assert.assertTrue(5>2, "First Number if not greater than second number"); //---Test Passes. Msg is not printed
		//2.1
		//Assert.assertTrue(5>7, "First Number if not greater than second number"); //--- Test Fails. Msg is printed. This error message comes up in the reports
		//Can pass a function (like isElementPresent) too in place of 5>7. The function boolean return value will determine the outcome
		
		//3
		//Assert.fail(); //will simply fail the test case
		//3.1
		//Assert.fail("Failed Because of 404 error"); //fail with an error
		//3.2
		System.out.println("--------------------A-----------------"); //This gets printed
		Assert.fail("Failed Because of 404 error");
		System.out.println("------------------------B------------------"); //This doesn't get printed
		//An assertion failure will stop test execution on that line which contains assertion. 
		//Not just Assert.fail but also Assert.assertEquals and any other assertion
		
		//This is a problem because most of the time we might get errors or failures in the test cases which we then
		//want to report but move ahead with test execution and not stop
		
		//So for this purpose we use Soft Assertions. The ones above are hard assertions
		
	}

}
