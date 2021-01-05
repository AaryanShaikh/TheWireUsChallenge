import java.util.*;
public class Day56{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int out[] = new int[in.nextInt()];
		for (int i=0;i<out.length ;i++ ) {
			int arr[] = new int[in.nextInt()];
			for (int j=0;j<arr.length ;j++ ) {
				arr[j] = in.nextInt();
			}
			int count = 0;
			for (int j=0;j<arr.length ;j++ ) {
				for (int k=0;k<arr.length-1 ;k++ ) {
					if (j==k) {
						continue;
					}else{
						int x = k;
						int sum = arr[x]+arr[++x];
						while(sum<arr[j]&&x!=arr.length-1){
							x++;
							sum = sum+arr[x];
						}
						if (sum==arr[j]) {
							count++;
							break;
						}
					}
				}
			}
			out[i] = count;
		}
		System.out.println("Output:");
		for (int i=0;i<out.length ;i++ ) {
			System.out.println(out[i]);
		}
	}
}