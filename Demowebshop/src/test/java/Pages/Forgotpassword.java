package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forgotpassword {
	 WebDriver driver;
     WebElement username, login,email,fpassword,click1;
     
     public Forgotpassword(WebDriver driver)
     {
         this.driver= driver;
     }
     
     void enterUsername(String s) throws InterruptedException
     {
    	 login=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
         login.click();
         Thread.sleep(2000);
         fpassword=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[4]/span/a"));
         fpassword.click();
         email = driver.findElement(By.id("Email"));
         email.sendKeys(s);
        click1=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/form/div[2]/input"));
        click1.click();
        driver.quit();
     }
     
     
  
 }


