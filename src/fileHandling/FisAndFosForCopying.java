package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FisAndFosForCopying {

	
		  public static void main(String args[])
		  {
		    try
		    {  
		      FileInputStream fis = new FileInputStream("a.txt");
		      FileOutputStream fos = new FileOutputStream("and.txt");
		 
		      int k;
		      while( ( k = fis.read() ) != -1 )
		      {
		        fos.write(k);   		
		        System.out.print((char) k);  
		      }
		      fos.close();
		      fis.close();
		    }
		    catch(FileNotFoundException e)
		    {
		      System.out.println("File does not exist. " + e);
		    }
		    catch(IOException e)
		    {
		      System.out.println("Some I/O problem. " + e);
		    }
		   }
		}