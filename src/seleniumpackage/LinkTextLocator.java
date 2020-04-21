package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Using Link text locator
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chetan kamble\\Java_Programes\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgotten account?")).click();
        Thread.sleep(200);
		driver.quit();
		
		

	}

}
