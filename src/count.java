import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class count {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\prabkris\\Sel0\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.qaclickacademy.com/practice.php");
	
		
	//driver.findElement(By.tagName("a"))
	
	
	System.out.println(driver.findElements(By.tagName("a")).size());
	
	driver.close();
}

}
