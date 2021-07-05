package randomTestPack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class headlessChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mrinmoy\\Selenium_Driver\\chromedriver.exe"); 
		ChromeOptions option=new ChromeOptions();
		
		//option.addArguments("--no-sandbox");
		option.addArguments("--headless");		
		//option.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(option);
		//WebDriver driver=new ChromeDriver();  
		//driver.manage().window().maximize(); 	
		//driver.navigate().to("http://www.javatpoint.com/");
		driver.get("http://learn-automation.com/");
		System.out.println("Title is: "+driver.getTitle());
		driver.close();
	}
}
