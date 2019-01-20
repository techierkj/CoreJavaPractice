package fileHandling;

import java.io.File;
import java.io.IOException;


public class FileCreation {

	public static void main(String[] args)
	{
		boolean obj=false;
		//creating object of File class of java.io package.
		//Constructor having string argument i.e. the name of file
		File f1=new File("rj.txt");
		System.out.println(f1.exists());
		try {
			//creation of empty file
			obj = f1.createNewFile();
			System.out.println(obj);
			System.out.println(f1.exists());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
