import java.util.*;
public class Day18{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size =in.nextInt();
		System.out.println("Enter the elements of the array");
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = in.nextInt();
		}
		String out[][] = new String[size][size];
		for (int i=0;i<size ;i++ ) {
			for (int j=0;j<size ;j++ ) {
				out[i][j] = "";
			}
		}
		for (int j=0;j<size ;j++ ) {
			out[0][j] = Integer.toString(arr[j]);
		}
		int sum=0 ;
		for (int i=1;i<size ;i++ ) {
			for (int j=0;j<size-i ;j++ ) {
				sum = Integer.parseInt(out[i-1][j]) + Integer.parseInt(out[i-1][j+1]);
				out[i][j] = Integer.toString(sum);
			}
		}
		for (int i=size-1;i>=0 ;i-- ) {
			System.out.print("[");
			for (int j=0;j<size ;j++ ) {
				if (out[i][j]=="") {
					break;
				}else{
					System.out.print(out[i][j]+", ");
				}
			}
			System.out.print("]");
			System.out.println();
		}
	}
}
