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

public class Tc1_forgotpassword {
	static int i=23;
	static WebDriver driver;
	 WebElement username, passswordc,email,click1;
	@Given("^the user is in Loginpage$")
	public void the_user_is_in_Loginpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        Tc1_forgotpassword fpassword = new Tc1_forgotpassword();
        WebElement login1 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	    login1.click();
	    Thread.sleep(10000);
	}

	@When("^the user enter valid email id$")
	public void the_user_enter_valid_email_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		passswordc=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[4]/span/a"));
        passswordc.click();
        email = driver.findElement(By.id("Email"));
        email.sendKeys("madhukiran918@gmail.com");
       click1=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/form/div[2]/input"));
       click1.click();
	}

	@Then("^the System displays email with instructions sent to you$")
	public void the_System_displays_email_with_instructions_sent_to_you() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^the user enter invalid email id$")
	public void the_user_enter_invalid_email_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		passswordc=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[4]/span/a"));
        passswordc.click();
        email = driver.findElement(By.id("Email"));
        email.sendKeys("shrisai123@");
       click1=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/form/div[2]/input"));
       click1.click();
	}

	@Then("^the system throws an error message$")
	public void the_system_throws_an_error_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^the user enter empty email id$")
	public void the_user_enter_empty_email_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		passswordc=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[4]/span/a"));
        passswordc.click();
        email = driver.findElement(By.id("Email"));
        email.sendKeys(" ");
       click1=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/form/div[2]/input"));
       click1.click();
       captureScreenshot();
	}
	static void captureScreenshot() throws Exception
    {
        File scrFile;
        scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(scrFile, new File("E:\\Project//snap" + i + ".jpeg"));
        
        i++;
    }
	@Then("^the system displays enter valid email address$")
	public void the_system_displays_enter_valid_email_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.quit();
	}
}
