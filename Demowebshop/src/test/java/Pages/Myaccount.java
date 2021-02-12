package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Myaccount {
	 WebDriver driver;
     WebElement myaccount,address,orders;
     
     public Myaccount(WebDriver driver)
     {
         this.driver= driver;
     }
     
     public void clickmyaccount()
     {
         myaccount = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[1]/a"));
         myaccount.click();
     }
     public void clickaddress()
     {
         address = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[2]/a"));
         address.click();
     }
     public void clickorders()
     {
         orders = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[3]/a"));
         orders.click();
     }
    
}
