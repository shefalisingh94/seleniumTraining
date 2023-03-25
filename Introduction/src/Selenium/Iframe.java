package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e"); //switching the frame by ID

		System.out.println("********We are switch to the iframe*******");
 		driver.findElement(By.xpath("html/body/a/img")).click();
		    //Clicks the iframe
   
			System.out.println("*********We are done***************");
  }

	}


