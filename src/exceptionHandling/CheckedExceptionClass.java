package exceptionHandling;

import java.io.File;
import java.io.FileReader;

public class CheckedExceptionClass {

	public static void main(String args[]) {
		//A checked exception is an exception that occurs at the compile time, these are also called as compile time exceptions
		File file = new File("E://file.txt");
	//	FileReader fr = new FileReader(file); // Will give exception :- "Unhandled exception type FileNotFoundException"
	}
}