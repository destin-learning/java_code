
/* ---------------------------------------------------------------
  Chapter 16 File Output
  File: FileOutput.java
  Description: demonstrate how to write a text file one line at a 
  time using BufferedReader
 ----------------------------------------------------------------- */
import java.io.*;

public class FileOutput {
   public static void main(String[] args) {

      // 16.1 
      try {
         BufferedWriter out = new BufferedWriter(new FileWriter("outputfile"));

         // 16.2
         for(int i=0;i<5;i++)
         {
            out.write("Line "+i+"\n");
         }

         // 16.3
         out.close();
         System.out.println("File created successfully");
      }
      // 16.4
      catch (IOException e) 
      {
          e.printStackTrace();
      }
   }
}
