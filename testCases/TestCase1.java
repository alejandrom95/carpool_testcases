package testCases;

import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		//Set up chrome web driver
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//set up unique dummy variables for test
		String uniqueValue = new SimpleDateFormat("yyyy-MM-dd.HH.mm.ss").format(new java.util.Date());
		String email = "email@" + uniqueValue;
		String password = "password" + uniqueValue;
		
		//Navigate to site (Important: Fill before test.)
		driver.get("");
		
		
		
//---------------------------------------------------------------------------------------
		//Create Account
//---------------------------------------------------------------------------------------
		System.out.println("Test: Create Account: Starting");
		CreateAccountTC tcCreateAccount = new CreateAccountTC(driver,email,password);
		
//---------------------------------------------------------------------------------------
		//Login
//---------------------------------------------------------------------------------------
		System.out.println("Test: Login: Starting");
		LoginTC tcLogin = new LoginTC(driver,email,password);

//---------------------------------------------------------------------------------------
		//Create Ride
//---------------------------------------------------------------------------------------
		System.out.println("Test: Create Ride: Starting");
		CreateRideTC tcCreateRide = new CreateRideTC(driver,email,password);
		
//---------------------------------------------------------------------------------------
		//Search for Ride
//---------------------------------------------------------------------------------------
		System.out.println("Test: Search Ride: Starting");
		SearchRideTC tcSearchRide = new SearchRideTC(driver,email,password);	
		
		
		driver.quit();
		
		

	}

}
