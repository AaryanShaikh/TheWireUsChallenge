import java.util.*;
public class Day80{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int out[] = new int[in.nextInt()];
		for (int j=0;j<out.length ;j++ ) {
			int coins = in.nextInt(), res = 0;
			for (int i=1;i>=1 ;i++ ) {
				res = (i*(i+1))/2;
				if (coins>res) {
					continue;
				}else if(res==coins){
					out[j] = i;
					break;
				}else{
					out[j] = i-1;
					break;
				}
			}
		}
		System.out.println("Output");
		for (int i=0;i<out.length ;i++ ) {
			System.out.println(out[i]);
		}
	}
}