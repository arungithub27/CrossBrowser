package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 

public class twobrowsers {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser){
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\E-Backup\\Automation\\Drivers\\FirefoxDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\E-Backup\\Automation\\Drivers\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
	}

	@Test
	public void homepage(){
		
		driver.get("http://secure.payrollspan.net/");
	
		driver.findElement(By.id("EmailAddress")).sendKeys("arunkumar.dhanasekar+always2@spanllc.com");
		driver.findElement(By.id("Password")).sendKeys("Arun@123");
		driver.findElement(By.id("btnsignin")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/nav/div/div/ul/li[9]/a/span[2]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
		
	}
}
