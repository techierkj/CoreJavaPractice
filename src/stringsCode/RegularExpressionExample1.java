package stringsCode;

public class RegularExpressionExample1 {

	public static void main(String[] args) {
		// Change digit with X
		String str1 = "Aman 1 3 is good";
		str1 = str1.replaceAll("\\d", "X");
		System.out.println(str1); // Aman X X is good

		// Change digit with Z
		String str2 = "Hero a1234 dhe023 kdkrkSBjJ";
		str2 = str2.replaceAll("[0-9]", "Z");
		System.out.println(str2); // Hero aZZZZ dheZZZ kdkrkSBjJ

		// Change number,characters with Y
		String str3 = "23456ABabc0CDE";
		str3 = str3.replaceAll("[A-Za-z0-9]", "Y");
		System.out.println(str3); // YYYYYYYYYYYYYY

		// Change non-digit number with $
		String str4 = "4abc_ABC_@029304";
		str4 = str4.replaceAll("\\D", "\\$");
		System.out.println(str4); // 4$$$$$$$$$029304

		// Change WHITESPACE Character with %
		String str5 = "4a bc  ABC  @0 29 0 4";
		str5 = str5.replaceAll("\\s", "\\%");
		System.out.println(str5); // 4a%bc%%ABC%%@0%29%0%4

		// Change non-WHITESPACE Character with &
		String str6 = "O4a  bc_A BC_@0  29 30 4";
		str6 = str6.replaceAll("\\S", "\\&");
		System.out.println(str6); // &&& &&&& &&&&& && && &

		// Change A WORD character with !
		String str7 = "4abc_ABC_@029304+-FFFF";
		str7 = str7.replaceAll("\\w", "\\!");
		System.out.println(str7); // !!!!!!!!!@!!!!!!+-!!!!

		// Change non-word Character with #
		String str8 = "OT4abc_ABC_@029304R_#+-FFFF";
		str8 = str8.replaceAll("\\W", "\\#");
		System.out.println(str8); // OT4abc_ABC_#029304R_###FFFF

		// Change Several non-whitespace characters(it replaces sequence of
		// spaces )
		String str9 = "O      _ABC_@0    4FF";
		str9 = str9.replaceAll("\\s+", "\\(");
		System.out.println(str9); // O(_ABC_@0(4FF
	}
}
