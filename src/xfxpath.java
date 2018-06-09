import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xfxpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\prabkris\\Sel0\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	//using custom xpath to login
	
		
	/*driver.findElement(By.xpath("//input[@type ='email']")).sendKeys("myown xpath");
	
	driver.findElement(By.xpath("//input[@name = 'pass']")).sendKeys("abc");
	
			
	driver.findElement(By.xpath("//input[@data-testid ='royal_login_button']")).click();
	
	System.out.println(driver.getCurrentUrl());*/
	
	
	
	//using custon css selector to login
	
	
	driver.findElement(By.cssSelector("input[type ='email']")).sendKeys("myown css");
	driver.findElement(By.cssSelector("input[name = 'pass']")).sendKeys("abc");
	driver.findElement(By.cssSelector("input[data-testid ='royal_login_button']")).click();
	System.out.println(driver.getCurrentUrl());
	driver.quit();
	
	
	
	
}


}
