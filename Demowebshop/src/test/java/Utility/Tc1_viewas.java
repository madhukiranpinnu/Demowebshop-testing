package Utility;

import java.io.File;


import org.openqa.selenium.By
;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import Pages.Viewas;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc1_viewas {
	static int i=53;
	static WebDriver driver;
	WebElement login,email,password,btnComputers,btndesktops,btnBuild_your_own_cheap_computer,addtocart,enter,shoppingcart;
	@Given("^open Desktop man$")
	public void open_Desktop_man() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        Viewas views =new Viewas();
		login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	    login.click();
	    WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("madhukiran918@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("madhu123");
    	WebElement btnComputers = driver.findElement(By.linkText("Computers"));
		btnComputers.click();
		WebElement btndesktops = driver.findElement(By.linkText("Desktops"));
		btndesktops.click();
		
	}

	@When("^user wants to view products as list$")
	public void user_wants_to_view_products_as_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Select drpprice=new Select(driver.findElement(By.name("products-viewmode")));
		drpprice.selectByVisibleText("Grid");
		
		Thread.sleep(10000);
	}

	@Then("^he System shows products as list$")
	public void he_System_shows_products_as_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.quit();
	}

	@When("^user wants to view products as grid$")
	public void user_wants_to_view_products_as_grid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Select drpprice=new Select(driver.findElement(By.name("products-viewmode")));
		drpprice.selectByVisibleText("List");
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
	@Then("^the System shows products as grid$")
	public void the_System_shows_products_as_grid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
}
