package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AboutUs {
	public class Contact {
		WebDriver driver;
		@Test(priority=1)
		void openapp() {
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.demoblaze.com/index.html");
			driver.manage().window().maximize();
		}
		
		@Test(priority=3)
		void testaboutus() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@data-target='#videoModal']")).click();
			driver.findElement(By.xpath("//div[@aria-labelledby='exampleModalLabel']")).click();
			driver.findElement(By.xpath("//button[@fdprocessedid='s41plo']")).click();
			
		}

	}
}
