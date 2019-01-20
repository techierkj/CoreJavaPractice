package fileHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class PrintWriterForWritingIntoFile {


	public static void main(String[] args) {
		String filename1="t1.txt";
		try {
			PrintWriter pw=new PrintWriter(filename1);
			//for writing into file
			pw.println("i m don");
			pw.println("u are hot");
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("no");
			e.printStackTrace();
		}
		String filename2="t2.txt";
		try {
			PrintWriter pw=new PrintWriter(filename2);
			//for writing into file
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{

					pw.println("ravijharox");
				}
				pw.println(" ");
			}
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("no");
			e.printStackTrace();
		}
	}

}
