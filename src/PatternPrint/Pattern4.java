package PatternPrint;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
1
1 2
1 2 3
1 2
1
 */
		int rows=5;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=rows-1;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}

}
