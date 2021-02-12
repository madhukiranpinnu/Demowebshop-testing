
package Utility;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import Pages.category;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Tc1_categor
{
	static int i=3;
	static WebDriver driver;
	WebElement category;
	@Given("^open an application$")
	public void open_an_application() throws Throwable
	{
		 driver = new ChromeDriver();
		   driver.get("http://demowebshop.tricentis.com");
		   category categorypage = new category(driver);
	}

	@When("^user wants to select category$")
	public void user_wants_to_select_category() throws Throwable
	{
		category=driver.findElement(By.linkText("Books"));
		category=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a"));
		category.click();
		Thread.sleep(2000);
		
        category=driver.findElement(By.linkText("Computers"));
		category=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"));
		category.click();
		Thread.sleep(2000);
		
        category=driver.findElement(By.linkText("Electronics"));
	    category=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a"));
		category.click();
		Thread.sleep(2000);
		
        category=driver.findElement(By.linkText("Apparel & Shoes"));
		category=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a"));
		category.click();
		Thread.sleep(2000);
		
		 category=driver.findElement(By.linkText("Digital downloads"));
		 category=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[5]/a"));
		 category.click();
		 Thread.sleep(2000);
		 
		 category=driver.findElement(By.linkText("Jewelry"));
		 category=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a"));
		 category.click();
		 Thread.sleep(2000);
		
		 category=driver.findElement(By.linkText("Gift Cards"));
		 category=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[7]/a"));
		 category.click();
		 captureScreenshot();
		 Thread.sleep(2000);
	}
	static void captureScreenshot() throws Exception
    {
        File scrFile;
        scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(scrFile, new File("E:\\Project//snap" + i + ".jpeg"));
        
        i++;
    }


	@Then("^the system displays categories to user$")
	public void the_system_displays_categories_to_user() throws Throwable 
	{
		
	    driver.quit();
	}

	}

