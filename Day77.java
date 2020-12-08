import java.util.*;
public class Day77{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		int master[] = new int[100];
		Arrays.fill(master,0);
		for (int i=0;i<tc ;i++ ) {
			int size = in.nextInt();
			int disks[] = new int[size];
			for (int j=0;j<size ;j++ ) {
				disks[j] = in.nextInt();
			}
			int index,count=0;
			for (int j=0;j<size ;j++ ) {
				if (j==0) {
					master[j] = disks[j];
					count++;
				}else{
					index=0;
					while (true) {
						if (master[index]==0) {/*like creating a new stack dynamically*/
							master[index] = disks[j];
							count++;
							break; 
						}else if (disks[j]>master[index]) {
							index+=10;
						}else{
							int head=0,hi=0;
							for (int x=index;x<100 ;x++ ) {
								if (master[x]==0) {
									head = master[x-1];/*finding the head of each stack*/
									hi = x;
									break;
								}
							}
							if (head>disks[j]) {
								master[hi] = disks[j];			
							}else{
								index+=10;	
							}
							if (head>disks[j]) {
								break;
							}
						}
					}
				}
			}
			System.out.println("Output");
			System.out.print(count+" ");
			int x = 0;
			for (int j=0;j<count ;j++ ) {
				while(true){
					if (master[x]==0) {
						System.out.print(master[x-1]+" ");
						break;
					}
					x++;
				}
				x=10*(j+1);
			}
		}
	}
}