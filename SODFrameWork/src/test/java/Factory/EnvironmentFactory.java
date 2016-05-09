package Factory;

import org.openqa.selenium.WebDriver;

public class EnvironmentFactory 
{	
	static String url;
	
	public static String setURL(String env,WebDriver driver)
	{
		if(env.equals("Qa"))
		{
			System.out.println("QA Environment");
			url = "http://qa.schoolofdragons.com/";			
		}
		else if(env.equals("Staging"))
		{
			System.out.println("QA Environment");
			url = "http://staging.schoolofdragons.com/";
		}
		else if(env.equals("Dev"))
		{
			System.out.println("Dev Environment");
			url = "http://dev.schoolofdragons.com/";
		}
		else if(env.equals("Production"))
		{
			System.out.println("Production Environement");
			url = "http://www.schoolofdragons.com/";
		}
		else
		{
			System.out.println("Invalid URL");
		}		
		return url;
	}
}
