import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACT {
	

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.amazon.com/");
	
 //try {
	Thread.sleep(100);
//} catch (InterruptedException e) {
	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
	
	
	Actions a = new Actions(driver);
		
	WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList"));
	
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown().

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hello");
	
	
	
	//sendKeys("hello").build().perform();
	
	a.moveToElement(move).build().perform();
	
	
	
	
}
}