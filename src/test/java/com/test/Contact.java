package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

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
	void testcontact() {
		driver.findElement(By.xpath("//a[@data-target='#exampleModal']")).click();
		driver.findElement(By.xpath("//input[@id='recipient-email']")).sendKeys("mutkurevaishnavi@gmail.com");
		driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys("7769070868");
		driver.findElement(By.xpath("//textarea[@id='message-text']")).sendKeys("hello good morning");
		driver.findElement(By.xpath("//button[@onclick='send()']")).click();
	}
}
