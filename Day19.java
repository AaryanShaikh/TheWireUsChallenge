import java.util.*;
public class Day19{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		for (int i=0;i<str.length() ;i++ ) {
			if (i==0) {
				System.out.print(str.charAt(i));
			}
			else if (str.charAt(i-1)=='1'&&str.charAt(i)=='1') {
				System.out.print('0');
			}else{
				System.out.print(Character.getNumericValue(str.charAt(i-1))+Character.getNumericValue(str.charAt(i)));
			}
		}
	}
}