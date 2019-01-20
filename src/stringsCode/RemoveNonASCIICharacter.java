package stringsCode;

public class RemoveNonASCIICharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Bj��rk����oacute�";
        System.out.println(str);
        str = str.replaceAll("[^\\p{ASCII}]", "");
        System.out.println("After removing non ASCII chars:");
        System.out.println(str);
	}

}
