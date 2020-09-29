import java.util.*;
public class Day12{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int arr[] = new int[size];
		int count=1;
		for (int i=0;i<size ;i++ ) {
			arr[i] = in.nextInt();/*input in one line eg 30 35 40 38 35 not 30 on one line 35 on another*/
			if (i==0) {
				System.out.print(count+" ");
			}
			else if (arr[i]>arr[i-1]) {
				count++;
				System.out.print(count+" ");
			}
			else{
				count=1;
				System.out.print(count+" ");
			}
		}
	}
}
