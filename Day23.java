import java.util.*;
public class Day23{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine().toLowerCase();
		String str2 = in.nextLine().toLowerCase();
		if(str2.length()==0){
				System.out.println(0);
				System.exit(1);
		}
		for (int i=0;i<str1.length() ;i++ ) {
			if (str1.charAt(i)==str2.charAt(0)) {
				System.out.println(i);
				System.exit(1);
			}
		}
		System.out.println(-1);
	}
}
