package DataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider2 {
	
	@DataProvider
	public static Object[][] getData(Method m){
		System.out.println(" Method / Test " + m.getName());
		Object[][] data = null;
		if(m.getName().equals("loginUser")) {
		data = new Object[3][4];
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

		}
		else if(m.getName().equals("deleteUser")) {
			data = new Object[3][2];
			//row 1

			data[0][0] = "admin_1234";
			data[0][1] = "login123";
			
			//row 2

			data[1][0] = "mkt_1234";
			data[1][1] = "login123";
			
			//row 3

			data[2][0] = "sales_1234";
			data[2][1] = "login123";
		}
		
		return data;
	}

}

//Can we use another method like getData() for some tests? 
//How do we handle if we use the same getData() method but return, say, a single dimension array?
//we can have multiple data providers in a single data provider file. How do we do this?
