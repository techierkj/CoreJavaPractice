package stringsCode;
public class StringRemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="@@@@@@@@@@ravidddd Jha 12333*&^%%%**";
		//regulrexp- [a-zA-Z0-9]
//		str.replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println(str);
		str=str.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println(str);
		
	}

}
