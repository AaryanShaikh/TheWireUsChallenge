import java.util.*;
public class Day78{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int out[] = new int[in.nextInt()];
		for (int j=0;j<out.length ;j++ ) {
			int arr[] = new int[in.nextInt()];
			int max = Integer.MIN_VALUE,count = 1,value = 0;
			for (int i=0;i<arr.length ;i++ ) {
				arr[i] = in.nextInt();
			}
			for (int i=0;i<arr.length ;i++ ) {
				count = 1;
				value = arr[i];
				for (int k=i+1;k<arr.length ;k++ ) {
					if (value==arr[k]) {
						count++;
					}
				}
				max = Math.max(max, count);
			}
			out[j] = arr.length - max;
		}
		System.out.println("Output");
		for (int i=0;i<out.length ;i++ ) {
			System.out.println(out[i]);
		}
	}
}