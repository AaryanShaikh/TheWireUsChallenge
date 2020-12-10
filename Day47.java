/*
i/p:
4 1 2
Output
6 -> ([1 2 3 4], [3 2 4 1], [4 2 3 1], [1 2 4 3], [3 2 1 4], [4 2 1 3])
i/p:
4 0 2
Output
4 -> ([2 3 4 1], [2 4 3 1], [2 3 1 4], [2 4 1 3])
i/p:
4 2 2
Output
2 -> ([4 1 2 3], [3 1 2 4])
*/
import java.util.*;
public class Day47{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String strsplit[] = str.split(" ");
		int arr[] = new int[Integer.parseInt(strsplit[0])];
		Arrays.fill(arr,0);
		int ind = Integer.parseInt(strsplit[1]);
		int ele = Integer.parseInt(strsplit[2]);
		int greater = arr.length - ele;/*nums greater than the element*/
		int less = ele - 1;/*nums less than the element*/
		int low=0,high=arr.length-1,mid=0,spaces=arr.length-1,sum=1;
		while(true){
			mid = (low+high)/2;
			if (mid==ind) {/*index found*/
				int fact = 1;
				for (int j=spaces;j>1 ;j-- ) {/*find the factorial of all remaining spaces to find all permutation*/
					fact*=j;
				}
				System.out.println("Output\n"+fact*sum);/*cal final permutations*/
				break;
			}else if(mid<ind){
				sum*=less--;
				spaces--;
				low = ++mid;
			}else{
				sum*=greater--;
				spaces--;
				high = --mid;
			}
		}
	}
}