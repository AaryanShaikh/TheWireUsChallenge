import java.util.*;
public class Day39{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Test Cases");
		int tc = in.nextInt();
		in.nextLine();
		System.out.println("Enter the "+tc+" numbers");
		String res = "";
		for (int i=0;i<tc ;i++ ) {
			String num = in.nextLine();
			if (num.equals(new StringBuffer(num).reverse().toString())) {
				res+="wins ";
			}else{
				res+="losses ";
			}
		}
		System.out.println(res);
	}
}
