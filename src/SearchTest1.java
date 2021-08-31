import org.testng.annotations.Test;

//No main function when creating TestNG classes

public class SearchTest1 {
	
	@Test(priority = 1) //signifies that this is a test case
	public void Login() {
		System.out.println("Login Method");
	}
	
	@Test(priority = 2) //signifies that this is a test case
	public void Search() {
		System.out.println("Search Method");
	}
	
	@Test(priority = 3) //signifies that this is a test case
	public void Logout() {
		System.out.println("Logout Method");
	}
}
