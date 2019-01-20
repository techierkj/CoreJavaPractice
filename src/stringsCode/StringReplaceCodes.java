package stringsCode;

public class StringReplaceCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new String("Love is Blind");
		System.out.println(str);  //Love is Blind
		
		//replace a character
		str=str.replace('L', 'M');
		System.out.println(str);  //Move is Blind

		//replace a word
		str=str.replace("Blind", "Good");
		System.out.println(str);  //Move is Good
		
		//replace first string occurrence 
		String str1="The is The Good The person of life";
		str1=str1.replaceFirst("The", "He");
		System.out.println(str1); //He is The Good The person of life
		
		//replace string using regex
		String myString = "__1_6____3__6_345____0";// replace number with 'o
		myString=myString.replaceAll("\\d", "o");
		System.out.println(myString);  //__o_o____o__o_ooo____o

		
	}

}
