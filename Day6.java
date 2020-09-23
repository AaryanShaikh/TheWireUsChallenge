/*
Improvements
1. Removed Index Array
2. Removed Counter
3. No Seperate Loop to Print Result
4. LOC Reduced by 6 lines 😂😂😂 
*/
import java.util.*;
public class Day6{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = in.nextLine().toLowerCase();
		char ch[] = str.toCharArray();
		for(int i=0;i<str.length()-1;i++){
			for(int k=i+1;k<str.length();k++){
				if (str.charAt(i)==str.charAt(k)) ch[k] = '*';
			}
			System.out.print(ch[i]);
		}
		System.out.print(ch[str.length()-1]);
	}
}
