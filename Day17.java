import java.util.*;
public class Day17{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int i=0;
		int j=0;
		int n=0;
		while(true){
			j=i;
			while(j<str.length()){
				if(i==j){
					System.out.print(str.charAt(j)+" ");
					j++;
				}
				else{
					n = j;
					for (int k=i;k<=n;k++ ) {
						System.out.print(str.charAt(k));
					}
					System.out.print(" ");
					j++;
				}
			}
			i++;
			if (i==str.length()) {
				break;
			}
		}
	}
}
