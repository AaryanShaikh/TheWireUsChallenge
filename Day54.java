import java.util.*;
public class Day54{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String strsplit[] = str.split(" ");
		int ncon[] = new int[Integer.parseInt(strsplit[0])*2];/*No of contests*/
		int hworm[] = new int[Integer.parseInt(strsplit[1])];/*No of home to center wormholes*/
		int eworm[] = new int[Integer.parseInt(strsplit[2])];/*No of center to home wormholes*/
		int minres = Integer.MAX_VALUE;
		int index = 0;
		for (int i=0;i<Integer.parseInt(strsplit[0]) ;i++ ) {
			String str2 = in.nextLine();
			String strsplit2[] = str2.split(" ");
			ncon[index++] = Integer.parseInt(strsplit2[0]);
			ncon[index++] = Integer.parseInt(strsplit2[1]);
		}
		for (int i=0;i<hworm.length ;i++ ) {
			hworm[i] = in.nextInt();
		}
		for (int i=0;i<eworm.length ;i++ ) {
			eworm[i] = in.nextInt();
		}
		index = 0;
		int min = Integer.MAX_VALUE;
		int minindex = 0, minindex2 = 0;
		for (int i=0;i<Integer.parseInt(strsplit[0]) ;i++ ) {
			min = Integer.MAX_VALUE;
			for (int j=0;j<hworm.length ;j++ ) {/*calculate min home wormhole to choose*/
				if (Math.abs(hworm[j]-ncon[index])<min) {
					min = Math.abs(hworm[j]-ncon[index]);
					minindex = j;
				}
			}
			index++;
			boolean check = false;
			for (int j=0;j<eworm.length ;j++ ) {/*to check if any end wormhole is available or not*/
				if (ncon[index]<=eworm[j]) {
					check = true;
					break;
				}
			}
			if (check) {/*if there are no end wormholes then that contest cannot be taken*/
				min = Integer.MAX_VALUE;
				for (int j=0;j<eworm.length ;j++ ) {/*calculate min home wormhole to choose*/
					if (Math.abs(eworm[j]-ncon[index])<min) {
						min = Math.abs(eworm[j]-ncon[index]);
						minindex2 = j;
					}
				}
				minres = Math.min(eworm[minindex2]-hworm[minindex]+1, minres);
				index++;
			}else{
				index++;
				continue;
			}
		}
		System.out.println(minres);
	}
}