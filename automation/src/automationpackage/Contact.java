package automationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Contact {

	WebDriver driver;
	
	public static void contact(WebDriver driver)
	{
		WebElement contact,  officePhone, primaryEmail, lastName, create, organisationName, input, search, save;
		
		Select firstName, assignedTo;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		create = driver.findElement(By.xpath("//*[@id=\"menubar_quickCreate\"]"));
		create.click();
		
		contact= driver.findElement(By.xpath("/html/body/div[1]/nav/div[1]/div/div[3]/ul/li[1]/div/ul/li[2]/div/div[1]/div[1]/a/i"));
		contact.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		firstName= new Select (driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[1]/td[2]/select")));
		firstName.selectByVisibleText("Dr.");
		
		 input  = driver.findElement(By.xpath("//*[@id=\"Contacts_editView_fieldName_firstname\"]"));
		 input.sendKeys("Preety");
		 
		officePhone = driver.findElement(By.xpath("//*[@id=\"Contacts_editView_fieldName_phone\"]"));
		officePhone.sendKeys("0225176868");
		
		primaryEmail = driver.findElement(By.xpath("//*[@id=\"Contacts_editView_fieldName_email\"]"));
		primaryEmail.sendKeys("yespl@gmail.com");
		
		
		lastName = driver.findElement(By.xpath("//*[@id=\"Contacts_editView_fieldName_lastname\"]"));
		lastName.sendKeys("Joshi");
		
		search = driver.findElement(By.xpath("//*[@id=\"account_id_display\"]"));
		search.sendKeys("anything");
		
		assignedTo = new Select (driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[3]/td[4]/select")));
		assignedTo.selectByVisibleText("Team Selling");
		
		
		save= driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[3]/center/button[2]"));
		save.click();
	}
	
	
}
