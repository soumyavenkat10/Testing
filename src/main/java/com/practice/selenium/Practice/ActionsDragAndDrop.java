package com.practice.selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {
	 public static void main( String[] args )
	    {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat\\eclipse-workspace\\VenkatPractice\\Practice\\driver\\chromedriver.exe");
	  
	        WebDriver driver=new ChromeDriver();
	  
	        driver.manage().window().maximize();
	        
	        driver.get("http://demo.guru99.com/test/drag_drop.html");
	        
	        WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	        
	        WebElement five = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	        
	        WebElement des = driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
	        
	        Actions a=new Actions(driver);
	        
//	        a.dragAndDrop(bank, des).build().perform();
	        
	        a.clickAndHold(bank).moveToElement(des).release(des).perform();
	        
	        
	        try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	      driver.quit();  
	    }
}
