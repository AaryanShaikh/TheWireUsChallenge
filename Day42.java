/* For future reference
412112 -> main input
1 -> 1st iteration
41211 -> sub arr 1
2 -> sub arr 2
2 -> 2nd iteration
4121 -> sub arr 1
12 -> sub arr 2
3 -> 3rd iteration
412 -> sub arr 1
112 -> sub arr 2
4 -> 4th iteration
41 -> sub arr 1
2112 -> sub arr 2
5 -> 5th iteration
4 -> sub arr 1
12112 -> sub arr 2

Example:
input 
23457
output
The Chef should cut the sequence at 2 iteration, i.e.
SubArray 1 = 234
SubArray 2 = 57
*/
import java.util.*;
public class Day42{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int subarr1 = 1, subarr2 = 1, max = 0;/* i m starting from behind so find max instead of min*/
		for (int i=1;i<=str.length()-1 ;i++ ) {
			for (int j=1;j<=str.length() ;j++ ) {
				if (j<=str.length()-i) {
					subarr1*=Character.getNumericValue(str.charAt(j-1));
				}else{
					subarr2*=Character.getNumericValue(str.charAt(j-1));
				}
			}
			String fact = "";
			int temp = subarr1; 
			for (int j=2;j<=subarr1 ;j++ ) {
				if (temp%j==0) {
					while(temp%j==0){
						fact+=Integer.toString(j);
						fact+=" ";
						temp/=j;
					}
				}
			}
			temp = subarr2;
			boolean check = false;
			for (int j=2;j<=subarr2 ;j++ ) {
				if (temp%j==0) {
					while(temp%j==0){
						if (fact.contains(Integer.toString(j))) {
							check = true;	
						}
						temp/=j;
						if (check) {
							break;
						}
					}
					if (check) {
						break;
					}
				}
			}
			if (!check) {
				if (i>max) {
					max=i;
				}
			}
			subarr1 = subarr2 = 1;
		}
		System.out.println("The Chef should cut the sequence at "+max+" iteration, i.e.");
		String arr1 = "", arr2="";
		for (int j=1;j<=str.length() ;j++ ) {
			if (j<=str.length()-max) {
				arr1+=Character.toString(str.charAt(j-1));
			}else{
				arr2+=Character.toString(str.charAt(j-1));
			}
		}
		System.out.println("SubArray 1 = "+arr1);
		System.out.println("SubArray 2 = "+arr2);
	}
}