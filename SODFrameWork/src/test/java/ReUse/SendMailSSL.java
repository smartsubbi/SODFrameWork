package ReUse;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailSSL
{
	
	public static void sendMail(String mailContent,String mailSubject) 
	{
		System.out.println("Sending Mail : Started");
		String customEmailID = System.getProperty("emailid");
		if(customEmailID==null)
		{
			customEmailID="seleniumsubbu@gmail.com";
		}
		Properties props = new Properties();
		props.put("mail.smtp.host", "192.168.254.33");
//		props.put("mail.smtp.host", "smtp.gmail.com");
//		props.put("mail.smtp.socketFactory.port", "465");
//		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
//		props.put("mail.smtp.auth", "true");
//		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() 
		{
				protected PasswordAuthentication getPasswordAuthentication() 
				{
					return new PasswordAuthentication("subramanyakb","Blademaster4");
				}
		});

		try 
		{
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("subramanyakb@jumpstart.com"));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("subramanyakb@jumpstart.com,smartsubbi@gmail.com,seleniumsubbu@gmail.com"));			
			message.setSubject(mailSubject);
			message.setText(mailContent);			
			Transport.send(message);
			System.out.println("Done");
		}
		catch (MessagingException e) 
		{
			System.out.println("Error sending mail : Refer to below stacktrace");
			e.printStackTrace();			
		}
		System.out.println("Sending Mail : Finished");
	}
}
