package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateEdureka {
   
	static WebElement  categories;
	static WebElement  subMenu;
	static WebElement  course;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chetan kamble\\Java_Programes\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//Delete all cookies
		driver.manage().deleteAllCookies();
		//Make browser wait for certain period of time
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//launch website
		
		  driver.get("https://edureka.co");
		
		  categories = driver.findElement(By.xpath("//a[@class='cat_btn hidden-xs giTrackElementHeader']"));
		  subMenu = driver.findElement(By.xpath("//li[@class='course_category_name_menu']//a[@id='software-testing-certification-courses']"));
		  course = driver.findElement(By.id("c535"));

		  Actions action = new Actions(driver);
		  action.moveToElement(categories).perform();
		  action.moveToElement(subMenu).perform();
		  action.moveToElement(course).click().perform();
		  Thread.sleep(3000);

		 driver.close();
	}

}
