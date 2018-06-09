import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Testcase3 {

	public static void main(String[] args) {
		
		System.setProperty("wedriver.ie.driver", "D:\\prabkris\\Sel0\\MicrosoftWebDriver.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
	}
	
}
