import java.util.*;
public class Day41{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		for (int i=0;i<str.length() ; ) {
			if (i==0) {
				System.out.print(str.charAt(i));
				i++;
			}else{
				if (str.charAt(i)==str.charAt(i-1)) {
					while(i<str.length()&&(str.charAt(i)==str.charAt(i-1))){
						i++;
					}
				}else{
					System.out.print(str.charAt(i));
					i++;
				}
			}
		}
	}
}