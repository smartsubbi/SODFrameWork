package Utility;

import java.io.IOException;

public class BrowserCredentialLogger
{

	public static void mozillaCredentialsLogger()
	{
		try {
			Runtime.getRuntime().exec("MozillaAuthenticationScript.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void chromeQaCredentialLoggerHomePage()
	{
		try {
			Runtime.getRuntime().exec("CredentialLoggers/chromeHomePageQA.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void chromeQaCredentialLoggerLoginPage()
	{
		try {
			Runtime.getRuntime().exec("CredentialLoggers/chromeLoginPageQA.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void chromeQaCredentialLoggerSignUpPage()
	{		
		try {
			Runtime.getRuntime().exec("CredentialLoggers/chromeSignUpPageQA.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void setQaPages(String page)
	{
		if(page.equals("HomePage"))
		{
			chromeQaCredentialLoggerHomePage();
		}
		else if(page.equals("LoginPage"))
		{
			chromeQaCredentialLoggerLoginPage();
		}
		else if(page.equals("SignUpPage"))
		{
			chromeQaCredentialLoggerSignUpPage();
		}
		else
		{
			System.out.println("Invalid Page");
		}
	}
	
	public static void credentialSetter(String env, String page)
	{
		if(env.equals("Qa"))
		{
			setQaPages(page);
		}		
	}	
}
