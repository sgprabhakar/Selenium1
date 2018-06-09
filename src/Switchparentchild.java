import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchparentchild {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\prabkris\\Sel0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("Before click parent title");
		System.out.println(driver.getTitle());
		
		Set<String>ids = driver.getWindowHandles();

		
		
		
		driver.findElement(By.id("gb_70")).click();
		System.out.println("after click");	
		
		Iterator<String> it = ids.iterator();
		//	Iterator<String> it = null;
			String parentid  = it.next();
			String childid = it.next();
			//
			driver.switchTo().window(childid);
			System.out.println("from child window");
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println("switching back to parent");
		System.out.println(driver.getTitle());
		
		
	}
	
	
}
