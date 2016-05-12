package ReUse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.CaptureScreenshot;

public class AuthoriseMailMailinator 
{		
	public static void autoriseMail(String userName,WebDriver driver, ExtentTest logger) throws Throwable
	{	
		logger.log(LogStatus.INFO, "Opened Mailinator Site to check the Authorisation Mail");
		String mailinatorHomePageScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "mailinatorHomePageScreenshot"));
		logger.log(LogStatus.INFO, mailinatorHomePageScreenshot);		
		
		driver.findElement(By.id("inboxfield")).sendKeys(userName);	
		logger.log(LogStatus.INFO, "Entered the : "+userName+"to check the Autorisation Mail");
		String enterUsernameScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "enterUsernameScreenshot"));
		logger.log(LogStatus.INFO, enterUsernameScreenshot);
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//*[@class='input-group-btn']")).click();			
		Thread.sleep(5000);				
		logger.log(LogStatus.INFO, "Clicked on the Go Button on the homepage to check the Autorisation Mail");		
		
		logger.log(LogStatus.INFO, "Checking if the user has recived the authorisation mail");
		String authorisationMailRecievedScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "authorisationMailScreenshot"));
		logger.log(LogStatus.INFO, authorisationMailRecievedScreenshot);
		driver.findElement(By.xpath("//*[@id='public_maildirdiv']/div/div")).click();		
		Thread.sleep(5000);		
		scrollToBottom(driver);
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.id("publicshowmaildivcontent")));		
		String bodyText = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/strong")).getText();		
		Assert.assertTrue(bodyText.contains(userName),"Text not found!");	
		logger.log(LogStatus.INFO, "Verified if the Authorisation mail is of the username : "+userName);
		String authorisationMailScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "authorisationMailScreenshot"));
		logger.log(LogStatus.INFO, authorisationMailScreenshot);
		
		String authorisationUrl = driver.findElement(By.xpath("//*[@rel='nofollow']")).getAttribute("href");
		driver.get(authorisationUrl);		
		Thread.sleep(5000);		
	}

	 public static void scrollToBottom(WebDriver driver) throws Throwable 
	 {				 
		 Actions action = new Actions(driver);  
	     action.sendKeys(Keys.PAGE_DOWN);  
	     Thread.sleep(5000);  
	     action.click(driver.findElement(By.xpath("//html[@id='ng-app']/body/section/div/div[1]/img[@class='brand-img img-responsive']"))).perform();  	       
	 } 
}
