package randomTestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class headlessCh {

@Test
public void myfirst()
{
	System.out.println("==================");
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mrinmoy\\Selenium_Driver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();  
		driver.navigate().to("http://www.javatpoint.com/");  
		driver.manage().window().maximize(); 	
		System.out.println("==================");
	
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	
}

}