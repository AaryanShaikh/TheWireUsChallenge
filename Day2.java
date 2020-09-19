import java.util.*;
public class Day2{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str  = in.nextLine();//input [ String S = IAmAaryan ]
		String strsplit[] = str.split("=");
		char ch[] = strsplit[1].toCharArray();
		int a[] = new int[ch.length];
		int count=0;
		for(int i=0;i<ch.length;i++){
			if (ch[i]>='A'&&ch[i]<='Z') {
				a[count++] = i; 
			}
		}
		int j=0;
		for(int i=0;i<ch.length;i++){
			if (a[j]==i) {
				System.out.println();
				j++;
			}
			System.out.print(ch[i]);
		}
	}
}
