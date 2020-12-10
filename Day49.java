import java.util.*;
public class Day49{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[in.nextInt()];
		for (int i=0;i<arr.length ;i++ ) {
			arr[i] = in.nextInt();
		}
		int count=0;
		for (int i=0;i<arr.length ;i++ ) {
			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i]>(arr[j]*2)) {
					count++;
				}
			}
		}
		System.out.println("Output\n"+count);
	}
}