package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookUsernameAndPassword {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
         
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	//Using - Id
	//WebElement email = driver.findElement(By.id("email"));
	//email.sendKeys("soniyakamble.2011@rediffmail.com");
	
	//Using -Xpath
	//WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	//email.sendKeys("soniyakamble.2011@rediffmail.com");
	
	
	//Using -ClassName (Need to clarify
	driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("soniyakamble.2011@rediffmail.com");
   //email.sendKeys("soniyakamble.2011@rediffmail.com");
	
	WebElement pass =  driver.findElement(By.id("pass"));
	pass.sendKeys("chetu7829378041");
	
	
    
	
	
	

	
	
	
     
	
		
		
	}

}
