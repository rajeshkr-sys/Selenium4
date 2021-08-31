package tc.suitea;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	
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
	
	
	
	@Test
	public void login() {
		System.out.println("In Login");
		String expected = "ABC";
		String actual = "ABC";
		Assert.assertEquals(expected, actual);
		
	}
}

/*
1. @BeforeTest will execute before all the @Test and @AfterTest after all the @Test in the file. Whether the @Test passes or fails 
or skips doesnt matter(show thru assertions Assert.fail()) the @BeforeTest and @AfterTest will always run
2. Lets change the code to add one more test and see. Add the code below and run the java file again
	@Test
	public void logout() {
		System.out.println("Logging Out");
	}

*/