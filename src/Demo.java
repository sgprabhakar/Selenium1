import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\prabkris\\Sel0\\chromedriver.exe" );
		
WebDriver driver = new ChromeDriver();
	driver.get("http://google.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close(); //closes current browser;
	driver.quit(); //closes all browser including child window
			
	}

}
