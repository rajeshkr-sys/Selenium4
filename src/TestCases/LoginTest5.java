package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataProvider.TestDataProvider;
import DataProvider.TestDataProvider1;
import DataProvider.TestDataProvider2;

public class LoginTest5{
	
	
	@Test(dataProviderClass = TestDataProvider2.class, dataProvider = "getData")
	public void loginUser(String browser, String userType, String userId, String password) {
		System.out.println("Browser: " + browser);
		System.out.println("User Type: " + userType);
		System.out.println("User Id: " + userId);
		System.out.println("Password: " + password);
	}
	
	@Test(dataProviderClass = TestDataProvider2.class, dataProvider = "getData")
	public void deleteUser(String userId, String password) {

		System.out.println("User Id: " + userId);
		System.out.println("Password: " + password);
	}
	
	

}

//Execute this. You will see the method or test calling the data provider is also getting printed. This is because of sysout
//we put in TestDataProvider1
