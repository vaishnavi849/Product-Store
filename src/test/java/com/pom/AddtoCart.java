package com.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddtoCart {
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
	void testcard() {
		driver.findElement(By.xpath("//a[@id='cartur']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vaishnavi");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Amravati");
		driver.findElement(By.xpath("//input[@id='card']")).sendKeys("HDFC");
		driver.findElement(By.xpath("//input[@id='month']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2024");
		driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();
	}

}