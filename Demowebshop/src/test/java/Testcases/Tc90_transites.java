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

public class Tc90_transites {
	 WebDriver driver;
	@Given("^user in demowebshop home page$")
	public void user_in_demowebshop_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com");
		 Tc90_transites taghf = new Tc90_transites();
	}

	@When("^user wants to click on tags$")
	public void user_wants_to_click_on_tags() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement tags = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[3]/div[2]/div[1]/ul/li[1]/a"));
		tags.click();	
		 
		Thread.sleep(1000);
	}
	
	@Then("^the system displays selected tags$")
	public void the_system_displays_selected_tags() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
}
