import java.util.*;
public class Day48{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[in.nextInt()];
		for (int i=0;i<arr.length ;i++ ) {
			arr[i] = in.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int i=0;i<arr.length ;i++ ) {
			for (int j=i+1;j<arr.length ;j++ ) {
				if (Math.abs(arr[i]-arr[j])<min) {
					min = Math.abs(arr[i]-arr[j]);
				}
			}
		}
		System.out.println("Output\n"+min);
	}
}