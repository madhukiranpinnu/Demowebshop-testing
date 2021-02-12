package Utility;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import Pages.Community;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc1_communitypoll {
	static int i=7;
	static WebDriver driver;
	WebElement username,password,Login,login;
	@Given("^user in home page poll$")
	public void user_in_home_page_poll() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        Community pollcom = new Community(driver);
	}

	@When("^user selects radio button$")
	public void user_selects_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Login = driver.findElement(By.linkText("Log in"));
        Login.click();
        username = driver.findElement(By.name("Email"));
        password = driver.findElement(By.name("Password"));
        username.sendKeys("madhukiran9189@gmail.com");
        password.sendKeys("madhu123");
        login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        login.click();
        Thread.sleep(2000);
	    WebElement pollin=driver.findElement(By.xpath("//*[@id=\"poll-block-1\"]/ul/li[1]/label"));
	    pollin.click();
	    WebElement vote=driver.findElement(By.id("vote-poll-1"));
	    vote.click();
	    captureScreenshot();
	}

	@Then("^the system displays number of votes gained$")
	public void the_system_displays_number_of_votes_gained() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user didnot select any radio button$")
	public void user_didnot_select_any_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    WebElement vote=driver.findElement(By.id("vote-poll-1"));
	    vote.click();
	    captureScreenshot();
	}

	@Then("^the system displays please select an answer$")
	public void the_system_displays_please_select_an_answer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^user selects radio button without login$")
	public void user_selects_radio_button_without_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement pollin=driver.findElement(By.xpath("//*[@id=\"poll-block-1\"]/ul/li[1]/label"));
	    pollin.click();
	    WebElement vote=driver.findElement(By.id("vote-poll-1"));
	    vote.click();
	    captureScreenshot();
	}
	static void captureScreenshot() throws Exception
    {
        File scrFile;
        scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(scrFile, new File("E:\\Project//snap" + i + ".jpeg"));
        
        i++;
    }

	@Then("^the system displays only registered users can vote$")
	public void the_system_displays_only_registered_users_can_vote() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

}
