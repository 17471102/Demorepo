package automationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver driver;
	
	public static void login(WebDriver driver) {
		WebElement username;
		WebElement password;
		WebElement signin;
		  username= driver.findElement(By.xpath("//*[@id=\"username\"]"));
		  username.sendKeys("admin");
		  password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  password.sendKeys("vtiger1");
		  signin =driver.findElement(By.xpath("//button[text()='Sign in']"));
  		signin.submit();
  		
	}
}
