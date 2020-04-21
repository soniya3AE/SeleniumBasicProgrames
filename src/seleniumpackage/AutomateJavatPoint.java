package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateJavatPoint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\chetan kamble\\Java_Programes\\selenium\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.javatpoint.com");
		 driver.manage().window().maximize();
		 WebElement search  = driver.findElement(By.name("search"));
		 search.sendKeys("Java");
		 Thread.sleep(2000);
		 driver.quit();	
	}

}
