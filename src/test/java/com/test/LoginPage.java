package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	@Test(priority=1)
	void openapp() {
		driver = new ChromeDriver();
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
	void testlogin() {
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("mutkurevaishnavi@gmail.com");
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("9561615830");
		driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
	}
	

}

