package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataProvider.TestDataProvider;

public class LoginTest3{
	
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "getData")
	public void loginUser(String browser, String userType, String userId, String password) {
		System.out.println("Browser: " + browser);
		System.out.println("User Type: " + userType);
		System.out.println("User Id: " + userId);
		System.out.println("Password: " + password);
	}
	
	

}
//Step 1
//since the data provider is moved to a different package and class we can remove the data provider here
//Step 2
//Change the annotation line to refer the current data provider
//Step 3. Run the test. The data will be picked from the new dataprovider file this time
//Step 4: Say if we have one more test, deleteUser. How do we get data for this?