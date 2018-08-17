package automationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {
	
	WebDriver driver;
	
	public static void logout(WebDriver driver) {
		
	WebElement signout;
	
	WebElement admin;
	
	WebDriverWait wait = null;
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	admin = driver.findElement(By.xpath("//a[@class='userName dropdown-toggle']"));
    
	admin.click();
	signout= driver.findElement(By.xpath("//*[@id=\"menubar_item_right_LBL_SIGN_OUT\"]"));
	signout.click();
	
driver.quit();
}
}