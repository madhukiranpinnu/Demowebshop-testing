package Utility;

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

public class Tc1_Registration {
	static int i=44;
	static WebDriver driver;
	@Given("^the user is in registration page$")
	public void the_user_is_in_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver = new ChromeDriver();
	        driver.get("http://demowebshop.tricentis.com/");
	        Tc1_Registration register = new Tc1_Registration();
	}

	@When("^the user wants to register using his valid credentials$")
	public void the_user_wants_to_register_using_his_valid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
        gender.click();
        WebElement firstname = driver.findElement(By.id("FirstName"));
        firstname.sendKeys("John");
        WebElement lastname = driver.findElement(By.id("LastName"));
        lastname.sendKeys("Max");
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("madhu9118@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("pass123");
        WebElement retypePassword = driver.findElement(By.id("ConfirmPassword"));
        retypePassword.sendKeys("pass123");
        register = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
        register.click();
        captureScreenshot();
	}

	@Then("^the user register account successfully$")
	public void the_user_register_account_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^the user wants to register using his invlaid credentials$")
	public void the_user_wants_to_register_using_his_invlaid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
        gender.click();
        WebElement firstname = driver.findElement(By.id("FirstName"));
        firstname.sendKeys(" ");
        WebElement lastname = driver.findElement(By.id("LastName"));
        lastname.sendKeys("Max");
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("madhukiran918@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("pass123");
        WebElement retypePassword = driver.findElement(By.id("ConfirmPassword"));
        retypePassword.sendKeys("pass123");
        register = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
        register.click();
        captureScreenshot();
	}

	@Then("^the system shows error$")
	public void the_system_shows_error() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.quit(); 
	}

	@When("^the user wants to register using his empty credentials$")
	public void the_user_wants_to_register_using_his_empty_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
        gender.click();
        WebElement firstname = driver.findElement(By.id("FirstName"));
        firstname.sendKeys(" ");
        WebElement lastname = driver.findElement(By.id("LastName"));
        lastname.sendKeys("Max");
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("indhudazzling98@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("pass123");
        WebElement retypePassword = driver.findElement(By.id("ConfirmPassword"));
        retypePassword.sendKeys("pass123");
        register = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
        register.click();
        captureScreenshot();
	}
	static void captureScreenshot() throws Exception
    {
        File scrFile;
        scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(scrFile, new File("E:\\Project//snap" + i + ".jpeg"));
        
        i++;
    }
	@Then("^the system shows error here$")
	public void the_system_shows_error_here() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}
}
