import java.util.*;
public class Day22{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String strs[] = str.split(" ");
		if (strs.length==1) {
			System.out.println("0");
		}else{
			System.out.println(strs[strs.length-1].length());
		}
	}
}
