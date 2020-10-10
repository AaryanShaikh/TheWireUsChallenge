import java.util.*;
public class Day29{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		long arr[] = new long[size];
		long count = 0;
		for (int i=0;i<size ;i++ ) {
			arr[i] = in.nextLong();
			count+=arr[i];
		}
		System.out.println(count);
	}
}
