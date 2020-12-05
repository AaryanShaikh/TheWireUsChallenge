import java.util.*;
public class Day72{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		for (int i=0;i<tc ;i++ ) {
			in.nextLine();
			String str = in.nextLine();
			String strsplit[] = str.split(" ");
			int k=Integer.parseInt(strsplit[1]),sum1=0,sum2=0;
			boolean check = false;
			int arr[] = new int[Integer.parseInt(strsplit[0])];
			for (int j=0;j<arr.length ;j++ ) {
				arr[j] = in.nextInt();
				if (arr[j]>k) {
					check = true;
					sum1+=arr[j];
					sum2+=k;
				}else{
					sum1+=arr[j];
					sum2+=arr[j];
				}
			}
			if (check) {
				System.out.println(sum1-sum2);
			}else{
				System.out.println(0);
			}
		}
	}
}