package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class ReadingFromFileUsingFileReader {
	public static void main(String[] args) throws IOException {
		int s;
		File f2 = new File("ravi.txt");
		FileReader fr = new FileReader(f2);
		while ((s = fr.read()) != -1)
		{
			System.out.print((char)(s));
		}
		fr.close();
	}

}
