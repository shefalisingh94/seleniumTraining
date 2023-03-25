package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
    //WebDriver is an Interface
		//chromedriver.exe->Invoked Chrome browser
		//webdriver.chrome.driver->value of path
		
		//System.setProperty("webdriver.chrome.driver", "/Users/shefalisingh/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		//driver.navigate().to("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//driver.close();
		//driver.quit();
	}

	
}
