import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("wedriver.gecko.driver", "D:\\prabkris\\Sel0\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
			
		
	}

}
