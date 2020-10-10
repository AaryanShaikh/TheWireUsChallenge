import java.util.*;
public class Day27{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		in.nextLine();
		String str[] = new String[size];
		for (int i=0;i<size ;i++ ) {
			str[i] = in.nextLine();
		}
		int count;
		String res = "";
		for (int i=0;i<size-1 ;i++ ) {
			count = 1;
			for (int j=i+1;j<size ;j++ ) {
				if (str[i].equalsIgnoreCase(str[j])) {
					count++;
				}
			}
			if (res.contains(str[i])) {
				continue;
			}else{
				System.out.println(str[i]+" "+count);
				res = res+str[i];
			}
		}
	}
}
