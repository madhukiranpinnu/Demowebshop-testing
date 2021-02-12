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

public class Tc1_myaccount {
	static int i=38;
	static WebDriver driver;
	WebElement myaccount,address,orders;
	@Given("^open application here$")
	public void open_application_here() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        Tc1_myaccount myaccount = new Tc1_myaccount();
	}

	@When("^user wants to view Account information$")
	public void user_wants_to_view_Account_information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 myaccount = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[1]/a"));
         myaccount.click();
         Thread.sleep(10000);
	}

	@Then("^he System shows User account of demowebshop$")
	public void he_System_shows_User_account_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user wants to view his orders$")
	public void user_wants_to_view_his_orders() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		address = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[2]/a"));
        address.click();
     Thread.sleep(10000);
	}

	@Then("^the System shows Users orders of demowebshop$")
	public void the_System_shows_Users_orders_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user wants to view his address$")
	public void user_wants_to_view_his_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		orders = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[3]/a"));
        orders.click();
        captureScreenshot();
        Thread.sleep(10000);
	}
	static void captureScreenshot() throws Exception
    {
        File scrFile;
        scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(scrFile, new File("E:\\Project//snap" + i + ".jpeg"));
        
        i++;
    }
	@Then("^the System shows Users Address of demowebshop$")
	public void the_System_shows_Users_Address_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
}
