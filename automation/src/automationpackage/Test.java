package automationpackage;

import pageobjectmodel.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjectmodel.Navigationmenu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
	
		System.setProperty("webdriver.ie.driver","d://automation//Drivers//IEDriverServer32bit.exe");
        
        driver = new InternetExplorerDriver();
       
        driver.get("http://localhost/vtigercrm/");
 
       /* driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
       Login.login(driver);
       
      // createaticket.Ticket(driver);
      // Contact.contact(driver);;
       Navigationmenu.support(driver).click();
       
      // Logout.logout(driver);
     
       
     
       
      	     		
	}
  
	}

