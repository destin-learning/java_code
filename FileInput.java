/* ---------------------------------------------------------------
  Chapter 17 File Input
  File: FileInput.java
  Description: demonstrate how to read a text file one line at a 
  time using BufferedReader
 ----------------------------------------------------------------- */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInput 
{
    public static void main(String[] args) 
    {
        // 17.1
        BufferedReader objReader = null;
        String strCurrentLine;

        // 17.2
        try 
        {
            // 17.3
            objReader = new BufferedReader(new FileReader("input.txt"));

            // 17.4
            while ((strCurrentLine = objReader.readLine()) != null) 
            {
                System.out.println(strCurrentLine);
            }

            // 17.5
            objReader.close();

        }  
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
    }
}