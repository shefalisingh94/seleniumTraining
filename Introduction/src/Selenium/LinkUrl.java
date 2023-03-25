package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.manage().timeouts().implicitlyW
		driver.findElement(By.xpath("//a"));
        List<WebElement> links = driver.findElements(By.tagName("a"));
   
		
		int Count = links.size();
		System.out.println("count is: " +Count);
		for(int i=0; i<Count ; i++) {
			String text= links. get(i).getText();
			System.out.println(text);
		}
		}

}
