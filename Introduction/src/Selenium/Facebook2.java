package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("shefalisinghprincess@gmail.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("9001778997");
		driver.findElement(By.cssSelector("input[name='login']")).click();
		
		driver.close();



	}

}
