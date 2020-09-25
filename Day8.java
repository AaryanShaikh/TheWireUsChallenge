import java.util.*;
public class Day8{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number of input Strings");
		int num = in.nextInt();
		in.nextLine();
		String str[] = new String[num];
		for (int i=0;i<num ;i++ ) {
			str[i] = in.nextLine();
		}
		System.out.println("Enter the Number of query Strings");
		int num2 = in.nextInt();
		in.nextLine();
		String str2[] = new String[num2];
		for (int i=0;i<num2 ;i++ ) {
			str2[i] = in.nextLine();
		}
		int count[] = new int[num2];
		int counter;
		for (int i=0;i<num2 ;i++ ) {
			counter = 1;
			for (int k=0;k<num ;k++ ) {
				if (str2[i].equals(str[k])) {
					count[i] = counter++; 
				}
			}
			System.out.println(count[i]);
		}
	}
}
