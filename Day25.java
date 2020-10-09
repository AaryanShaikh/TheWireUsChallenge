import java.util.*;
public class Day25{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		in.nextLine();
		String str[] = new String[size];
		for (int i=0;i<size ;i++ ) {
			str[i] = in.nextLine();
		}
		String res = "";
		for (int i=0;i<size ;i++ ) {
			for (int k=0;k<str[i].length() ;k++ ) {
				if (res.contains(Character.toString(str[i].charAt(k)))) {
					continue;
				}else{
				System.out.print(str[i].charAt(k));
				res = res+str[i].charAt(k);
				}
			}
			System.out.println();
			res = "";
		}
	}
}
