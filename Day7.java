import java.util.*;
public class Day7{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = in.nextLine().toLowerCase();
		String ch[] = new String[str.length()];
		int j=0;
		for (int i=0;i<str.length()-1 ;i++ ) {
			int count = 1;
			if (str.charAt(i)==str.charAt(i+1)) {
				ch[j++] = Character.toString(str.charAt(i));
				System.out.print(ch[j-1]);
				int k=i;
				while(str.charAt(k)==str.charAt(k+1)){
					count++;k++;i++;
					ch[j+1] = Integer.toString(count);
				}
				System.out.print(ch[j+1]);
				j++;
			}else{
				ch[j++] = Character.toString(str.charAt(i));
				System.out.print(ch[j-1]);
			}
		}
		System.out.print(str.charAt(str.length()-1));
	}
}
