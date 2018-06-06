import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Count {

	public static void main(String[] args) throws InterruptedException {
		
	
		//Chromedriver Path
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		//chromedriver object created
		WebDriver driver = new ChromeDriver();
		//open the url
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		
		
		 System.out.println(driver.findElements(By.tagName("a")).size());
		 
		 
		 //Radiobutton
		 driver.findElement(By.xpath(".//input[@value='radio3']")).click();
		 
		 
		 
		 //Edit box
		 driver.findElement(By.id("autocomplete")).sendKeys("abc1");
		 
		//Dropbox
		 Select id = new Select(driver.findElement(By.id("dropdown-class-example")));
		id.selectByIndex(3);
		
		//Checkbox;
		
		driver.findElement(By.xpath(".//input[@id ='checkBoxOption3']")).click();
		
		int count = driver.findElements(By.tagName("a")).size();
		
				
		WebElement Footerdriver = 	driver.findElement(By.id("gf-BIG"));
			
					System.out.println(Footerdriver);
					
			System.out.println(Footerdriver.findElements(By.tagName("a")).size());
			
		/*for(int i = 0; i<=Footerdriver.findElements(By.tagName("a")).size(); i++){
			
			String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			
			
		}*/
		
		WebElement Columnone = Footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(Columnone.findElements(By.tagName("a")).size());
			
	for (int i= 1; i <Columnone.findElements(By.tagName("a")).size(); i++){
		
		
			String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			Columnone.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			
			Thread.sleep(5000);;
		
	}
	
	Set<String> abc = driver.getWindowHandles();
	Iterator<String> it = abc.iterator();
			 
			while(it.hasNext()) {
				
				driver.switchTo().window(it.next());
				
		System.out.println(driver.getTitle());
				
						
			}
				
		}
		
			
}
