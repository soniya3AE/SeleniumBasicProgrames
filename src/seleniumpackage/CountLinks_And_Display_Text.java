package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks_And_Display_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chetan kamble\\Java_Programes\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com");
		//Write programe to count the how many number of links are available in the ebay.com 
		List <WebElement> Linklist =  driver.findElements(By.tagName("a"));
		System.out.println("the number of links on the ebay website");
		System.out.println(Linklist.size());
		
		for(int i=0; i <Linklist.size(); i++) {
			String textLink= Linklist.get(i).getText();
			System.out.println(textLink);
		}
		
		driver.quit();
		
		
	}

}
