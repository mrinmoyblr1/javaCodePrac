package randomTestPack;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.browser.Browser;
import org.testng.annotations.Test;
public class PropartiesFile {
	@Test
	public void Login() throws IOException
	{
		// Reading values from Properties file
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("/Users/Mrinmoy/Documents/Study_Materials/Eclipse_Projects/javaCodePrac/src/main/java"
				+ "/javaCodePrac/config.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "/Users/Mrinmoy/Documents/Study_Materials/Eclipse_Projects/Selenium_Drivers/chromedriver"); 
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));		
		
		// Writing values to Properties file
		FileOutputStream fos=new FileOutputStream("/Users/Mrinmoy/Documents/Study_Materials/Eclipse_Projects/javaCodePrac/src/main/java"
				+ "/javaCodePrac/config.properties");
		String urlnm=driver.getTitle();
		String newURL=driver.getCurrentUrl();
		prop.setProperty("Title", urlnm);
		prop.setProperty("NewURL", newURL);
		prop.store(fos, null);
		
	}
}
