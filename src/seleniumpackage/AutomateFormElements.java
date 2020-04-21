package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomateFormElements {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chetan kamble\\Java_Programes\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.findElement(By.xpath("//input[@name='firstname'][@type='text']")).sendKeys("soniya kamble");
		driver.findElement(By.xpath("//input[@type='text'][@name='lastname']")).sendKeys("shetty");
		driver.findElement(By.xpath("//input[@name='sex'][@type='radio'][@value='Female'][@id='sex-1']")).click();
		driver.findElement(By.xpath("//input[@id='exp-1']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker'][@type='text']")).sendKeys("02022020");
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		driver.findElement(By.xpath("//input[@id='tool-2'][@value='Selenium Webdriver']")).click();
		Select dropdown = new Select(driver.findElement(By.id("selenium_commands")));
     	dropdown.selectByVisibleText("Switch Commands");

	}
}
