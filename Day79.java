import java.util.*;
public class Day79{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int out[] = new int[in.nextInt()];
		in.nextLine();
		for (int j=0;j<out.length ;j++ ) {
			String str = in.nextLine();
			int count = 0;
			boolean check = false;
			for (int i=0;i<str.length() ;) {
				if (str.charAt(i)=='0') {
					int k=0;
					String str2 = "101";
					check = true;
					while(i<str.length()-1&&k<3){
						i++;
						if (str.charAt(i)==str2.charAt(k)) {
							k++;
						}else{
							check = false;
							break;
						}
					}
					if (i>=str.length()-1) {
						break;
					}
					if (check) {
						count++;
					}
				}else{
					int k=0;
					String str2 = "010";
					check = true;
					while(i<str.length()-1&&k<3){
						i++;
						if (str.charAt(i)==str2.charAt(k)) {
							k++;
						}else{
							check = false;
							break;
						}
					}
					if (i>=str.length()-1) {
						break;
					}
					if (check) {
						count++;
					}	
				}
			}
			out[j] = count;
		}
		System.out.println("Output");
		for (int i=0;i<out.length ;i++ ) {
			System.out.println(out[i]);
		}
	}
}