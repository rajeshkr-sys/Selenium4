package DataProvider;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider
	public static Object[][] getData(){ //Is making this static needed? It seems to be working even without it.
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
