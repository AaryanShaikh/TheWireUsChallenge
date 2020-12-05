import java.util.*;
public class Day46{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[][] = new int[n][n];
		if (n%2==0) {
			for (int i=0;i<n ;i++ ) {
				for (int j=0;j<n ;j++ ) {
					if (i==j||j==n-(i+1)) {
						System.out.print(1+" ");
					}else{
						System.out.print(0+" ");
					}
				}
				System.out.println();
			}
		}else{
			for (int i=0;i<n ;i++ ) {
				for (int j=0;j<n ;j++ ) {
					if (i==j||j==n-(i+1)||((i==n/2)&&(j==(n/2)-1))||((j==n/2)&&(i==(n/2)-1))) {
						System.out.print(1+" ");
					}else{
						System.out.print(0+" ");
					}
				}
				System.out.println();
			}
		}
	}
}