package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class tags
{
	WebDriver driver;
	WebElement tags;
	public tags(WebDriver driver)
	{
		this.driver = driver;
	}
	
	void selectTags()
	{
		tags = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[3]/div[1]/strong"));
		tags.click();
		
}
}