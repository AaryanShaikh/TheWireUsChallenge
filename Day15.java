import java.util.*;
public class Day15{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int sum=0;
		for (int i=0;i<str.length() ;i++ ) {
			sum*=10;
			sum+=(int)str.charAt(i)-(int)'0';
		}
		System.out.println(sum);
	}
}
