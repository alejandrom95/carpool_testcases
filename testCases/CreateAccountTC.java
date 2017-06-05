package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountTC {
	private WebDriver driver;
	private String email;
	private String password;
	
	public CreateAccountTC(WebDriver d, String e, String p) {
		driver = d;
		email = e;
		password = p;
		run(driver,email,password);
	}
	
	private void run(WebDriver driver, String email, String password) {
		WebElement createEmail = driver.findElement(By.id("create-email"));
		createEmail.sendKeys(email);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement createPassword = driver.findElement(By.id("create-password"));
		createPassword.sendKeys(password);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement createFirst = driver.findElement(By.id("create-first-name"));
		createFirst.sendKeys("first");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement createLast = driver.findElement(By.id("create-last-name"));
		createLast.sendKeys("last");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement createMonth = driver.findElement(By.id("create-month"));
		createMonth.sendKeys("01");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement createDay = driver.findElement(By.id("create-day"));
		createDay.sendKeys("01");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement createYear = driver.findElement(By.id("create-year"));
		createYear.sendKeys("1990");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement createButton = driver.findElement(By.id("create-button"));
		createButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement logoutButton = driver.findElement(By.id("logout-button"));
		logoutButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Test: Create Account: Success");
	}
}
