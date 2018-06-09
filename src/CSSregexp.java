import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSregexp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\prabkris\\Sel0\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.rediff.com/");
		//driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		
		
		System.out.println(driver.getCurrentUrl());
	     driver.findElement(By.cssSelector("#login1")).sendKeys("abc");
		driver.findElement(By.cssSelector("input#password")).sendKeys("PSW");
		driver.findElement(By.xpath("//*[@type ='submit']")).click();
		driver.quit();
		
		//*[@id="login1"]
		
		//#login1
}
	
}
