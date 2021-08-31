package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest1 {

	
	@BeforeTest
	public void init() {
		System.out.println("------------Before Test-----------------------");
		//You can write code for launching the browser here
	}
	
	@AfterTest
	public void quit() {
		System.out.println("------------After Test-----------------------");
		//You can write code for closing or quitting the browser here
	}
	
	@BeforeMethod
	public void beforeMeth() {
		System.out.println("------------Before Method-----------------------");
		//You can initialize reports here
	}
	
	@AfterMethod
	public void afterMeth() {
		System.out.println("------------After Method-----------------------");
		//You can finalize reports here
		
	}
	@Test
	public void login() {
		System.out.println("In Login");
		String expected = "ABC";
		String actual = "ABC";
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void logout() {
		System.out.println("Logging Out");
	}
}

/* Executing the above code will give you this result
 * ------------Before Test-----------------------
------------Before Method-----------------------
In Login
------------After Method-----------------------
------------Before Method-----------------------
Logging Out
------------After Method-----------------------
------------After Test-----------------------
 */
