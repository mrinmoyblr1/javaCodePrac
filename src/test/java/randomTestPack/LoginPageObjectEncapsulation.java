package randomTestPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPageObjectEncapsulation {
	public WebDriver driver;
	private By userName=By.xpath("//input[@id='email']");
	private By password=By.xpath("//input[@id='pass']");
	public LoginPageObjectEncapsulation(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement EmailID()
	{
		return driver.findElement(userName);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}	
}
