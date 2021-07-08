package randomTestPack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.browser.Browser;
import org.testng.annotations.Test;
public class Login {
	@Test
	public void LoginTC() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/Mrinmoy/Documents/Study_Materials/Eclipse_Projects/Selenium_Drivers/chromedriver"); 
		WebDriver driver=new ChromeDriver();  
		driver.navigate().to("https://www.facebook.com//");  
		driver.manage().window().maximize(); 	
		LoginPageObjectEncapsulation rd=new LoginPageObjectEncapsulation(driver);
		rd.EmailID().sendKeys("Hello");
		rd.Password().sendKeys("Hello");
		
	}
}
