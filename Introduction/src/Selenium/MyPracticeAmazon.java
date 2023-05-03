package Selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyPracticeAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);

		// driver.findElement(By.xpath("//a[contains(text(),'Amazon
		// miniTV')]")).click();
		// System.out.println(driver.getTitle());
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement headercount = driver.findElement(By.id("nav-main"));
		System.out.println(headercount.findElements(By.tagName("a")).size());
		for (int i = 0; i < headercount.findElements(By.tagName("a")).size(); i++) {
			String clicklinks = Keys.chord(Keys.COMMAND, Keys.ENTER);
			
			
			headercount.findElements(By.tagName("a")).get(i).sendKeys(clicklinks);
			Thread.sleep(5000);
		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}
}
