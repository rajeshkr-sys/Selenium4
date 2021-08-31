package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataProvider.TestDataProvider;
import DataProvider.TestDataProvider1;

public class LoginTest4{
	
	
	@Test(dataProviderClass = TestDataProvider1.class, dataProvider = "getData")
	public void loginUser(String browser, String userType, String userId, String password) {
		System.out.println("Browser: " + browser);
		System.out.println("User Type: " + userType);
		System.out.println("User Id: " + userId);
		System.out.println("Password: " + password);
	}
	
	@Test(dataProviderClass = TestDataProvider1.class, dataProvider = "getData")
	public void deleteUser(String browser, String userType, String userId, String password) {
		System.out.println("Browser: " + browser);
		System.out.println("User Type: " + userType);
		System.out.println("User Id: " + userId);
		System.out.println("Password: " + password);
	}
	
	

}


