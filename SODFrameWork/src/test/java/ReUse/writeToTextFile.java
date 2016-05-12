package ReUse;

import java.io.FileWriter;
import java.io.IOException;

public class writeToTextFile 
{
	public void writeToTempTextFile(String userName,String password,String emailId,String reportPath,String excelPath)
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
