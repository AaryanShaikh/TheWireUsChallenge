import java.util.*;
public class Day57{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int out[] = new int[in.nextInt()];
		in.nextLine();
		for (int i=0;i<out.length ;i++ ) {
			String str = in.nextLine();
			String strsplit[] = str.split(" ");
			int arr[] = new int[Integer.parseInt(strsplit[0])];
			int f[] = new int[arr.length];
			for (int j=0;j<arr.length ;j++ ) {
				arr[j] = in.nextInt();
				f[j] = 0;
			}
			in.nextLine();
			Arrays.sort(arr);
			int res = 0;
			String str2 = in.nextLine();
			String strsplit2[] = str2.split(" ");
			for (int j=0;j<Integer.parseInt(strsplit[1]) ;j++ ) {
				int arr2[] = new int[Integer.parseInt(strsplit2[j])];
				int index = 0;
				if (arr2.length==1) {
					res = res+arr[arr.length-1]*2;
					f[arr.length-1] = 1;
				}else{
					for (int k=arr.length-1;k>=0 ; ) {
						if (f[k]==1) {
							k--;
						}else{
							arr2[index] = arr[k];
							f[k] = 1;
							k = k-Integer.parseInt(strsplit[1]);
							index++;
						}
					}
					int min = Integer.MAX_VALUE;
					int max = Integer.MIN_VALUE;
					for (int k=0;k<arr2.length ;k++ ) {
						if (arr2[k]==0) {
							continue;
						}else{
							max = Math.max(arr2[k], max);
							min = Math.min(arr2[k], min);
						}
					}
					res = res+max+min;
				}
			}
			out[i] = res;
		}
		System.out.println("Output");
		for (int i=0;i<out.length ;i++ ) {
			System.out.println(out[i]);
		}
	}
}