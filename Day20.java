import java.util.*;
public class Day20{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		n = (int)Math.pow(2, n);
		int temp = 0;
		String out = "";
		StringBuffer sb;
		int arr[] = new int[n];
		int j=0;
		boolean flag;
		for (int i=1;i<n ;i++ ) {
			temp = i;
			do{
				out = out+Integer.toString(temp%2);
				temp = temp/2;
			}while(temp>0);
			sb = new StringBuffer(out);
			out = sb.reverse().toString();
			if (out.length()==1) {
				arr[j] = i;
				j++;
			}
			else{
				flag=true;
				int count = 0;
				while(count<out.length()-1){
					if (out.charAt(count)=='1' && out.charAt(count+1)=='1') {
						flag=false;
					}
					count++;
				}
				if (flag) {
					arr[j] = i;
					j++;
				}
			}
			out = "";
		}
		for (int i=0;i<arr.length ;i++ ) {
			if (arr[i]==0) {
				break;
			}
			System.out.print(arr[i]+" ");
		}
	}
}
