import java.util.*;
public class Day36{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of Test Cases");
		int tc = in.nextInt();
		for (int i=0;i<tc ;i++ ) {
			System.out.println("Enter the First number for Test Case "+(i+1));
			int num1 = in.nextInt();
			System.out.println("Enter the Second number for Test Case "+(i+1));
			int num2 = in.nextInt();
			int max = Math.max(num1,num2);
			int min = Math.min(num1,num2);
			int rem = 0;
			int res = 0;
			do{
				int k=1;
				while(min*k<=max){
					res = min*k;
					k++;
				}
				rem = max-res;
				max = min;
				if (rem!=0) {
				 	min = rem;
				 } 
			}while(rem!=0);
			System.out.println("GCD="+min);
			res = 1;
			int k=2;
			while(num1!=1||num2!=1){
				while(num1%k==0&&num2%k==0) {
					res*=k;
					num1/=k;
					num2/=k;
				}
				while(num1%k==0||num2%k==0){
					if (num1%k==0) {
						res*=k;
						num1/=k;
					}else if(num2%k==0){
						res*=k;
						num2/=k;
					}
				}
				k++;
			}
			System.out.println("LCM="+res);
		}
	}
}
