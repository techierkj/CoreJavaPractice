package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;


public class FileAndFormatter {
	public static void main(String[] args) 
	{
		File f1=new File("text1.txt");
		try {
			f1.createNewFile();
			System.out.println("file 1 created");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("file 1 not created");
		}
		try {
			@SuppressWarnings({ "unused", "resource" })
			Formatter f2=new Formatter("text2.txt");
			System.out.println("file created");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file not created");
		}
	}

}
