package ReUse;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeToTextFile 
{
	public static void writeToTempTextFile(String description,String userName,String password,String emailId,String reportPath,String excelPath)
	{
		try {
            FileWriter writer = new FileWriter("mailContent.txt", false);
            writer.write("\r\n");   // write new line
            writer.write(description);
            writer.write("\r\n");   // write new line
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
	
	public static void writeToTempTextFileSingleString(String data,Boolean setter)
	{
		try {
            FileWriter writer = new FileWriter("mailContent.txt", setter);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.newLine();   
            writer.write(data);  
            bufferedWriter.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
	}
}
