import java.util.*;
public class Day73{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		for (int i=0;i<tc ;i++ ) {
			in.nextLine();
			String str = in.nextLine();
			String strsplit[] = str.split(" ");
			int m = Integer.parseInt(strsplit[0]),n=Integer.parseInt(strsplit[1]),count=0;
			if ((m*n)+m+n==Integer.parseInt(strsplit[0]+strsplit[1])) {
				System.out.print(1+" ");
			}else{
				System.out.print(0+" ");
			}
			for (int j=1;j<=m ;j++ ) {
				if ((j*n)+j+n==Integer.parseInt(Integer.toString(j)+strsplit[1])) {
					count++;
				}	
			}
			System.out.print(count);
		}
	}
}