import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase4 {

		
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\prabkris\\Sel0\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	
	//driver.findElement(By.id("email")).sendKeys("sgprabhakar@yahoo.com");
	//driver.findElement(By.id("pass")).sendKeys("user1285");
	//driver.findElement(By.id("u_0_4")).
	//driver.findElement(By.linkText("Forgotten account?")).click();
	
	driver.findElement(By.cssSelector("#email")).sendKeys("abc@jlr.com");
	driver.findElement(By.cssSelector("#pass")).sendKeys("Pwd");
	//driver.findElement(By.cssSelector("#u_0_7")).click();
	
	driver.findElement(By.xpath("//input[@data-testid = 'royal_login_button']")).click();
	
	driver.quit();
	
	driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
	
	
	
	
	
	
	System.out.println(driver.getCurrentUrl());
	
	
		
	}
	
	
}
