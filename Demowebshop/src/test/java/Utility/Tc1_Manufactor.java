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

public class Tc1_Manufactor {
	static int i=35;
	static WebDriver driver;
	@Given("^open an application ghgh$")
	public void open_an_application_ghgh() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		   driver.get("http://demowebshop.tricentis.com");
		   Tc1_Manufactor manufacturerspages = new Tc1_Manufactor();
	}

	@When("^user wants to select categorys$")
	public void user_wants_to_select_categorys() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement manufacturers=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[2]/div[1]/strong"));
	    manufacturers=driver.findElement(By.linkText("Tricentis"));
	    manufacturers.click();
	    captureScreenshot();
	    Thread.sleep(1000);
	}
	static void captureScreenshot() throws Exception
    {
        File scrFile;
        scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(scrFile, new File("E:\\Project//snap" + i + ".jpeg"));
        
        i++;
    }
	@Then("^the system displays categories to users$")
	public void the_system_displays_categories_to_users() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
}
