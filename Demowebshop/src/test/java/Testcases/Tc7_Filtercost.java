package Testcases;

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
import Pages.Filtercost;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc7_Filtercost {
	 WebDriver driver;
	WebElement login,email,password,btnComputers,btndesktops,btnBuild_your_own_cheap_computer,addtocart,enter,shoppingcart;
	@Given("^open Desktop mansher$")
	public void open_Desktop_mansher() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        Tc7_Filtercost fillc =new Tc7_Filtercost();	
	}

	@When("^user wants to view product under (\\d+)$")
	public void user_wants_to_view_product_under(int arg1) throws Throwable {
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
		 WebElement df=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div[2]/ul/li[1]/a/span"));
		 df.click();
		 

	}

	@Then("^he System shows products as under (\\d+)$")
	public void he_System_shows_products_as_under(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user wants to view produt between (\\d+) and (\\d+)$")
	public void user_wants_to_view_produt_between_and(int arg1, int arg2) throws Throwable {
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
		 WebElement df=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div[2]/ul/li[2]/a/span[2]"));
		 df.click();
		 
	}
	
	@Then("^the System shows products as under (\\d+)$")
	public void the_System_shows_products_as_under(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

}
