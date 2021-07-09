package randomTestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.browser.Browser;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void LoginTC() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mrinmoy\\Selenium_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com//");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		LoginPageObjectEncapsulation rd = new LoginPageObjectEncapsulation(driver);
		rd.EmailID().sendKeys("Hello");
		rd.Password().sendKeys("Hello");
		Thread.sleep(5000);
		// driver.quit();
		driver.close();

	}
}
