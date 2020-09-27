import java.util.*;
public class Day10{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String strsplit[] = str.split(" ");
		int size = Integer.parseInt(strsplit[0]);
		int rot = Integer.parseInt(strsplit[1]);
		int arr[] = new int[size];
		for (int i=0;i<size ;i++ ) {
			arr[i] = in.nextInt();
		}
		int temp = 0;
		for (int i=0;i<rot ;i++ ) {
			int count = 0;
			 temp = arr[count];
			while(count<size-1){
				arr[count] = arr[count+1];
				count++; 
			}
		arr[size-1] = temp;
		}
		for (int i=0;i<size ;i++ ) {
			System.out.print(arr[i]+" ");
		}
	}
}
