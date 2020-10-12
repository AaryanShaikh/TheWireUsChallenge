/* 1 5 3 2 4 = M = 15 -> input for m
   6 9 8 0 7 = P = 30 -> input for p
   (M+P)/2 = W = 22.7 -> input for w
   number of elements = 1-total number of orignal set, in this eg 4(5-1)
   values of set p -> 6 9 8 0, 6 6 6 6, 9 9 9 0 etc.
*/
import java.util.*;
public class Day32{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the  value of m");
		int m = in.nextInt();
		System.out.println("Enter the  value of p");
		int p = in.nextInt();
		System.out.println("Enter the value of w(Average of m+p sets)");
		float w = in.nextFloat();
		System.out.println("Enter the number of elements in set p");
		int size = in.nextInt();
		System.out.println("Enter the "+size+" values of set p");
		int pv[] = new int[size];
		int psum = 0;
		for (int i=0;i<size ;i++ ) {
			pv[i] = in.nextInt();
			psum+=pv[i];
		}
		for (int i=0;i<=9 ;i++ ) {
			psum+=i;
			if (psum==p) {
				System.out.println("The missing number is "+i);
				System.exit(1);
			}
			psum-=i;
		}
		System.out.println("-1");
	}
} 
