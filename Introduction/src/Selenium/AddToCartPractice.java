package Selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// WebDriverWait w =new WebDriverWait(driver,5);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] itemName = { "Cucumber", "Brocolli", "Beetroot", "Tomato" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//// button[text()="ADD TO CART"]
		Thread.sleep(3000);

		addedItem(driver, itemName);
		driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		// explicit wait

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());

	}

	public static void addedItem(WebDriver driver, String[] itemName) {
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] productName = products.get(i).getText().split("-");
			String formattedName = productName[0].trim();
			// Covert Array into ArrayList
			List itemNeededList = Arrays.asList(itemName);

			if (itemNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// div[@class='product-action']/button

				if (j == itemName.length) {
					break;
				}

			}
		}

	}

}
