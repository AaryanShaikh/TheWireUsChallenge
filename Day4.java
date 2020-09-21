import java.util.*;
public class Day4{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		for(int i=0;i<str.length()-1;i++){
			System.out.print(str.charAt(i));
			int res = str.charAt(i+1)-str.charAt(i);
			System.out.print(res);
		}
		System.out.print(str.charAt(str.length()-1));
	}
}
