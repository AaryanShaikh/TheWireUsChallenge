/*The elements are randomly generated between n to m*/
import java.util.*;
public class Day53{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String strsplit[] = str.split(" ");
		int n = Integer.parseInt(strsplit[0]);
		int m = Integer.parseInt(strsplit[1]);
		int matrix[][] = new int[n][m];
		boolean trigger = true;
		for (int i=0;i<n ;i++ ) {
			for (int j=0;j<m ;j++ ) {
				if (trigger) {
					trigger = false;
					int num = (int)(Math.random() * (Math.max(n, m) - Math.min(n, m) + 1) + Math.min(n, m));
					while(num%2!=0){
						num = (int)(Math.random() * (Math.max(n, m) - Math.min(n, m) + 1) + Math.min(n, m));
					}
					matrix[i][j] = num;
					System.out.print(matrix[i][j]+" ");
				}else{
					trigger = true;
					int num = (int)(Math.random() * (Math.max(n, m) - Math.min(n, m) + 1) + Math.min(n, m));
					while(num%2==0){
						num = (int)(Math.random() * (Math.max(n, m) - Math.min(n, m) + 1) + Math.min(n, m));
					}
					matrix[i][j] = num;
					System.out.print(matrix[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}