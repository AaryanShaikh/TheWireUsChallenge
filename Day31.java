import java.util.*;
public class Day31{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Coins");
		int size = in.nextInt();
		int coins[] = new int[size];
		int sum=0;
		System.out.println("Enter the values of the "+size+" Coins");
		for (int i=0;i<size ;i++ ) {
			coins[i] = in.nextInt();
			sum+=coins[i];
		}
		int mid = sum/2;
		sum=0;
		int k=0;
		int child[] = new int[size];
		for (int i=0;i<size ;i++ ) {
			if((sum+coins[i])<=mid){
				sum+=coins[i];
				child[k] = coins[i];
				k++;
				coins[i] = 0; 
			}
		}
		System.out.print("Child 1 should get : ");
		for (int i=0;i<size ;i++ ) {
			if (child[i]!=0) {
				System.out.print(child[i]+" ");
			}
		}
		System.out.print(" = "+sum);
		System.out.println();
		int sum2 = 0;
		System.out.print("Child 2 should get : ");
		for (int i=0;i<size ;i++ ) {
			if (coins[i]!=0) {
				System.out.print(coins[i]+" ");
				sum2+=coins[i];
			}
		}
		System.out.print(" = "+sum2+"\n");
		System.out.println("The Minimum Absolute Difference is "+Math.abs(sum-sum2));
	}
}
