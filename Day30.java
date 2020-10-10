import java.util.*;
public class Day30{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number of Test Cases");
		int size = in.nextInt();
		int size2;
		String out = "";
		String res = "";
		for (int i=0;i<size ;i++ ) {
			System.out.println("Enter the Size for Test Case "+(i+1));
			size2 = in.nextInt();
			System.out.println("Enter the "+size2+" elements");
			int arr[] = new int[size2];
			for (int j=0;j<size2 ;j++ ) {
				arr[j] = in.nextInt();
			}
			Arrays.sort(arr);
			for (int k=0;k<size2 ;k++ ) {
				if (k==0) {
					res = res+Integer.toString(arr[k]);
				}else if(res.contains(Integer.toString(arr[k]))){
					continue;
				}else{
					res = res+Integer.toString(arr[k]);
				}
			}
			out = out+res;
			res = "";
		}
		System.out.println(out);
	}
}
