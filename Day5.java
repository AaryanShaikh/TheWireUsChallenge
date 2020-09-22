import java.util.*;
public class Day5{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = in.nextLine().toLowerCase();
		char ch[] = str.toCharArray();
		int index[] = new int[str.length()];
		int count = 0;
		for(int i=0;i<str.length()-1;i++){
			for(int k=i+1;k<str.length();k++){
				if (str.charAt(i)==str.charAt(k)) {
					ch[k] = '*';
					count++;
				}
			}
		}
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
	}
}
