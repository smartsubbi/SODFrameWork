package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLighter 
{	
	public static void elementHighLight(WebDriver driver,WebElement element) throws Throwable
	{		
		JavascriptExecutor js=(JavascriptExecutor)driver;		
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);		
		Thread.sleep(500);		
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
	}	
}
