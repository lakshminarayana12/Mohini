import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {
	public WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}
	
	@BeforeMethod
	public void OpenSetUp() {
		driver= new ChromeDriver();
	driver.get("http://freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
		}

	@Test
	public void LoginTest() {
		System.out.println("System");
		
	}
}
