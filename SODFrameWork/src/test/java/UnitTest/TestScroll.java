package UnitTest;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Factory.ConfigDataProviderFactory;
import Factory.EnvironmentFactory;
import Pages.CommonHeader;
import Pages.MembershipPage;
import Utility.CaptureScreenshot;

public class TestScroll 
{

	
	static DateFormat dateFormat = new SimpleDateFormat("E.MMMM.yyyy_HH.mm.ss[a]");
	static Date date = new Date();
	static String userDirectory =  System.getProperty("user.dir");
	static String emailReportPath = userDirectory+"/ExtentReports/SchoolOfDragonsLive_" +dateFormat.format(date) + ".html";
	static String path = userDirectory.replace("\\","/");
	static String reportPath = "\\\\172.20.11.105\\d\\JenkinsWorkspace\\LiveLoginTestCases\\ExtentReports\\SchoolOfDragonsLive_" +dateFormat.format(date) + ".html";	
	WebDriver driver;
	
	
//	@Test
//	public static void getIp() throws Throwable
//	{
////		InetAddress address = InetAddress.getLocalHost(); 
////	    String hostIP = address.getHostAddress() ;
////	    String hostName = address.getHostName();
////	    System.out.println( "IP: " + hostIP + "\n" + "Name: " + hostName);	    
////	    String splitDir[] = userDirectory.split(":");  
////		System.out.println(splitDir[1]); 		
////		String finalPath = "\\\\"+hostIP+splitDir[1];
////		System.out.println(finalPath);
//		
		//static File dir1 = new File("directory-source");
//		
//		if(dir1.isDirectory()) 
//		{
//		    File[] content = dir1.listFiles();
//		    System.out.println(content.length);
//		    for(int i = 0; i < content.length; i++) 
//		    {
//		    	File sourceFile = new File("D:/Files/"+content[i]);
//		    	File destinationFile = new File("D:/Files1/"+content[i]);		        
//		        FileUtils.moveFile(sourceFile, destinationFile);
//		    }
//		    System.out.println(content.length);
//		}
//	}
	
	public static void main(String[] args) throws IOException {

		//File sourceFile = new File("directory-source/test1.txt");
		File destinationDir = new File("directory-destination");		
		File sourceDir = new File("directory-source");
		//System.out.println(sourceFile);

		//FileUtils.moveFileToDirectory(sourceFile, destinationDir, true);
		
		
		if(destinationDir.isDirectory()) 
			{
			    File[] content = sourceDir.listFiles();
			    
			    System.out.println(content.length);
			    for(int i = 0; i < content.length; i++) 
			    {
			    	//sourceFile = new File(content[i]);
			    	System.out.println(content[i]);
			    	FileUtils.moveFileToDirectory(content[i], destinationDir, true);			
			    }
			    System.out.println(content.length);

	}
	}
	
	
	public void testAuthChrome() throws Throwable
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ConfigDataProviderFactory.getConfig().getChromePath());
		driver = new ChromeDriver();
		//Runtime.getRuntime().exec("C:\\Users\\subramanyakb\\Desktop\\ChromeAuthetication.exe");
		driver.get("http://qa.schoolofdragons.com/");
		
		System.out.println("Website opened");
		
		Thread.sleep(15000);
		
		CaptureScreenshot.takeScreenshot(driver, "Application");
		
		System.out.println("Screenshot taken");
		
		Thread.sleep(15000);
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='ctl00_logindiv']/a[2]")).isDisplayed());
		
		System.out.println("Element is present");	
		
		driver.close();
		driver.quit();
		
		System.out.println("Closed all");
		
	}
	
	
	public void verifyMembershipPage() throws Throwable
	{		
		MembershipPage membershipPage = PageFactory.initElements(driver, MembershipPage.class);
		CommonHeader header = PageFactory.initElements(driver, CommonHeader.class);
		driver.get("http://www.schoolofdragons.com");
		driver.manage().window().maximize();
		header.clickHeaderLoginLink();			
		Thread.sleep(10000);
		driver.findElement(By.id("ctl00_mcp_tbUserName")).sendKeys("subbuplayer");
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_mcp_tbPassword")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_mcp_btnLogin")).click();			
		Thread.sleep(5000);		
		System.out.println("Clicking membership tab");
		header.clickMembershipTab();
		System.out.println("Clicking membership tab done");
		Thread.sleep(10000);				
		//membershipPage.verifyAllMembersipOptionsAndFeatures();		
		//membershipPage.verifySelectPaymentMethodDBandPaymentForm();				
	}
	
	@Test
	public void UrlParser() throws Throwable
	{
		String environment = System.getProperty("environment");
		String url = EnvironmentFactory.setURL("Production", driver);
//		System.setProperty("webdriver.chrome.driver", ConfigDataProviderFactory.getConfig().getChromePath());
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("user-data-dir=C:\\Users\\subbu\\AppData\\Local\\Google\\Chrome\\User Data");	
//		capabilities.setCapability("chrome.binary", ConfigDataProviderFactory.getConfig().getChromePath());
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);		
//		WebDriver driver = new ChromeDriver(capabilities);		
		String s = new String("–".getBytes("UTF-8"), "UTF-8");;
        System.out.println(s);
//        InputStream is = new ByteArrayInputStream(inputText.getBytes("UTF-8"));
//		String title = "Login – How to Train Your Dragon Game – School of Dragons";
//		String value = new String(title,"UTF-8");
//		System.out.println();
//		System.out.println(url);		
//        driver = BrowserFactory.getBrowser("chrome");
//        driver.get(url);
//        Thread.sleep(5000);
//        CaptureScreenshot.takeScreenshot(driver, "Application");
//        BrowserCredentialLogger.credentialSetter("Production", "HomePage");   
//        Thread.sleep(30000);
//        waitForPageLoaded();
//        CaptureScreenshot.takeScreenshot(driver, "Application");
//        driver.findElement(By.xpath("//div[@id='ctl00_logindiv']/a[@title='Log in']")).click();
//        Thread.sleep(5000);
//        BrowserCredentialLogger.credentialSetter("Qa", "LoginPage");
//        Thread.sleep(5000);
//        driver.findElement(By.xpath(".//*[@id='ctl00_mcp_tbUserName']"));
//		driver.close();
//		driver.quit();		
	}
	
	  public void waitForPageLoaded() 
	  {
	        ExpectedCondition<Boolean> expectation = new
	                ExpectedCondition<Boolean>() 
	                {
	                    public Boolean apply(WebDriver driver) 
	                    {
	                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
	                    }
	                };
	        try 
	        {
	            Thread.sleep(1000);
	            WebDriverWait wait = new WebDriverWait(driver, 30);
	            wait.until(expectation);
	            System.out.println("Page Loaded");
	        } catch (Throwable error) {
	            Assert.fail("Timeout waiting for Page Load Request to complete.");
	        }
	    }
}

//try {
//	Runtime.getRuntime().exec("C:\\Users\\subbu\\Desktop\\Logger.exe");
//} catch (Exception e) {
//	e.printStackTrace();
//}	
