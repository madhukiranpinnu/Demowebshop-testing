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

public class Tc991_Connecting {
	WebDriver driver;
	WebElement youtube,rss,google,twitter,connecting;
	
	@Given("^open application home$")
	public void open_application_home() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        Tc991_Connecting Connecting = new Tc991_Connecting();
       
	}

	@When("^user wants to view Youtube$")
	public void user_wants_to_view_Youtube() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement youtube = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[1]/a"));
	    youtube.click();
	    
	    Thread.sleep(10000);
	}

	@Then("^he System shows youtube channel of demowebshop$")
	public void he_System_shows_youtube_channel_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user wants to view twitter$")
	public void user_wants_to_view_twitter() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		twitter = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[2]/a"));
        twitter.click();
        
        Thread.sleep(10000);
	}

	@Then("^the System shows twitter page of demowebshop$")
	public void the_System_shows_twitter_page_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

	@When("^user wants to view RSS$")
	public void user_wants_to_view_RSS() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rss = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[3]/a"));
        rss.click();
        
	}

	@Then("^the System shows RSS channel of demowebshop$")
	public void the_System_shows_RSS_channel_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

	@When("^user wants to view Facebook$")
	public void user_wants_to_view_Facebook() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 youtube = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[4]/a"));
         youtube.click();
         
	}

	@Then("^the System shows Facebook of demowebshop$")
	public void the_System_shows_Facebook_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

	@When("^user wants to view Google\\+$")
	public void user_wants_to_view_Google() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 google = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[5]/a"));
         google.click();
         

	}
	
	
	@Then("^the System shows Google\\+ channel of demowebshop$")
	public void the_System_shows_Google_channel_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
}
