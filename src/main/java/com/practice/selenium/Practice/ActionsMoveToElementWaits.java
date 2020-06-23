package com.practice.selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class ActionsMoveToElementWaits 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat\\eclipse-workspace\\VenkatPractice\\Practice\\driver\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   
   driver.get("http://www.greenstechnologys.com/");
   
   driver.manage().window().maximize();
   
   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
   
   Actions a=new Actions(driver);
   
   WebElement courses = driver.findElement(By.linkText("COURSES"));
   
   WebDriverWait wait=new WebDriverWait(driver,10);
   
   wait.until(ExpectedConditions.visibilityOf(courses));
   
   a.moveToElement(courses).perform();
   
   WebElement devops = driver.findElement(By.xpath("//span[text()='DevOps Training']"));
   
   Wait wait1 = new FluentWait<WebDriver>(driver)
		   .withTimeout(50, TimeUnit.SECONDS)
		   .pollingEvery(3, TimeUnit.SECONDS)
		   .ignoring(NoSuchElementException.class);
   wait1.until(ExpectedConditions.elementToBeClickable(devops));
   a.click(devops).perform();
   
   
    }
}
