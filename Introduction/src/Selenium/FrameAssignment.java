package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		// System.out.println(driver.findElements(By.tagName("frame")).size());
		// driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		// driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());

	}

}
