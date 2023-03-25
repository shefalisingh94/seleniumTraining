package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).click();
        List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int Count = links.size();
		System.out.println("count is: " +Count);
		for(int i=0; i<Count ; i++) {
			String text= links. get(i).getText();
			System.out.println(text);
		}
		}


	}


