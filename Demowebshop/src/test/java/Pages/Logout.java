package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {
	 WebDriver driver;
     WebElement username, password,signin;
     
     public Logout(WebDriver driver)
     {
         this.driver= driver;
     }
     
     void enterUsername(String s)
     {
         username = driver.findElement(By.name("firstName"));
         username.sendKeys(s);
     }
     
     void enterPassword(String s)
     {
         driver.findElement(By.name("Password")).sendKeys(s);
     }
}
