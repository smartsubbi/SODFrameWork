package ReUse;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SendMail 
{	
	@Test
	public static void sendMail(WebDriver driver,String subject, String mailContent, String age, String userName, String password, String emailAddress, String authorisedOrNot) throws Exception
	{		
		String emailIdToSend = System.getProperty("emailid");
		if(emailIdToSend==null)
		{
			emailIdToSend="smartsubbi@gmail.com";
		}
		driver.get("https://mail.google.com/");		
		Thread.sleep(5000);		
		driver.findElement(By.id("Email")).sendKeys("seleniumsubbu");		
		Thread.sleep(5000);		
		driver.findElement(By.id("next")).click();		
		Thread.sleep(5000);		
		driver.findElement(By.id("Passwd")).sendKeys("blademaster1");		
		Thread.sleep(5000);		
		driver.findElement(By.id("signIn")).click();		
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//div[.='COMPOSE']")).click();		
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//textarea[@aria-label='To']")).sendKeys("smartsubbi@gmail.com");		
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//span[.='Cc']")).click();		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//textarea[@aria-label='Cc']")).sendKeys("subramanyakb@jumpstart.com");		
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(subject);		
		Thread.sleep(5000);			
		String content = mailContent+"Age is : "+age+"\nUserName is : "+userName+"\nPassword is : "+password+"\nEmailId is : "+emailAddress+"\nAuthorised : "+authorisedOrNot;		
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys(content);		
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//div[.='Send']")).click();		
		Thread.sleep(5000);		
		driver.close();
		driver.quit();		
	}
	
	
	@Test
	public static void sendMailOnlyContent(WebDriver driver, String subject, String content) throws Exception
	{	
		String emailIdToSend = System.getProperty("emailid");	
		if(emailIdToSend==null)
		{
			emailIdToSend="smartsubbi@gmail.com";
		}
		driver.get("https://mail.google.com/");		
		Thread.sleep(5000);		
		driver.findElement(By.id("Email")).sendKeys("seleniumsubbu");		
		Thread.sleep(5000);		
		driver.findElement(By.id("next")).click();		
		Thread.sleep(5000);		
		driver.findElement(By.id("Passwd")).sendKeys("blademaster1");		
		Thread.sleep(5000);		
		driver.findElement(By.id("signIn")).click();		
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//div[.='COMPOSE']")).click();		
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//textarea[@aria-label='To']")).sendKeys("smartsubbi@gmail.com");			
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//span[.='Cc']")).click();		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//textarea[@aria-label='Cc']")).sendKeys("subramanyakb@jumpstart.com");	
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(subject);	
		Thread.sleep(5000);				
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys(content);			
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//div[.='Send']")).click();		
		Thread.sleep(5000);		
		driver.close();
		driver.quit();		
	}
	
	public static void writeToTempTextFile(String userName,String password,String emailId,String reportPath,String excelPath)
	{
		try {
            FileWriter writer = new FileWriter("mailContent.txt", true);
            writer.write("===================================================");
            writer.write("\r\n");   // write new line
            writer.write(userName);
            writer.write("\r\n");   // write new line
            writer.write(password);
            writer.write("\r\n");   // write new line
            writer.write(emailId);
            writer.write("\r\n");   // write new line
            writer.write(reportPath);
            writer.write("\r\n");   // write new line
            writer.write(excelPath);
            writer.write("\r\n");   // write new line
            writer.write("===================================================");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
	}
}
