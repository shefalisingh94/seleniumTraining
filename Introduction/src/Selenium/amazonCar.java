package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        // Set up webdriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to website
	        driver.get("https://www.amazon.com/");
	        
	        // Find carousel element
	        WebElement carousel = driver.findElement(By.xpath("//*[@id='hero']/div/div[2]/div"));

	        // Find next button element
	        WebElement nextButton = carousel.findElement(By.xpath("//*[@id='hero']/div/div[2]/div/div/div[2]/div[2]"));

	        // Click on next button
	        nextButton.click();
	        
	        //Verify the carousel element
	        WebElement currentItem = carousel.findElement(By.xpath("//*[@id='hero']/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/a/div/img"));
	        String currentItemText = currentItem.getAttribute("alt");
	        if(currentItemText.equals("Expected Text")){
	            System.out.println("Carousel navigated to the correct item");
	        }else{
	            System.out.println("Carousel did not navigate to the correct item");
	        }
	        
	        // Close the browser
	        driver.quit();
	    }
	}


