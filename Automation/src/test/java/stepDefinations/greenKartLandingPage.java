package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class greenKartLandingPage {
	public WebDriver driver;
	public String landingPageroductName;
	public String offerPageProductName;
	@Before
	public void setup() {
		driver = new ChromeDriver();
	}

	
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	   
	}
	@When("user searched with Shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(shortName);
		Thread.sleep(2000);
		landingPageroductName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		System.out.println(landingPageroductName + " " + "is extracted from home page");
	}

	    
	
	@Then("user searched for shortname  {string} in offers page")
	public void user_searched_for_shortname_in_offers_page(String shortName) throws InterruptedException {
		driver.findElement(By.linkText("Top Deals")).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();

		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(shortName);
		Thread.sleep(3000);
		offerPageProductName = driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();

	  
	}
	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(landingPageroductName, offerPageProductName);
	   
	}



}
