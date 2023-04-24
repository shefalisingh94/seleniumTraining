package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Locate Username 
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");  //Using Id Locator
		//driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul"); //Using CssSelector locator
		
		//Locate Password
		driver.findElement((By.name("inputPassword"))).sendKeys("test"); //Using name locator
		
		//Locate Signing button
		//driver.findElement(By.className("signInBtn")).click();  //Using Class Locator
		driver.findElement(By.cssSelector("button.signInBtn")).click(); //Using CssSelector Locator
		
		//Locate Incorrect error message
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());;
		
		//Locate Link
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Shefali");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("shefali@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		//driver.findElement(By.cssSelector("input[placeholder=\"Email\"]:nth-child(3)")).sendKeys("Mohit123@gmail.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8800452143");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*= \"pass\"]")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector("button.submit")).click();
		//driver.findElement(By.xpath("//div[contains(@class,'pwd')]")).click();
		
		
		
		

	}

}
