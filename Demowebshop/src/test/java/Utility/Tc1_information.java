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

public class Tc1_information {
	static int i=26;
	static WebDriver driver;
	WebElement Sitemap,shipping,privacy,condition,about,contact;
	@Given("^open application info$")
	public void open_application_info() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        Tc1_information information = new Tc1_information();
	}

	@When("^user wants to view Sitemap$")
	public void user_wants_to_view_Sitemap() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Sitemap = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[1]/a"));
        Sitemap.click();
        captureScreenshot();
        Thread.sleep(10000);
	}

	@Then("^he System shows sitemap of demowebshop$")
	public void he_System_shows_sitemap_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user wants to view Shipping & returns$")
	public void user_wants_to_view_Shipping_returns() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		shipping = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[2]/a"));
        shipping.click();
        captureScreenshot();
        Thread.sleep(10000);
	}

	@Then("^the System shows Shipping&returns of demowebshop$")
	public void the_System_shows_Shipping_returns_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user wants to view Privacy Notes$")
	public void user_wants_to_view_Privacy_Notes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		privacy = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[3]/a"));
        privacy.click();
        captureScreenshot();
        Thread.sleep(10000);
	}

	@Then("^the System shows Privacy Notes of demowebshop$")
	public void the_System_shows_Privacy_Notes_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user wants to view Conditions of use$")
	public void user_wants_to_view_Conditions_of_use() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		condition = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[4]/a"));
        condition.click();
        captureScreenshot();
        Thread.sleep(10000);
	}

	@Then("^the System shows Conditions of use of demowebshop$")
	public void the_System_shows_Conditions_of_use_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user wants to view About us$")
	public void user_wants_to_view_About_us() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		about = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[5]/a"));
        about.click();
        captureScreenshot();
        Thread.sleep(10000);
	}

	@Then("^the System shows About us of demowebshop$")
	public void the_System_shows_About_us_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user wants to view Contact us$")
	public void user_wants_to_view_Contact_us() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		contact = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[6]/a"));
        contact.click();
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
	@Then("^the System shows Contact us of demowebshop$")
	public void the_System_shows_Contact_us_of_demowebshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
}
