package redbuspack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSelection {
	static WebDriver driver;
	
	public static WebDriver UsingChrome()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");		
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		return driver;
	}		
}
