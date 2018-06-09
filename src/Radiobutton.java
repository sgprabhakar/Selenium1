import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "D:\\prabkris\\Sel0\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://echoecho.com/htmlforms10.htm");
			
			driver.findElement(By.xpath("//input[@value = 'Cheese']")).click();
			
			System.out.println(driver.findElements(By.xpath("//input[@name ='group1']")).size());
		
			
			
			
			
			
	}
	
}
