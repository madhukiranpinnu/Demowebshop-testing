package Testcases;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import Pages.Cpass;
import Pages.Logout;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc993_Changepassword {
	 WebDriver driver;
	WebElement username,password,Login,login;
	@Given("^open application changepassword$")
	public void open_application_changepassword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
       Cpass logoutpages = new Cpass(driver);
        Login = driver.findElement(By.linkText("Log in"));
        Login.click();
        username = driver.findElement(By.name("Email"));
        password = driver.findElement(By.name("Password"));
        username.sendKeys("madhukiran918@gmail.com");
        password.sendKeys("madhu123");
        login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        login.click();
        Thread.sleep(6000);
	}

	@When("^samepassword$")
	public void samepassword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement myaccount = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[1]/a"));
        myaccount.click();
        Thread.sleep(10000);
        WebElement cp=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[7]/a"));
	    cp.click();
	    WebElement old,newd,conf,btn;
	    old=driver.findElement(By.id("OldPassword"));
	    old.sendKeys("madhu123");
	    newd=driver.findElement(By.id("NewPassword"));
	    newd.sendKeys("madhu123");
	    conf=driver.findElement(By.id("ConfirmNewPassword"));
	    conf.sendKeys("madhu123");
	    btn=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/input"));
	    btn.click(); 
	    
	    Thread.sleep(10000);
	}

	@Then("^close browsers$")
	

	public void close_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

	@When("^diffrentpassword$")
	public void diffrentpassword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement myaccount = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[1]/a"));
        myaccount.click();
        Thread.sleep(10000);
        WebElement cp=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[7]/a"));
	    cp.click();
	    WebElement old,newd,conf,btn;
	    old=driver.findElement(By.id("OldPassword"));
	    old.sendKeys("Madhu@123112");
	    newd=driver.findElement(By.id("NewPassword"));
	    newd.sendKeys("madhu21");
	    conf=driver.findElement(By.id("ConfirmNewPassword"));
	    conf.sendKeys("madhu12");
	    btn=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/input"));
	    btn.click();
	    
	    Thread.sleep(10000);
	}
	


	@Then("^tclose browser$")
	public void tclose_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
}
