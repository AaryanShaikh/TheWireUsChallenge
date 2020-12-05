/*
i/p:
7 1 5 3 6 4
o/p:
5
i/p:
1 2 3 4 5
o/p:
4
i/p:
7 6 4 3 1
o/p:
0
*/
import java.util.*;
public class Day70{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String strsplit[] = str.split(" ");
		int mprofit = 0,min = Integer.MAX_VALUE;
		for (int i=0;i<strsplit.length ;i++ ) {
			if (Integer.parseInt(strsplit[i])<min) {
				min = Integer.parseInt(strsplit[i]);
			}else{
				mprofit = Math.max(mprofit, Integer.parseInt(strsplit[i])-min); 
			}
		}
		System.out.println(mprofit);
	}
}