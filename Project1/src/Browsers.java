import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.*;


public class Browsers {

	public static void main(String[] args) {
		
		FirefoxDriver d1 = new FirefoxDriver();
	
		
		d1.get("http://yahoo.com");
		
		
		
		List<WebElement>  matches = new ArrayList<WebElement> ();
		
		
		
	    int i  =  matches.size();
	    System.out.println(i);
		  
	     matches.get(i-1).click();  
		
	     System.out.println(matches.get(i-1).getText() );
	    	
				
	}

}
