package com.practice.selenium.Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickActionRobo {
	 public static void main( String[] args ) throws AWTException
	    {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat\\eclipse-workspace\\VenkatPractice\\Practice\\driver\\chromedriver.exe");
	  
	        WebDriver driver=new ChromeDriver();
	  
	        driver.manage().window().maximize();
	        
	        driver.get("http://www.google.com/");
	        
	        WebElement gmail = driver.findElement(By.linkText("Gmail"));
	        
	        Actions a=new Actions(driver);
	        
	        a.contextClick(gmail).perform();
	        
	        Robot r=new Robot();
	        
	        r.keyPress(KeyEvent.VK_DOWN);
	        
	        r.keyRelease(KeyEvent.VK_ENTER);
	        		
	        try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	      driver.quit(); 
	    }
}
