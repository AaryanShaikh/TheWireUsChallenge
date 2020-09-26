import java.util.*;
public class Day9{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int arr[] = new int[size];
		for (int i=0;i<size ;i++ ) {
			arr[i] = in.nextInt();
		}
		String str = Arrays.toString(arr);
		str = str.replaceAll("[^0-9]", "");
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		System.out.println(sb.reverse());
	}
}
