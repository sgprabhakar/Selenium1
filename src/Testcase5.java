import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\prabkris\\Sel0\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("abc");
		driver.findElement(By.id("password")).sendKeys("passowrd");
		//driver.findElement(By.className("button r4 wide primary")).click();
		
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
	String val = 	driver.findElement(By.cssSelector("div#error.loginError")).getText();
	String actv = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	
	
	System.out.println(val);
	System.out.println(actv);
	if (val == actv){
		System.out.println("Test case for validation passed");
		
		
		
	}else{
		
		System.out.println("Test case failed");
		
	}
	
		
		driver.quit();
		
	}
	
}
