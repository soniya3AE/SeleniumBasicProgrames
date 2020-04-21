package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateTheDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chetan kamble\\Java_Programes\\TestNgProjects\\Drivers\\chromedriver.exe");
		// To open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		System.out.println("Adult count before selecting the adult count");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']//option[contains(text(),'5')]")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		System.out.println("*********************************************");
		System.out.println("The adult and  child counts as mentioned bellow");
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']//option[contains(text(),'2')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		System.out.println("*********************************************");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']//option[contains(text(),'2')]")).click();
		System.out.println("The adult,child  and infanrs counts as mentioned bellow");
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		System.out.println("*********************************************");
		Thread.sleep(2000);
		driver.quit();
		
	}	

}
