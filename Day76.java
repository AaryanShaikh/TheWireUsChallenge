import java.util.*;
public class Day76{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		if (q==0) {
			System.out.println(1);
		}else{
			int sum;
			for (int i=5;i<=108 ;i++ ) {
				sum=1;
				for (int j=i;j>1 ;j-- ) {
					sum*=j;
				}
				int count=0;
				for (int j=Integer.toString(sum).length()-1;j>=0 ;j-- ) {
					if (Integer.toString(sum).charAt(j)=='0') {
						count++;
					}else{
						break;
					}
				}
				if (count==q) {
					System.out.println(i);
					System.exit(1);
					break;
				}
			}
			System.out.println("No Solution");
		}
	}
}