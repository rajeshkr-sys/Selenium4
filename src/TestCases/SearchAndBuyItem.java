package TestCases;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SearchAndBuyItem {
	
	
	boolean flag = false; //this flag can be read from external sources
	@Test(priority = 1)
	public void searchItem(ITestContext context) {
		if(flag)
			throw new SkipException("Skipping Test");
		System.out.println("Searching for a Pet");
		context.setAttribute("itemName", "Gold Fish");
	}
	
//If the searchItem test fails or is skipped then it doesnt make sense to execute the next 2 test cases.
	//So we will have to introduce dependency
	
	@Test(priority = 2, dependsOnMethods = {"searchItem"})
	public void selectItem(ITestContext context) {
		String name = (String)context.getAttribute("itemName"); //getAttribute returns an object. So its type casted to a String
		//This way we can share data between tests in the same Java file. For tests in different Java files its a bit different
		
		System.out.println("Selecting a Pet " + name);
		Assert.fail();
	}
	
	@Test(priority = 3, dependsOnMethods = {"searchItem", "selectItem"})
	public void checkoutItem() {
		System.out.println("Checking out the Pet");
	}

	

}
