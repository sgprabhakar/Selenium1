import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Isdispayed {

	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\prabkris\\Sel0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.makemytrip.com/");
		
		//new Actions(driver).sendKeys(Keys.ESCAPE).build().perform();
		
		driver.findElement(By.id(id))
	
//before selecting multicity.
		
		
	
		
System.out.println(" Before cliking on Multi city Radio button");
		
//*[@id="js-MultiCityOptions"]/div/div[1]

System.out.println(driver.findElement(By.xpath(".//*[@id='js-MultiCityOptions']/div/div[1]")).isDisplayed());


//After selecting the multi city

driver.findElement(By.xpath("//*[@id='multicity']/label")).click();

System.out.println(driver.findElement(By.xpath(".//*[@id='js-MultiCityOptions']/div/div[1]")).isDisplayed());

//*[@id="multicity"]/label




}

}