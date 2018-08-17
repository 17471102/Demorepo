package automationpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class createaticket {
	
	WebDriver driver;
	
		public static void Ticket(WebDriver driver)
		{
			
		
	WebElement Quick;
	WebElement Ticket;
	WebElement Title;
	Select Priority;
	WebElement Description;
	Select  AssignedTo;
	Select Status;
	WebElement Gotofullform;
	WebElement Save;
	WebElement Cancel;
	WebDriverWait wait = null;
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Quick= driver.findElement(By.xpath("//*[@id=\"menubar_quickCreate\"]"));
	Quick.click();
	
	Ticket=driver.findElement(By.xpath("/html/body/div[1]/nav/div[1]/div/div[3]/ul/li[1]/div/ul/li[2]/div/div[1]/div[3]/a/span"));
	Ticket.click();

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Title= driver.findElement(By.xpath("//*[@id=\"HelpDesk_editView_fieldName_ticket_title\"]"));
	Title.sendKeys("Mrs");
	
	Priority = new Select (driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[2]/td[2]/select")));
	Priority.selectByVisibleText("Low");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Description = driver.findElement(By.xpath("//*[@id=\"HelpDesk_editView_fieldName_description\"]"));
	Description.sendKeys("Test");
			
	
	
	
	AssignedTo = new Select (driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[1]/td[4]/select")));
	
	AssignedTo.selectByVisibleText("Support Group");
	
	Status= new Select (driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[2]/td[4]/select")));
	Status.selectByVisibleText("Open");
	
	Save = driver.findElement(By.xpath("//*[@id=\"QuickCreate\"]/div[3]/center/button[2]/strong"));
	Save.click();
	

}
}