package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WritingSomeTextIntoFileUsingFileWriter {

	public static void main(String[] args) throws IOException {
	File f1=new File("ravi.txt");
	FileWriter fw=new FileWriter(f1);
	f1.createNewFile();
	//writing in a single line;
	fw.write("hello boss.miss u.. love u...");
	fw.write("hello boss.miss u.. love u...");
	fw.write("hello boss.miss u.. love u...");
	fw.write("hello boss.miss u.. love u...");
	fw.flush();
	fw.close();
	}

}
