/*better if priority queue is used*/
import java.util.*;
public class Day44{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int b[] = new int[in.nextInt()];/*no of the building*/
		for (int i=0;i<b.length ;i++ ) {/*size of the buildings*/
			b[i] = in.nextInt();
		}
		int br = in.nextInt();/*no of bricks*/
		int l = in.nextInt();/*no of ladders*/
		int diff[] = new int[b.length];
		Arrays.fill(diff,0);
		int di = 0;
		for (int i=0;i<b.length-1 ;i++ ) {
			Arrays.sort(diff);
			if (b[i+1]<=b[i]){
				continue;
			}
			int d = b[i+1]-b[i];/*difference b/w the buildings*/
			if (d<=br) {
				br-=d;
				diff[di] = d;
				di++;
			}else if(l>0){
				if (diff[diff.length-1]>d) {/*if the prev diff is greater than curr diff than we use ladder*/
					br+=diff[diff.length-1];/*we take all the bricks back*/
					l--;/*prev when we used bricks we'll use ladder*/
					br-=d;/*now we'll use bricks*/
				}else{
					l--;/*we're going to use the ladder*/
				}
			}else{
				System.out.println("The farthest building we can reach is "+(i+1));
				break;
			}
		}
	}
}