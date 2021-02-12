package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Connecting {
    
        WebDriver driver;
        WebElement Connecting,youtube,rss,twitter,google;
        
        public Connecting(WebDriver driver)
        {
            this.driver= driver;
        }
        
        public void clickConnecting()
        {
            Connecting = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[1]/a"));
            Connecting.click();
        }
        public void clickrss()
        {
            rss = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[3]/a"));
            rss.click();
        }
        public void clicktwitter()
        {
            twitter = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[2]/a"));
            twitter.click();
        }
        public void clickgoogle()
        {
            google = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[5]/a"));
            google.click();
        }
        public void clickyoutube()
        {
            youtube = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[4]/a"));
            youtube.click();
        }
        
        
    }