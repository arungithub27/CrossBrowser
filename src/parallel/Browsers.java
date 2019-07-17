package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	static WebDriver driver;
	
	public static void chrome(){
		System.setProperty("webdriver.chrome.driver", "D:\\E-Backup\\Automation\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
	
	public static void gecko(){
		System.setProperty("webdriver.gecko.driver", "D:\\E-Backup\\Automation\\Drivers\\FirefoxDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	/*public static void IE(){
		System.setProperty("webdriver.edge.driver", "D:/E-Backup/Automation/Drivers/InternetExplorerDriver/edgedriver_win64/MicrosoftWebDriver.exe");
        driver = new EdgeDriver();
	}
	*/
	
	public static void main (String[] args){
		Browsers.chrome();
		Browsers.gecko();
		  //Browsers.IE();
		
		driver.get("http://secure.payrollspan.net/");
	}
	
}
