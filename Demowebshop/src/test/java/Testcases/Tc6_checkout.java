package Testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Tc6_checkout {
    WebDriver driver;
    WebElement Actions,login,email,password,btnComputers,btndesktops,btnBuild_your_own_cheap_computer,addtocart,enter,shoppingcart,agreetotermsandconditions,checkout,billingaddress,shippingaddress,paymentinfo;
    
    @Given("^the user is in shopping cart$")
    public void the_user_is_in_shopping_cart() throws Throwable {
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
      Tc6_checkout checkout = new Tc6_checkout();
    }
    
    @When("^the user checkout$")
    public void the_user_checkout() throws InterruptedException {
    	login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	    login.click();
	    WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("indhumathymani12@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("indhu1998");
        WebElement enter = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        enter.click();
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
        WebElement agreetotermsandconditions = driver.findElement(By.xpath("//*[@id=\"termsofservice\"]"));
        agreetotermsandconditions.click();
        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
        checkout.click();
        WebElement billingaddress = driver.findElement(By.xpath("//*[@id=\"billing-address-select\"]"));
        billingaddress.sendKeys("indhumathy M, no:60, xxyyzz 607105, France");
        billingaddress.click();
        WebElement Continue1 = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
        Continue1.click();  
        Thread.sleep(2000);
    }
    
	@Then("^the system displays order placed$")
    public void the_system_displays_order_placed() throws InterruptedException  {
		WebElement shippingaddress = driver.findElement(By.xpath("//*[@id=\"shipping-address-select\"]"));
        shippingaddress.sendKeys("indhumathy M,no:60,xxyyzz 607105,France");
        shippingaddress.click();
        Thread.sleep(1000);
        WebElement Continue2 = driver.findElement(By.cssSelector("#shipping-buttons-container > input"));
        Continue2.click();
        Thread.sleep(1000);
        WebElement shippingmethod = driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/div/div/ul/li[2]/div[1]/label"));
        shippingmethod.click();
        WebElement Continue3 = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input"));
        Continue3.click();
        Thread.sleep(1000);
        WebElement payment = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/ul/li[1]/div/div[2]/label"));
        payment.click();
        WebElement Continue4 = driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input"));
        Continue4.click();
        Thread.sleep(1000);
        WebElement paymentinfo = driver.findElement(By.xpath("//*[@id=\"checkout-payment-info-load\"]/div/div/div[1]/table/tbody/tr/td/p"));
        paymentinfo.click();
        WebElement Continue5 = driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input"));
        Continue5.click();
        Thread.sleep(1000);
        WebElement confirmorder = driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input"));
        confirmorder.click();
        driver.quit();
    }
}