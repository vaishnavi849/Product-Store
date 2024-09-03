package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {
	public class Contact {
		WebDriver driver;
		@Test(priority=1)
		void openapp() {
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.demoblaze.com/index.html");
			driver.manage().window().maximize();
		}
		@Test(priority=2)
		void testlogo() throws InterruptedException {
		Thread.sleep(3000);
		boolean status=driver.findElement(By.xpath("//a[@id='nava']//img")).isDisplayed();
		System.out.println("logo displayed.."+ status);
	}
		@Test(priority=3)
		void testhome() {
			driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']")).click();
			driver.findElement(By.xpath("//a[@id='cat']")).click();
			driver.findElement(By.xpath("//a[3]")).click();
			driver.findElement(By.xpath("//div[@id='tbodyid']//div[1]//div[1]//a[1]//img[1]")).click();
			driver.findElement(By.xpath("//a[@onclick='addToCart(1)']")).click();
			
		}
	}
}
