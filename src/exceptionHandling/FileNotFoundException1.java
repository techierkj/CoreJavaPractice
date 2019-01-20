package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundException1 {
	 public static void main(String args[])  { 
	        try { 
	  
	            // Following file does not exist 
	            File file = new File("E://file.txt"); 
	  
	            FileReader fr = new FileReader(file); 
	        } catch (FileNotFoundException e) { 
	           System.out.println("File does not exist"); 
	        } 
	    } 
}
