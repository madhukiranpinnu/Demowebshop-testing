package Testcases;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc99_Customer {
	 WebDriver driver;
	 WebElement search,news,blog,recently,compare,newp;
	@Given("^open application main$")
	public void open_application_main() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        Tc99_Customer Customer = new Tc99_Customer();
	}

	@When("^user wants to view News$")
	public void user_wants_to_view_News() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		news = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[2]/a"));
        news.click();
        
        Thread.sleep(10000);
	}

	@Then("^he System shows News of demowebshop$")
	public void he_System_shows_News_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user wants to view Blog$")
	public void user_wants_to_view_Blog() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		blog = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[3]/a"));
        blog.click();
        
        Thread.sleep(10000);
	}

	@Then("^the System shows Blog of demowebshop$")
	public void the_System_shows_Blog_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user wants to view Recent products$")
	public void user_wants_to_view_Recent_products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 recently = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[4]/a"));
         recently.click();
         
         Thread.sleep(10000);
	}

	@Then("^the System shows Recent products of demowebshop$")
	public void the_System_shows_Recent_products_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user wants to view Compare products$")
	public void user_wants_to_view_Compare_products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		compare = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[5]/a"));
        compare.click();
        
        Thread.sleep(10000);
	}

	@Then("^the System shows compareproducts of demowebshop$")
	public void the_System_shows_compareproducts_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user wants to view Newproducts$")
	public void user_wants_to_view_Newproducts() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		newp = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[6]/a"));
        newp.click();
        
        Thread.sleep(10000);
	}
	
	@Then("^the System shows Newproducts channel of demowebshop$")
	public void the_System_shows_Newproducts_channel_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
}
