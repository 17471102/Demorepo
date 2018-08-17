package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigationmenu {
	
	static WebElement  element;
	WebDriver driver;
	
  public static WebElement hamburgericon(WebDriver driver) {
	  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  element = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[1]/div/div"));
	return element;
	  
  }
  
  public static WebElement support(WebDriver driver) {
	  Navigationmenu.hamburgericon(driver).click();
	  element = driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/div/div[2]/div/div[2]/div[5]/div/div/span[2]"));
	  return element;
	  
  }
  
}
