package Utility;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import Pages.Filterby;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Tc1_Filterbyprice {
	static int i=18;
	static WebDriver driver;
	WebElement login,email,password,btnComputers,btndesktops,btnBuild_your_own_cheap_computer,addtocart,enter,shoppingcart;
	@Given("^open Desktop$")
	public void open_Desktop() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        Filterby fillq =new Filterby();		
	}

	@When("^user wants to view products under (\\d+)$")
	public void user_wants_to_view_products_under(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	    login.click();
	    WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("madhukiran918@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("madhu123");
    	WebElement btnComputers = driver.findElement(By.linkText("Computers"));
		btnComputers.click();
		WebElement btndesktops = driver.findElement(By.linkText("Desktops"));
		btndesktops.click();
		Select drpprice=new Select(driver.findElement(By.name("products-orderby")));
		drpprice.selectByVisibleText("Name: A to Z");
		 captureScreenshot();

        }
	

	@Then("^he System shows products below (\\d+) of demowebshop$")
	public void he_System_shows_products_below_of_demowebshop(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user wants to view products between (\\d+) to (\\d+)$")
	public void user_wants_to_view_products_between_to(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	    login.click();
	    WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("madhukiran918@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("madhu123");
    	WebElement btnComputers = driver.findElement(By.linkText("Computers"));
		btnComputers.click();
		WebElement btndesktops = driver.findElement(By.linkText("Desktops"));
		btndesktops.click();
		Select drpprice=new Select(driver.findElement(By.name("products-orderby")));
		drpprice.selectByVisibleText("Price: Low to High");
		 captureScreenshot();
	}

	@Then("^the System shows products between (\\d+) to (\\d+) of demowebshop$")
	public void the_System_shows_products_between_to_of_demowebshop(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user wants to view Recent products  above (\\d+)$")
	public void user_wants_to_view_Recent_products_above(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	    login.click();
	    WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("madhukiran918@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("madhu123");
    	WebElement btnComputers = driver.findElement(By.linkText("Computers"));
		btnComputers.click();
		WebElement btndesktops = driver.findElement(By.linkText("Desktops"));
		btndesktops.click();
		Select drpprice=new Select(driver.findElement(By.name("products-orderby")));
		drpprice.selectByVisibleText("Name: Z to A");
		 captureScreenshot();
	}
	static void captureScreenshot() throws Exception
    {
        File scrFile;
        scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(scrFile, new File("E:\\Project//snap" + i + ".jpeg"));
        
        i++;
    }
	@Then("^the System shows  products above (\\d+)of demowebshop$")
	public void the_System_shows_products_above_of_demowebshop(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

}
