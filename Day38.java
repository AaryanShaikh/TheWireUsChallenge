import java.util.*;
public class Day38{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of integers");
		int n = in.nextInt();
		System.out.println("Enter the divisor");
		int k = in.nextInt();
		System.out.println("Enter the "+n+" integers");
		int count = 0;
		int num;
		for (int i=0;i<n ;i++ ) {
			num = in.nextInt();
			if (num%k==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
