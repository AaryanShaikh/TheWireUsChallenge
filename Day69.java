import java.util.*;
public class Day69{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String strsplit[] = str.split(" ");
		for (int i=0;i<strsplit.length-1 ; ) {
			if (Integer.parseInt(strsplit[i+1])>Integer.parseInt(strsplit[i])) {
				System.out.print(strsplit[i+1]+" ");
				i++;
			}else{
				int k=i+1;
				boolean check = true;
				while(k<strsplit.length){
					if (Integer.parseInt(strsplit[k])>Integer.parseInt(strsplit[i])) {
						System.out.print(strsplit[k]+" ");
						check = false;
						break;		
					}
					k++;
				}
				if (check) {
					System.out.print(-1+" ");
				}
				i++;
			}
			if (i==strsplit.length-1) {
				System.out.print(-1+" ");
			}
		}
	}
}