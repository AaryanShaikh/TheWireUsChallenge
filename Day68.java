/*
i/p:6
5 3 -1 7 2 -15
o/p:16
i/p:9
5 3 -1 7 2 -16 8 5 4
o/p:17
*/
import java.util.*;
public class Day68{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[in.nextInt()];
		int sum = 0,max = 0;
		for (int i=0;i<arr.length ;i++ ) {
			arr[i] = in.nextInt();
			sum+=arr[i];
			max = Math.max(max, sum);
			if (sum<0) {
				sum=0;
			}
		}
		System.out.println(max);
	}
}