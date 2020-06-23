package com.practice.selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
	 public static void main( String[] args ) throws InterruptedException
	    {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat\\eclipse-workspace\\VenkatPractice\\Practice\\driver\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.flipkart.com/");
	   
	   driver.manage().window().maximize();
	   
	   WebElement popup = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	   
	   
	   if(popup.isDisplayed())
	   
	   {
		   popup.click();
	    }
	   
	   Thread.sleep(5000);
	   
	   WebElement search = driver.findElement(By.className("//input[@class='LM6RPg']"));
	   
	   search.click();
	   
	   search.sendKeys("shoes");
	   
	   
	    }
}
