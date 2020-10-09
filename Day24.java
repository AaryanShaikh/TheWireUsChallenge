import java.util.*;
public class Day24{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		in.nextLine();
		String names[] = new String[size];
		for (int i=0;i<size ;i++) {
			names[i] = in.nextLine();
		}
		int index[] = new int[size-1];
		int count = 0;
		for (int i=0;i<size-1 ;i++ ) {
			String strsplit[] = names[i].split(" ");
			for (int k=i+1;k<size ;k++ ) {
				String strsplit2[] = names[k].split(" ");
				if (strsplit[0].equalsIgnoreCase(strsplit2[0])) {
					index[count++] = k;
				}
			}
		}
		System.out.println();
		count = 0;
		for (int i=0;i<size ;i++ ) {
			if (i==index[count]) {
				String strsplit[] = names[i].split(" ");
				System.out.println(strsplit[1]);
				count++;
			}else{
				System.out.println(names[i]);
			}
		}
	}
}
