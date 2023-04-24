package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PracticeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		 //1st Assignment
		driver.get("http://google.com");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());
		
		
		
*/
        //2nd Assignment 
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("shefali");
		driver.findElement(By.name("email")).sendKeys("shefali123@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("shefali123");
		driver.findElement(By.cssSelector("#exampleCheck1")).isSelected();
		driver.findElement(By.cssSelector("#exampleCheck1")).click();

		WebElement dropdownSel= driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(dropdownSel);
		dropdown.selectByIndex(1);
		dropdown.getFirstSelectedOption().getText();
		System.out.println(driver.findElement(By.id("inlineRadio1")).isSelected());
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name=\"bday\"]")).sendKeys("24/4/2023");
		driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
		
	}

}
