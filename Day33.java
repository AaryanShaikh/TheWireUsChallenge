import java.util.*;
public class Day33{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Test Cases");
		int size = in.nextInt();
		StringBuffer sb = new StringBuffer("");
		for (int i=0;i<size ;i++ ) {
			System.out.println("Enter the First Number of Test Case "+(i+1));
			int num1 = in.nextInt();
			System.out.println("Enter the Second Number of Test Case "+(i+1));
			int num2 = in.nextInt();
			while(num1>0||num2>0){
				int res = num1%10+num2%10;
				sb.append(Integer.toString(res%10));
				num1/=10;
				num2/=10;
			}
			System.out.println("Output of the "+(i+1)+" Test Case is "+sb.reverse());
			sb.delete(0, sb.length());
		}
	}
}
