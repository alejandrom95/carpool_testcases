package testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateRideTC {
	private WebDriver driver;
	private String email;
	private String password;
	private WebElement currentElement = null;
	private Alert simpleAlert = null;
	
	public CreateRideTC(WebDriver d, String e, String p) {
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
		WebElement createMenuToggle = driver.findElement(By.id("side-menu-button-create-toggle"));
		createMenuToggle.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement radioCreateRequest = driver.findElement(By.id("radio-request-label"));
		radioCreateRequest.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement createOrigin = driver.findElement(By.id("create-box-origin-input"));
		createOrigin.sendKeys("long beach");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		createOrigin.sendKeys(Keys.DOWN);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		createOrigin.sendKeys(Keys.RETURN);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement createDestination = driver.findElement(By.id("create-box-destination-input"));
		createDestination.sendKeys("csulb");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		createDestination.sendKeys(Keys.DOWN);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		createDestination.sendKeys(Keys.RETURN);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement createDate = driver.findElement(By.id("date-create-origin"));
		createDate.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		createDate.sendKeys(Keys.RETURN);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement createTimeMin = driver.findElement(By.id("timepicker-create-minimum"));
		createTimeMin.click();
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
		WebElement createTimeMax = driver.findElement(By.id("timepicker-create-maximum"));
		createTimeMax.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys(Keys.UP);
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
		WebElement createSubmit = driver.findElement(By.id("submit-create-inputs"));
		createSubmit.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Test: Create Ride: Success");
	}
}
