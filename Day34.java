import java.util.*;
public class Day34{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Test Cases");
		int size = in.nextInt();
		for (int i=0;i<size ;i++ ) {
			System.out.println("Enter the no of sticks in Test Case "+(i+1));
			int num = in.nextInt();
			int sticks[] = new int[num];
			System.out.println("Enter the sizes of "+num+" sticks");
			for (int j=0;j<num ;j++ ) {
				sticks[j] = in.nextInt();
			}
			Arrays.sort(sticks);
			System.out.println("The highest area can be found by taking a stick with length "+sticks[sticks.length-1]+" and "+sticks[sticks.length-2]+" which will give area of "+sticks[sticks.length-1]*sticks[sticks.length-2]);
		}
	} 
}
