package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Information {
    
        WebDriver driver;
        WebElement Sitemap,shipping,privacy,condition,about,contact;
        
        public Information(WebDriver driver)
        {
            this.driver= driver;
        }
        
        public void clicksitemap()
        {
            Sitemap = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[1]/a"));
            Sitemap.click();
        }
        public void clickshipping()
        {
            shipping = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[2]/a"));
            shipping.click();
        }
        public void clickprivacy()
        {
            privacy = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[3]/a"));
            privacy.click();
        }
        public void clickcondition()
        {
             condition = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[4]/a"));
            condition.click();
        }
        public void clickabout()
        {
            about = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[5]/a"));
            about.click();
        }
        public void clickcontact()
        {
            contact = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[6]/a"));
            contact.click();
        }
        
        
    }
