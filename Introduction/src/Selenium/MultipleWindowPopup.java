package Selenium;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowPopup {

public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "/Users/userName/sel/chromedriver");
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
    driver.get("https://skpatro.github.io/demo/links/");
 
    driver.findElement(By.name("NewWindow")).click();
    Set<String> windows = driver.getWindowHandles(); //s holds the set of all browser windows
    
    System.out.println("No. of browser windows opened - " + windows.size());
    
    for(String window : windows){
        if(!mainWindow.equals(window)) { //skip main window switching now
            driver.switchTo().window(window);
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());
        }
    }

    driver.switchTo().window(mainWindow); //return back to main window
    //do some testing on main window
 
    driver.quit();
   }
}