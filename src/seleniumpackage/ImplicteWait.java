package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicteWait {

	public static void main(String[] args, TimeUnit TimesUnit, Object SECONDS) {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chetan kamble\\Java_Programes\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Thread.sleep() is hard wait.which is not good.
        
		//These is dynamic implicate wait to allow entire page load then tell selenium webdriver start operations
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimesUnit);
		driver.get("https://www.ebay.com");
		
	}

}
