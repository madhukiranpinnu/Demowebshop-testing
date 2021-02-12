package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test(priority=1)

public class category 
{
	WebDriver driver;
	WebElement category;
	public category(WebDriver driver)
	{
		this.driver=driver;
	}
	
	void selectCategory(String s)
	{
		category=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]"));
		category.click();
		
	}
	
	
}