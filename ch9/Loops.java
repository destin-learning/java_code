/* ---------------------------------------------------------------
  Chapter 9 Loops
  File: Loops.java
  Description: demonstrate the three basic loops available in Java
 ----------------------------------------------------------------- */
public class Loops {

    public static void main(String[] args) 
    {

        // 9.1 for loop example
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello, World, my name is Eric - for loop");
        }

        // 9.2 while loop example
        int x = 0;
        while (x <= 4) 
        {    
            System.out.println("Value of x:" + x); 
  
            // Increment the value of x for the next iteration 
            x++; 
        } 

        // 9.3 do loop example
        int z = 0; 
        do
        { 
        
            System.out.println("Value of z:" + z); 
            z++; 
        } 
        while (z < 5); 

   }
}
