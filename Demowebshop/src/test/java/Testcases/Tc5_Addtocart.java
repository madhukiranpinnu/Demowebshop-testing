package Testcases;
import java.io.File;

import java.io.IOException;

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

public class Tc5_Addtocart {
	
	 WebDriver driver;
    
    WebElement login,email,password,btnComputers,btndesktops,btnBuild_your_own_cheap_computer,addtocart,enter,shoppingcart;
    
    @Given("^the user is in demowebshop home page$")
    public void the_user_is_in_demowebshop_home_page() throws Throwable {
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        Tc5_Addtocart Addtocart = new Tc5_Addtocart();
    }
    
    @When("^the user wants to add to cart$")
    public void the_user_wants_to_add_to_cart() throws Throwable {
    	login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	    login.click();
	    WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("indhudazzling98@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("pass123");
    	WebElement btnComputers = driver.findElement(By.linkText("Computers"));
		btnComputers.click();
		WebElement btndesktops = driver.findElement(By.linkText("Desktops"));
		btndesktops.click();
		WebElement btnBuild_your_own_cheap_computer = driver.findElement(By.linkText("Build your own cheap computer"));
		btnBuild_your_own_cheap_computer.click();
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-72\"]"));
		addtocart.click();
		WebElement shoppingcart = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]"));
        shoppingcart.click();
        
        }
    

    @Then("^the system displays added to cart$")
    public void he_moves_to_other_page() throws Throwable {
    	driver.quit();
    }
}