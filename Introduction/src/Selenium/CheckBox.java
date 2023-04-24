package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse((driver.findElement(By.cssSelector("div[id*='SeniorCitizenDiv']")).isSelected()));
		//System.out.println(driver.findElement(By.cssSelector("div[id*='SeniorCitizenDiv']")).isSelected());
		driver.findElement(By.cssSelector("div[id*='SeniorCitizenDiv']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("div[id*='SeniorCitizenDiv']")).isSelected());
		
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*=\"ctl00_mainContent_rbtnl_Trip_1\"]")).isEnabled());
		driver.findElement(By.cssSelector("input[id*=\"ctl00_mainContent_rbtnl_Trip_1\"]")).getAttribute("style");
		driver.findElement(By.cssSelector("input[id*=\"ctl00_mainContent_rbtnl_Trip_1\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=\"ctl00_mainContent_rbtnl_Trip_1\"]")).isEnabled());
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
			System.out.println("its enabled");
			Assert.assertTrue(true);
			
		}
		else {
		Assert.assertTrue(false);	
		}
		
		//count the number of checkboxes
		//System.out.println(driver.findElements(By.cssSelector("input[type*='checkbox'])")).size());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		//driver.close();
		


	}

}
