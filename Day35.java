import java.util.*;
public class Day35{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Test Cases");
		int size = in.nextInt();
		System.out.println("Enter the values for "+size+" Test Cases"); 
		for (int i=0;i<size ;i++ ) {
			boolean toggle = false;
			int num = in.nextInt();
			for (int k=0;k<10 ;k++ ) {
				if (num%10==0) {
					System.out.println(k);
					toggle = true;
					break;
				}else{
					num*=2;
				}
			}
			if (!toggle) {
				System.out.println(-1);
			}
		}
	}
}
