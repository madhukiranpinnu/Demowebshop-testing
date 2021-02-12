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

public class Tc3_Search {
	 WebDriver driver;
	@Given("^open applicationdemo$")
	public void open_applicationdemo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver = new ChromeDriver();
	        driver.get("http://demowebshop.tricentis.com/");
	}

	@When("^user search vailid$")
	public void user_search_vailid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement search = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
        search.sendKeys("$5 Virtual Gift Card");
        WebElement search1=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
        
        search1.click();
        
        Thread.sleep(6000);
	}

	@Then("^he can see products$")
	public void he_can_see_products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user search invalid$")
	public void user_search_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement search = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
        search.sendKeys("$5 Virtual Gift Carddd");
        WebElement search1=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
        
        search1.click();
        
        Thread.sleep(6000);
	}

	@Then("^the system shows errors$")
	public void the_system_shows_errors() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user search singleword$")
	public void user_search_singleword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement search = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
        search.sendKeys(" ");
        WebElement search1=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
        
        search1.click();
        
        Thread.sleep(6000);
	}
	
	@Then("^the system doesnt show anything$")
	public void the_system_doesnt_show_anything() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
}
