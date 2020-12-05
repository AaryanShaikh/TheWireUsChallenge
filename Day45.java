import java.util.*;
public class Day45{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double arr1[] = new double[in.nextInt()];
		for (int i=0;i<arr1.length ;i++ ) {
			arr1[i] = in.nextDouble();
		}
		double arr2[] = new double[in.nextInt()];
		for (int i=0;i<arr2.length ;i++ ) {
			arr2[i] = in.nextDouble();
		}
		double arr3[] = new double[arr1.length+arr2.length];
		int k=0;
		for (int i=0;i<arr1.length+arr2.length ;i++ ) {
			if (i<arr1.length) {
				arr3[i]=arr1[i];
			}else{
				arr3[i]=arr2[k];
				k++;
			}
		}
		Arrays.sort(arr3);
		if (arr3.length%2==0) {
			double res = (arr3[arr3.length/2]+arr3[(arr3.length/2)-1])/2;
			System.out.println("The meadian is "+res);
		}else{
			System.out.println("The meadian is "+arr3[arr3.length/2]);
		}
	}
}