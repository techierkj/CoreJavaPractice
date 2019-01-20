package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class BufferReaderAndBufferWriter
{
	public static void main(String[] args) throws IOException 
	{
		String s;
		File f1=new File("raja");
		f1.mkdir();
		File f2=new File(f1,"rj.txt");
		f2.createNewFile();
		
		
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("my name is ravi.. and i love u");
		bw.flush();
		bw.close();
		
		FileReader fr=new FileReader(f2);
		BufferedReader br=new BufferedReader(fr);	
		while((s=br.readLine()) != null) {
			System.out.println(s);
			} 
		br.close();
		
	}

}
