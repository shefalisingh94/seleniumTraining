package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderHanldles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(3000);

		// driver.findElement(By.id("form-field-travel_comp_date")).click();
		driver.findElement(By.cssSelector("input[id=\"form-field-travel_comp_date\"]")).click();
		while (!driver.findElement(By.cssSelector(".flatpickr-current-month")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
		}

		// driver.findElement(By.cssSelector(".form-field-travel_comp_date")).click();
		List<WebElement> alldate = driver.findElements(By.cssSelector(".flatpickr-day "));
		int count = driver.findElements(By.cssSelector(".flatpickr-day ")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).click();
				break;
			}
		}

	}

}
