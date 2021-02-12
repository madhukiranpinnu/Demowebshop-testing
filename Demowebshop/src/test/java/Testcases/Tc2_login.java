 package Testcases;
import org.testng.annotations.Test;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import Pages.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Tc2_login {
	 WebDriver driver;
	WebElement username,password,Login,login;
    
	@Given("^open application$")
    
    public void open_application() throws Throwable {
    	
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        Login loginpage = new Login(driver);
       
    }
 
	@When("^user wants to login$")
    public void user_clicks_an_link() throws Throwable {
    	Login = driver.findElement(By.linkText("Log in"));
        Login.click();
        username = driver.findElement(By.name("Email"));
        password = driver.findElement(By.name("Password"));
        username.sendKeys("madhukiran918@gmail.com");
        password.sendKeys("Madhu@123");
        login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        login.click();
        
        Thread.sleep(2000);
    }
   
	@Then("^he can login to the application$")
    public void he_moves_to_other_page() throws Throwable {
        driver.quit();
    }
    
	@When("^user enters invalid credentials$")
    public void user_enters_invalid_credentials() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	Login = driver.findElement(By.linkText("Log in"));
        Login.click();
        username = driver.findElement(By.name("Email"));
        password = driver.findElement(By.name("Password"));
        username.sendKeys("qwerty123@gmail.com");
        password.sendKeys("Madhu@123");
        login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        login.click();
        
        Thread.sleep(2000);
        
    }

    
	@Then("^the system to throw an error message$")
    public void the_system_to_throw_an_error_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }
   
    
	@When("^user didnot enter any credentials$")
    public void user_didnot_enter_any_credentials() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
        
    }
}

