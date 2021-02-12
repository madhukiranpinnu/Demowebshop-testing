package Testcases;


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

public class Tc91_Shoppingcart {
	 WebDriver driver;
    WebElement login,email,password,btnComputers,btndesktops,btnBuild_your_own_cheap_computer,addtocart,enter,shoppingcart;
    
    @Given("^the user is in Homepage of the application$")
    public void the_user_is_in_Homepage_of_the_application() throws Throwable {
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        Tc91_Shoppingcart Addtocart = new Tc91_Shoppingcart();
    }
    
    @When("^the user updates shopping cart$")
    public void the_user_updates_shopping_cart() throws Exception {
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
        WebElement edit_shoppingcart = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[3]/div[2]/a"));
        edit_shoppingcart.click();
        Thread.sleep(1000);
        WebElement update_cart1 = driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[6]/dl/dd[1]/ul/li[3]/label"));
        update_cart1.click();
        Thread.sleep(1000);
        WebElement update_cart2 = driver.findElement(By.xpath("//*[@id=\"product_attribute_72_6_19_91\"]"));
        update_cart2.click();
        Thread.sleep(1000);
        WebElement update_cart3 = driver.findElement(By.xpath("//*[@id=\"product_attribute_72_3_20_58\"]"));
        update_cart3.click();
        Thread.sleep(1000);
        WebElement update_cart4 = driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[6]/dl/dd[4]/ul/li[2]/label"));
        update_cart4.click();
        Thread.sleep(1000);
        WebElement update_cart5 = driver.findElement(By.xpath("//*[@id=\"addtocart_72_EnteredQuantity\"]"));
        update_cart5.sendKeys("80");
        update_cart5.click();
        WebElement update_click = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-72\"]"));
        update_click.click();
        WebElement shoppingcart2 = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]"));
        shoppingcart2.click();
        
        Thread.sleep(2000);
        }
    
    @Then("^the system displays updated shopping cart$")
    public void the_system_displays_updated_shopping_cart() throws InterruptedException {
    	
    	WebElement apply_discountcode = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[1]/div[3]/input[1]"));
        apply_discountcode.sendKeys("12345");
        apply_discountcode.click();
        WebElement click_apply_code = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[1]/div[3]/input[2]"));
        click_apply_code.click();
        Thread.sleep(1000);
        WebElement giftcard = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]/div[3]/input[1]"));
        giftcard.sendKeys("567908");
        giftcard.click();
        WebElement apply_addgiftcard = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]/div[3]/input[2]"));
        apply_addgiftcard.click();
        Thread.sleep(1000);
    	WebElement continue_shopping = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[2]"));
        continue_shopping.click();
        WebElement shop_jewelry = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[6]/a"));
        shop_jewelry.click();
        WebElement jewelry_addtocart = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[6]/a"));
        jewelry_addtocart.click();
        WebElement shoppingcart3 = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]"));
        shoppingcart3.click();
    	WebElement delete_shoppingcart = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[1]/input"));
        delete_shoppingcart.click();
        WebElement update_shoppingcart = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]"));
        update_shoppingcart.click();
        WebElement display_shoppingcart = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]"));
        display_shoppingcart.click();
        driver.quit();
    }
}