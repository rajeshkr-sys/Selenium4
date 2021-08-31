package tc.suiteb;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest2 {
	
	//Step 2
	@Test(dataProvider = "getData")
	public void loginUser(String browser, String userType, String userId, String password) {
		System.out.println("Browser: " + browser);
		System.out.println("User Type: " + userType);
		System.out.println("User Id: " + userId);
		System.out.println("Password: " + password);
	}
	
	
	
	//Step 1
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][4];
		//row 1
		data[0][0] = "Chrome";
		data[0][1] = "Admin";
		data[0][2] = "admin_1234";
		data[0][3] = "login123";
		
		//row 2
		data[1][0] = "Mozilla";
		data[1][1] = "Marketing";
		data[1][2] = "mkt_1234";
		data[1][3] = "login123";
		
		//row 3
		data[2][0] = "Edge";
		data[2][1] = "Sales";
		data[2][2] = "sales_1234";
		data[2][3] = "login123";
		
		return data;
		
	}

}
//Step 1
//Have to get more info about Data Provider
//TestNG automatically knows that the test needs to be executed 3 times (number of rows in the Object[][])
//The number of parameters of the @Test method should be equal to the number of columns in Object[][]

//Step 2
//We can separate Data Provider from the test file. This helps in keeping the data separate and also in keeping the data of all
//tests at one place
//Create a new Package (DataProvider) and create a new .java file TestDataProvider. Copy the whole @DataProvider into this new Java class

//Continue in LoginTest3
