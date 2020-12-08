/*
input:
4
2
3 6
3
1 3 5
5
1 2 5 6 7
9
1 2 5 6 7 8 11 12 13
Output
1 1
3 3
2 3
2 4
*/
import java.util.*;
public class Day75{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		String out[] = new String[tc];
		for (int i=0;i<tc ;i++ ) {
			int total = in.nextInt();
			int person[] = new int[total];
			for (int j=0;j<total ;j++ ) {
				person[j] = in.nextInt();
			}
			String res = "";
			int count=1;
			for (int j=0;j<total-1 ;j++ ) {
				if (person[j+1]-person[j]<=2) {
					count++;
				}else{
					res+=Integer.toString(count)+" ";
					count=1;
				}
			}
			res+=Integer.toString(count)+" ";
			if (res.length()==2) {
				out[i]=Character.toString(res.charAt(0))+" "+Character.toString(res.charAt(0));
			}else{
				String ressplit[] = res.split(" ");
				int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
				for (int j=0;j<ressplit.length ; j++) {
					if (Integer.parseInt(ressplit[j])<min) {
						min = Integer.parseInt(ressplit[j]);
					}
					if (Integer.parseInt(ressplit[j])>max) {
						max = Integer.parseInt(ressplit[j]);
					}
				}
				out[i] = Integer.toString(min)+" "+Integer.toString(max);
			}
		}
		System.out.println("Output");
		for (int i=0;i<tc ;i++ ) {
			System.out.println(out[i]);
		}
	}
}