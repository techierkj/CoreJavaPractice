package fileHandling;

//for copying 
import java.io.*;

public class DisAndDosForCopying {
	public static void main(String args[]) throws IOException {
		// reading side
try{
		FileInputStream fistream = new FileInputStream(args[0]);
		// a low-level byte stream
		DataInputStream distream = new DataInputStream(fistream);
		// a high-level byte stream

		// writing side
		FileOutputStream fostream = new FileOutputStream(args[1]);
		// a low-level byte stream
		DataOutputStream dostream = new DataOutputStream(fostream);
		// a high-level byte stream
		String str;
		while ((str = distream.readLine()) != null) {
			dostream.writeBytes(str); // writes in the destination file, b.txt
			dostream.writeBytes(System.getProperty("line.separator")); // gives a new line in b.txt
			System.out.println(str); // prints at console
		}
		dostream.close();
		fostream.close();
		distream.close();
		fistream.close();
}
catch(Exception e)
{
	System.out.println("File doesnt exist");
}
	}
}