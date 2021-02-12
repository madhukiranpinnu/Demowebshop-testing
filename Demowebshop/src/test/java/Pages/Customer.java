package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Customer {
	 WebDriver driver;
     WebElement search,news,blog,recently,compare,newp;
     
     public Customer(WebDriver driver)
     {
         this.driver= driver;
     }
     
     public void clicksearch()
     {
         search = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[1]/a"));
         search.click();
     }
     public void clicknews()
     {
         news = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[2]/a"));
         news.click();
     }
     public void clickblog()
     {
         blog = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[3]/a"));
         blog.click();
     }
     public void clickrecently()
     {
          recently = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[4]/a"));
         recently.click();
     }
     public void clickcompare()
     {
         compare = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[5]/a"));
         compare.click();
     }
     public void clicknewp()
     {
         newp = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[6]/a"));
         newp.click();
     }
     
}
