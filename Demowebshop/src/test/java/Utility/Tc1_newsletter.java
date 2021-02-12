package Utility;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import Pages.newsletter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc1_newsletter {
	static int i=41;
	static WebDriver driver;
	WebElement email,subscribe;
	@Given("^open application newsletter$")
	public void open_application_newsletter() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		   driver.get("http://demowebshop.tricentis.com");
		   newsletter newsletterpage = new newsletter(driver);
	}

	@When("^user enters valid email id$")
	public void user_enters_valid_email_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		email=driver.findElement(By.name("NewsletterEmail"));
		 email.sendKeys("anp12@gmail.com");
		 Thread.sleep(2000);
		 subscribe = driver.findElement(By.id("newsletter-subscribe-button"));
	     subscribe.click();
	     Thread.sleep(2000);
	     
	}

	@Then("^the system displays thank you for signing up$")
	public void the_system_displays_thank_you_for_signing_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
        driver.quit();
	}

	@When("^user enters invalid email id$")
	public void user_enters_invalid_email_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		email=driver.findElement(By.name("NewsletterEmail"));
		 email.sendKeys("anp12@.com");
		 Thread.sleep(2000);
		 subscribe = driver.findElement(By.id("newsletter-subscribe-button"));
	     subscribe.click();
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
	@Then("^the system displays enter valid email id$")
	public void the_system_displays_enter_valid_email_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
	@When("^the user checkout the$")
	public void the_user_checkout_the() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^the system displays order placed you$")
	public void the_system_displays_order_placed_you() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
