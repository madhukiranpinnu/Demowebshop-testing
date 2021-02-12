package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class newsletter {
	WebDriver driver;
	WebElement email;
	public newsletter(WebDriver driver)
	{
		this.driver=driver;
	}
	
	void enterEmail(String s)
	{
		email=driver.findElement(By.name("NewsletterEmail"));
		email.sendKeys(s);
		
		
		
	}
}
