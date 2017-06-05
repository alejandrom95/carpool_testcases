package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTC {

	private WebDriver driver;
	private String email;
	private String password;
	
	public LoginTC(WebDriver d, String e, String p) {
		driver = d;
		email = e;
		password = p;
		run(driver, email, password);
	}
	
	private void run(WebDriver driver, String email, String password) {
		//incorrect login
		WebElement loginEmail = driver.findElement(By.id("login-email"));
		loginEmail.sendKeys(email);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement loginPassword = driver.findElement(By.id("login-password"));
		loginPassword.sendKeys("pass");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Test: Incorrect Login: Success");
		
		//correct login
		loginEmail = driver.findElement(By.id("login-email"));
		loginEmail.sendKeys(email);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		loginPassword = driver.findElement(By.id("login-password"));
		loginPassword.sendKeys(password);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Test: Correct Login: Success");

	}
}
