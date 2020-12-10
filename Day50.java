/*
i/p:
1 1 2 1 1 1
Output
3
i/p:
2 3 1 3 1 3 1 1 1 2
Output
1
i/p:
1 5 1 2 1 2 4 5 4 2
Output
0
i/p:
1 2 5 1 5 1 2 4 4 2
Output
3
*/
import java.util.*;
public class Day50{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String strsplit[] = str.split(" ");
		if (strsplit.length%2!=0) {
			System.out.println("The length should be even");
		}else{
			int arr[] = new int[strsplit.length];
			int temp[] = new int[strsplit.length];
			int max = Integer.MIN_VALUE;
			for (int i=0;i<strsplit.length ;i++ ) {
				if (Integer.parseInt(strsplit[i])>max) {
					max=Integer.parseInt(strsplit[i]);
				}
			}
			boolean check = true;
			int count=0;
			for (int j=0;j<strsplit.length/2 ;j++ ) {
				if (j==0) {
					arr[0] = Integer.parseInt(strsplit[strsplit.length-1]);
					for (int i=0;i<strsplit.length-1 ;i++ ) {
						arr[i+1] = Integer.parseInt(strsplit[i]);
						if (i>=(strsplit.length/2)) {
							continue;
						}else if (arr[i]>=max) {
							check = false;
						}
					}
					if (check) {
						count++;						
					}					
				}else{
					check = true;
					arr[0] = temp[temp.length-1];
					for (int i=0;i<temp.length-1 ;i++ ) {
						arr[i+1] = temp[i];
						if (i>=(temp.length/2)) {
							continue;
						}else if (arr[i]>=max) {
							check = false;
						}
					}
					if (check) {
						count++;						
					}	
				}
				for (int i=0;i<arr.length ;i++ ) {
					temp[i] = arr[i];
				}
			}
			System.out.println("Output\n"+count);
		}
	}
}