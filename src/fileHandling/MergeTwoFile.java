package fileHandling;

import java.io.*;
public class MergeTwoFile
{
  public static void main(String args[]) throws IOException
  {
    FileInputStream fistream1 = new FileInputStream("a.txt");  // first source file
    FileInputStream fistream2 = new FileInputStream("b.txt");  //second source file
 
    SequenceInputStream sistream = new SequenceInputStream(fistream1, fistream2);  
    FileOutputStream fostream = new FileOutputStream("Result.txt");      
    
    int temp;
    while( ( temp = sistream.read() ) != -1)
    {
      System.out.print( (char) temp ); // to print at console
      fostream.write(temp);	// to write to file
    }
    fostream.close();
    sistream.close();
    fistream1.close();
    fistream2.close();
   }
}