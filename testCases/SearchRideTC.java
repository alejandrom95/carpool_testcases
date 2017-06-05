package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchRideTC {
	private WebDriver driver;
	private String email;
	private String password;
	private WebElement currentElement = null;
	
	public SearchRideTC(WebDriver d, String e, String p) {
		driver = d;
		email = e;
		password = p;
		run(driver,email,password);
	}
	
	private void run(WebDriver driver, String email, String password) {
		WebElement sideMenuToggle = driver.findElement(By.id("map-menu-button-image"));
		sideMenuToggle.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement searchMenuToggle = driver.findElement(By.id("side-menu-button-search-toggle"));
		searchMenuToggle.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement radioSearchRequested = driver.findElement(By.id("radio-requested-label"));
		radioSearchRequested.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement searchOrigin = driver.findElement(By.id("search-box-origin-input"));
		searchOrigin.sendKeys("long beach");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchOrigin.sendKeys(Keys.DOWN);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchOrigin.sendKeys(Keys.RETURN);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement searchDestination = driver.findElement(By.id("search-box-destination-input"));
		searchDestination.sendKeys("csulb");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchDestination.sendKeys(Keys.DOWN);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchDestination.sendKeys(Keys.RETURN);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement searchDate = driver.findElement(By.id("date-search-origin"));
		searchDate.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchDate.sendKeys(Keys.RETURN);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement searchTimeMin = driver.findElement(By.id("timepicker-search-minimum"));
		searchTimeMin.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys(Keys.RETURN);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement searchTimeMax = driver.findElement(By.id("timepicker-search-maximum"));
		searchTimeMax.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys(Keys.RETURN);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement searchSubmit = driver.findElement(By.id("submit-search-inputs"));
		searchSubmit.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Test: Search Ride: Success");
	}
}