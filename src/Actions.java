import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Actions {

	
public Actions(WebElement webElement) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\prabkris\\Sel0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com/");
		
		//driver.manage().window().maximize();
		//Actions a = new Actions(driver);
		
		Actions b  = new Actions((WebElement) driver);
		
	
	Actions a = new Actions(driver.findElement(By.cssSelector("a[id='nav-link-accountList']")));
			
			
		
			
					
		
}
}
