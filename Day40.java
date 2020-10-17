import java.util.*;
public class Day40{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Test Cases");
		int tc = in.nextInt();
		for (int i=0;i<tc ;i++ ) {
			System.out.println("Enter the number of lines");
			int num = in.nextInt();
			num = num*(num+1)/2;
			int nums[] = new int[num];
			for (int j=0;j<num ;j++ ) {
				nums[j] = in.nextInt();
			}
			int sum=0;
			int max=0;
			for (int j=0;j<num-1 ;j=j+2 ) {
				sum = nums[j]+nums[j+1];
				if (j==0) {
					max=sum;
				}else if(sum>max){
					max=sum;
				}
			}
			System.out.println("Max for Test Case "+(i+1)+" is "+max);
		}
	}
}
